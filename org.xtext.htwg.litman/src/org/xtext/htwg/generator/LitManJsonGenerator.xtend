package org.xtext.htwg.generator

import org.xtext.htwg.litMan.Book
import org.eclipse.emf.common.util.EList
import org.xtext.htwg.litMan.LitTypes
import org.xtext.htwg.litMan.JournalArticle
import java.util.List
import java.util.ArrayList

class LitManJsonGenerator {
    
    def createLiteratureList(EList<LitTypes> list) '''
        [
            «FOR lit:list SEPARATOR ","»
            {
                «IF lit instanceof Book» 
                "Title" : "«lit.title»",
                "Authors" : [
                            «FOR a:lit.authors.authors SEPARATOR ','» 
                                 {"Fistname" : "«a.firstname»", "LastName" : "«a.lastname»"}
                            «ENDFOR» 
                            ],
                "Pages" : "«lit.pages»",
                "Date" : "«lit.date»"
                «ELSEIF lit instanceof JournalArticle»
                    "Title" : "«lit.title»",
                    "Authors" : [
                                «FOR a:lit.authors.authors SEPARATOR ','» 
                                     {"Fistname" : "«a.firstname»", "LastName" : "«a.lastname»"}
                                «ENDFOR» 
                                ],
                    "Pages" : "«lit.pages»",
                    "Date" : "«lit.date»",
                    "Volume" : "«lit.volume»",
                    "Issue" : "«lit.issue»"
                «ENDIF»
            }
            «ENDFOR»
        ]
    '''
    
    
}