package org.xtext.htwg.generator

import org.xtext.htwg.litMan.Book
import org.eclipse.emf.common.util.EList
import org.xtext.htwg.litMan.LitTypes
import org.xtext.htwg.litMan.JournalArticle
import java.util.List
import java.util.ArrayList

class LitManBibTexGenerator {
    // list of unique literature keys that were generated
    var idKeys = new ArrayList<String>()
    
    def createLiteratureList(EList<LitTypes> list) {
        
        var bibtex = '''
        «FOR lit:list»
            @«getTypeName(lit)»{«getUniqueBibtexKey(lit)»,
            «IF lit instanceof Book || lit instanceof JournalArticle»
                title = {«lit.title»},
                author = {«FOR a:lit.authors.authors SEPARATOR ' and '»«a.lastname», «a.firstname»«ENDFOR»},
                pages = {«lit.pages»},
                year = {«lit.date»},
            «ENDIF»
            «IF lit instanceof JournalArticle»
                volume = {«lit.volume»},
                number = {«lit.issue»},
            «ENDIF»
            }
        «ENDFOR»
       '''
        
       // remove unnecessary commas after the last attribute
       bibtex = bibtex.replaceAll(",\r?(\\s*)\n}", "\n$1}")
        
       bibtex
    } 
    
    
    // Create unique key for literature
    def getUniqueBibtexKey(LitTypes t) {
        var basisKey = ""
        if (t.authors.authors.length > 0) {
           basisKey += t.authors.authors.get(0).lastname    
        }
        else {
            basisKey += t.title.substring(0, 4)
        }
        if (t.date !== null) {
            basisKey += '''.«t.date»'''
        }
        
        // no spaces allowed for key
        basisKey.replaceAll(" ", "_")
        
        // check if the same key already was used
        // for another literature. If so, try to create
        // a unique one by appending a number to it
        var i = 1
        var uniqueKey = basisKey
        while (idKeys.contains(uniqueKey)) {
            uniqueKey = '''«basisKey»-«i»'''
            i++
        }
        // add the new unique key to the list of keys
        idKeys.add(uniqueKey)
        
        uniqueKey
   }
        
   // Helper method for getting the BibTex type name for the
   // LitMan Type
   def getTypeName(LitTypes t) {
        if (t instanceof Book)
            "book"
        else if (t instanceof JournalArticle)
            "article"
        else
            "misc"
   }
}