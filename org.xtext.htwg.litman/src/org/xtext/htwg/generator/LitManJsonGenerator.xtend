package org.xtext.htwg.generator

import org.xtext.htwg.litMan.Book
import org.eclipse.emf.common.util.EList
import org.xtext.htwg.litMan.LitTypes
import org.xtext.htwg.litMan.JournalArticle
import org.xtext.htwg.litMan.PrintType
import org.xtext.htwg.litMan.Website

class LitManJsonGenerator {
    
    def createLiteratureList(EList<LitTypes> list) {
        var json = '''
        [
            «FOR lit:list SEPARATOR ","»
            {
            	"Title" : "«lit.title»",
                "Authors" : [
                «FOR a:lit.authors.authors SEPARATOR ','» 
                {"Fistname" : "«a.firstname»", "LastName" : "«a.lastname»"}
                «ENDFOR» 
                ],
                «IF lit instanceof PrintType»
                "Date" : "«lit.date»",
                «ENDIF» 
                «IF lit instanceof Book»
                "Publisher" : "«lit.publisher»",
                «ENDIF»
                «IF lit instanceof JournalArticle»
                "Journal" : "«lit.journal»",
                "Pages" : "«lit.pages»",
                "Volume" : "«lit.volume»",
                "Issue" : "«lit.issue»",
                «ENDIF»
                «IF lit instanceof Website»
                 "Url" : "«lit.url»,
                «ENDIF»
            }
            «ENDFOR»
        ]
        '''
        
        json = json.replaceAll(",\r?\n(\\s*)}", "\n$1}")
        json
    }
}