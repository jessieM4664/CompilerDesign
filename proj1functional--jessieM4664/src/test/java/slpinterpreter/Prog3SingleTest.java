package slpinterpreter;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;
import slpinterpreter.grammar.Stm;
import org.junit.Test;
import static org.junit.Assert.fail;
import slpinterpreter.Interpreter;
import slpinterpreter.grammar.LastExpList;
import slpinterpreter.grammar.NumExp;
import slpinterpreter.grammar.PrintStm;

/**
 *
 * @author richardburns
 */
public class Prog3SingleTest {

    static Stm probToRun = new PrintStm(new LastExpList(new NumExp(5)));
    
    @Test
    public void evaluatesMaxArgs() {
        try {
            int maxargs = MaxArgs.maxargs(probToRun);
            int correct = 1;
            assertEquals(correct, maxargs);
        } catch (Exception e) {
            fail(e.toString());
        }
    }
        
    
    @Test
    public void evaluatesInterpreter() {
        // Create a stream to hold the output
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        // save the old System.out
        PrintStream old = System.out;
        // assign new special stream
        System.setOut(ps);
        try {
            Interpreter.interp(probToRun);
            String correct = "5";
            assertEquals(baos.toString().trim(), correct.trim());            
        } catch (Exception e) {
            fail(e.toString());
        } finally {
            // restore normal System.output operation
            System.out.flush();
            System.setOut(old);            
        } 
    }
    


}
