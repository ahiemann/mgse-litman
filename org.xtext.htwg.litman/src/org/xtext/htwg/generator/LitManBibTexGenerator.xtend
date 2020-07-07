package org.xtext.htwg.generator

import org.xtext.htwg.litMan.Book
import org.eclipse.emf.common.util.EList
import org.xtext.htwg.litMan.LitTypes
import org.xtext.htwg.litMan.JournalArticle
import java.util.ArrayList
import org.xtext.htwg.litMan.PrintType
import org.xtext.htwg.litMan.Website

class LitManBibTexGenerator {
    // list of unique literature keys that were generated
    var idKeys = new ArrayList<String>()
    
    def createLiteratureList(EList<LitTypes> list) {
        
        var bibtex = '''
        «FOR lit:list»
            @«getTypeName(lit)»{«getUniqueBibtexKey(lit)»,
                title = {«lit.title»},
                author = {«FOR a:lit.authors.authors SEPARATOR ' and '»«a.lastname», «a.firstname»«ENDFOR»},
                «IF lit.date !== null »
                year = {«getYearFromDate(lit.date)»},
                month = {«getMonthFromDate(lit.date)»},
                «ENDIF»
                «IF lit instanceof PrintType»
                pages = {«lit.pages»},
                «IF lit.year !== null »year = {«lit.year»},«ENDIF»
                «ENDIF»
                «IF lit instanceof JournalArticle»
                volume = {«lit.volume»},
                number = {«lit.issue»},
                «ENDIF»
                «IF lit instanceof Website»
                url = {«lit.url»},
                «ENDIF»
            }
        «ENDFOR»
       '''
        
       // remove unnecessary commas after the last attribute
       bibtex = bibtex.replaceAll(",\r?(\\s*)\n}", "\n$1}")
        
       bibtex
    }
    
    
    // Create unique key for literature
    def private getUniqueBibtexKey(LitTypes t) {
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
   def private getTypeName(LitTypes t) {
        if (t instanceof Book)
            "book"
        else if (t instanceof JournalArticle)
            "article"
        else
            "misc"
   }
   
   def private getYearFromDate(String date) {
       return date.substring(6);
   }
   
   def private getMonthFromDate(String date) {
       val month = date.substring(3, 5);
       switch (month) {
           case "01":
            "Jan"
            case "02":
            "Feb"
            case "03":
            "Mar"
            case "04":
            "Apr"
            case "05":
            "May"
            case "06":
            "June"
            case "07":
            "July"
            case "08":
            "Aug"
            case "09":
            "Sept"
            case "10":
            "Oct"
            case "11":
            "Nov"
            case "12":
            "Dec"
            default:
            "Unsupported month format"
       }
   }
}