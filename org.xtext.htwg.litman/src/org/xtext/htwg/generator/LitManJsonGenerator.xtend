package org.xtext.htwg.generator

import org.xtext.htwg.litMan.Book
import org.eclipse.emf.common.util.EList
import org.xtext.htwg.litMan.LitTypes
import org.xtext.htwg.litMan.JournalArticle
import org.xtext.htwg.litMan.PrintType

class LitManJsonGenerator {
    
    def createLiteratureList(EList<LitTypes> list) {
        var json = '''
        [
            «FOR lit:list SEPARATOR ","»
            {
                «IF lit instanceof PrintType»
                "Title" : "«lit.title»",
                "Authors" : [
                «FOR a:lit.authors.authors SEPARATOR ','» 
                     {"Fistname" : "«a.firstname»", "LastName" : "«a.lastname»"}
                «ENDFOR» 
                ],
                "Pages" : "«lit.pages»",
                "Date" : "«lit.date»",
                «ENDIF» 
                «IF lit instanceof JournalArticle»
                "Volume" : "«lit.volume»",
                "Issue" : "«lit.issue»",
                «ENDIF»
            }
            «ENDFOR»
        ]
        '''
        
        json = json.replaceAll(",\r?\n(\\s*)}", "\n$1}")
        json
    }
}