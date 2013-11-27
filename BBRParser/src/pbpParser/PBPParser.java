/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pbpParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import antlrParsers.*;
import java.util.*;

/**
 *
 * @author anthony
 */
public class PBPParser 
{
    public Tree parse(ANTLRInputStream input)
    {
        BBRLexer lexer = new BBRLexer(input);
        List<Token> tokens = lexer.getAllTokens();
        String tokenString = "";
        
        for(Token t : tokens) tokenString += t.getText();
        
        System.out.println(tokenString);
        
        return null;
    }
}
