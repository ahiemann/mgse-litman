/**
 * generated by Xtext 2.21.0
 */
package org.xtext.htwg.generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.htwg.litMan.Author;
import org.xtext.htwg.litMan.Book;
import org.xtext.htwg.litMan.JournalArticle;
import org.xtext.htwg.litMan.LitMan;
import org.xtext.htwg.litMan.LitTypes;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class LitManGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    final LitMan litMan = ((LitMan) _head);
    final String fileName = resource.getURI().trimFileExtension().lastSegment();
    fsa.generateFile((fileName + ".json"), this.createLiteraturListJSON(litMan.getLiteratur()));
  }
  
  public CharSequence createLiteraturListJSON(final EList<LitTypes> list) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("[");
    _builder.newLine();
    {
      boolean _hasElements = false;
      for(final LitTypes lit : list) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "    ");
        }
        _builder.append("    ");
        _builder.append("{");
        _builder.newLine();
        {
          if ((lit instanceof Book)) {
            _builder.append("    ");
            _builder.append("    ");
            _builder.append("\"Title\" : \"");
            String _title = ((Book)lit).getTitle();
            _builder.append(_title, "        ");
            _builder.append("\",");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append("    ");
            _builder.append("\"Authors\" : [");
            _builder.newLine();
            {
              EList<Author> _authors = ((Book)lit).getAuthors().getAuthors();
              boolean _hasElements_1 = false;
              for(final Author a : _authors) {
                if (!_hasElements_1) {
                  _hasElements_1 = true;
                } else {
                  _builder.appendImmediate(",", "                    ");
                }
                _builder.append("    ");
                _builder.append("    ");
                _builder.append("            ");
                _builder.append("{\"Fistname\" : \"");
                String _firstname = a.getFirstname();
                _builder.append(_firstname, "                    ");
                _builder.append("\", \"LastName\" : \"");
                String _lastname = a.getLastname();
                _builder.append(_lastname, "                    ");
                _builder.append("\"}");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("    ");
            _builder.append("    ");
            _builder.append("            ");
            _builder.append("],");
            _builder.newLine();
            _builder.append("    ");
            _builder.append("    ");
            _builder.append("\"Pages\" : \"");
            String _pages = ((Book)lit).getPages();
            _builder.append(_pages, "        ");
            _builder.append("\",");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append("    ");
            _builder.append("\"Date\" : \"");
            String _date = ((Book)lit).getDate();
            _builder.append(_date, "        ");
            _builder.append("\"");
            _builder.newLineIfNotEmpty();
          } else {
            if ((lit instanceof JournalArticle)) {
              _builder.append("    ");
              _builder.append("    ");
              _builder.append("\"Title\" : \"");
              String _title_1 = ((JournalArticle)lit).getTitle();
              _builder.append(_title_1, "        ");
              _builder.append("\",");
              _builder.newLineIfNotEmpty();
              _builder.append("    ");
              _builder.append("    ");
              _builder.append("\"Authors\" : [");
              _builder.newLine();
              {
                EList<Author> _authors_1 = ((JournalArticle)lit).getAuthors().getAuthors();
                boolean _hasElements_2 = false;
                for(final Author a_1 : _authors_1) {
                  if (!_hasElements_2) {
                    _hasElements_2 = true;
                  } else {
                    _builder.appendImmediate(",", "                    ");
                  }
                  _builder.append("    ");
                  _builder.append("    ");
                  _builder.append("            ");
                  _builder.append("{\"Fistname\" : \"");
                  String _firstname_1 = a_1.getFirstname();
                  _builder.append(_firstname_1, "                    ");
                  _builder.append("\", \"LastName\" : \"");
                  String _lastname_1 = a_1.getLastname();
                  _builder.append(_lastname_1, "                    ");
                  _builder.append("\"}");
                  _builder.newLineIfNotEmpty();
                }
              }
              _builder.append("    ");
              _builder.append("    ");
              _builder.append("            ");
              _builder.append("],");
              _builder.newLine();
              _builder.append("    ");
              _builder.append("    ");
              _builder.append("\"Pages\" : \"");
              String _pages_1 = ((JournalArticle)lit).getPages();
              _builder.append(_pages_1, "        ");
              _builder.append("\",");
              _builder.newLineIfNotEmpty();
              _builder.append("    ");
              _builder.append("    ");
              _builder.append("\"Date\" : \"");
              String _date_1 = ((JournalArticle)lit).getDate();
              _builder.append(_date_1, "        ");
              _builder.append("\",");
              _builder.newLineIfNotEmpty();
              _builder.append("    ");
              _builder.append("    ");
              _builder.append("\"Volume\" : \"");
              int _volume = ((JournalArticle)lit).getVolume();
              _builder.append(_volume, "        ");
              _builder.append("\",");
              _builder.newLineIfNotEmpty();
              _builder.append("    ");
              _builder.append("    ");
              _builder.append("\"Issue\" : \"");
              int _issue = ((JournalArticle)lit).getIssue();
              _builder.append(_issue, "        ");
              _builder.append("\"");
              _builder.newLineIfNotEmpty();
            }
          }
        }
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("]");
    _builder.newLine();
    return _builder;
  }
}
