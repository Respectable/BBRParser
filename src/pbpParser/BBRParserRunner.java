/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pbpParser;
import java.io.*;
import pbpParser.PBPParser;
import org.antlr.v4.runtime.*;
/**
 *
 * @author anthony
 */
public class BBRParserRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        File file = new File(args[0]);
        BufferedReader reader = null;
        
        try 
        {
            reader = new BufferedReader(new FileReader(file));
            String currentLine = null;
            String allLines = "";
            
            while ((currentLine = reader.readLine()) != null)
            {
                allLines += currentLine;
            }
            
            PBPParser parser = new PBPParser();
            InputStream i = new ByteArrayInputStream(allLines.getBytes("UTF-8"));
            parser.parse(new ANTLRInputStream(i));
            
        } 
        catch (IOException x) 
        {
            System.err.format("IOException: %s%n", x);
        }
        finally
        {
            try
            {
                if (reader != null)
                {
                    reader.close();
                }
            }
            catch (IOException e)
            {
                
            }
        }
    }
}
