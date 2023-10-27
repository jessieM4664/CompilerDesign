package slpinterpreter;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;
import slpinterpreter.grammar.Stm;
import org.junit.Test;
import static org.junit.Assert.fail;
import slpinterpreter.Interpreter;
import slpinterpreter.grammar.AssignStm;
import slpinterpreter.grammar.CompoundStm;
import slpinterpreter.grammar.IdExp;
import slpinterpreter.grammar.LastExpList;
import slpinterpreter.grammar.NumExp;
import slpinterpreter.grammar.OpExp;
import slpinterpreter.grammar.PrintStm;

/**
 *
 * @author richardburns
 */
public class Prog4SingleTest {

    static Stm probToRun = new CompoundStm(
                    new AssignStm("a", new OpExp(new NumExp(5),
                                    OpExp.Plus,
                                    new NumExp(3))),
                    new PrintStm(new LastExpList(new IdExp("a"))));
    
    @Test
    public void evaluatesMaxArgs() {
        try {
        int correct = 1;
        int maxargs = MaxArgs.maxargs(probToRun);
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
            String correct = "8";
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
