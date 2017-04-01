package application.model;


import java.io.*;
import java.nio.file.*;
import java.util.Arrays;
import org.antlr.v4.runtime.*;
import java.nio.charset.Charset;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class ThrowingErrorListener extends BaseErrorListener
{
	// public static final ThrowingErrorListener INSTANCE = new ThrowingErrorListener();

	private static String newline = System.getProperty("line.separator");

    private String errorMsg = "Syntax errors:";

    Path file = Paths.get("ErrorLog_Syntax.log");
    boolean syntaxErrorExists = false; 
    /**
     * @param errorMsg
     * @param file
     */
    public ThrowingErrorListener()
    {
        String errorMsg = "Errores Sintacticos: ";

        file = Paths.get("ErrorLog_Syntax.log");
    }

    @Override
    public void syntaxError(
      Recognizer<?, ?> recognizer,
      Object offendingSymbol,
      int line,
      int charPositionInLine,
      String msg,
      RecognitionException e
    ) {
        // Here I'm gonna create a file to keep all errors.
        errorMsg = errorMsg
            + newline
            + "Ocurrio un Error! - Revisar la linea "
            + line
            + "\n El caracter número "
            + charPositionInLine
            + " "
            + msg;

        writeErrors(errorMsg, file);
    }

    private void writeErrors(String msg, Path file) {
        try {
            //Files.deleteIfExists(file);
            Files.write(file, Arrays.asList(msg), Charset.forName("UTF-8"));
        } catch (IOException e) {
            System.err.println("Something is wrong.");
        }
    }
    
    public boolean getSyntaxErrorExists(){
    	return this.syntaxErrorExists;
    }
}