/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pbpParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;
import antlrParsers.BBRLexer;

/**
 *
 * @author anthony
 */
public class PBPParser 
{
    public Tree parse(ANTLRInputStream input)
    {
        antlrParsers.BBRLexer lex = new BBRLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        tokens.fill();
        List<Token> tokenList = tokens.getTokens();
        String tokenString = "";
        
        for(Token t : tokenList) tokenString +=  t.getText() + "\n";
        
        System.out.println(tokenString);
        
        return null;
    }
}
