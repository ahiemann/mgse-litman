/*
 * generated by Xtext 2.21.0
 */
package org.xtext.htwg.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.htwg.litMan.LitTypes
import org.xtext.htwg.litMan.Book
import org.xtext.htwg.litMan.LitMan
import org.eclipse.emf.common.util.EList
import org.xtext.htwg.litMan.JournalArticle
import java.nio.file.Paths
import java.util.logging.Logger

import org.xtext.htwg.generator.LitManBibTexGenerator;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class LitManGenerator extends AbstractGenerator {
    
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
	    val litMan = resource.contents.head as LitMan
	    val fileName = resource.URI.trimFileExtension.lastSegment 


        // Format Generations	    
	    val jsonGenerator = new LitManJsonGenerator()
		fsa.generateFile(
			fileName + ".json", 
			jsonGenerator.createLiteratureList(litMan.literatur)
		)
		
		val bibTexGenerator = new LitManBibTexGenerator()
		fsa.generateFile(
			fileName + ".bib", 
			bibTexGenerator.createLiteratureList(litMan.literatur)
		)
	}
}
