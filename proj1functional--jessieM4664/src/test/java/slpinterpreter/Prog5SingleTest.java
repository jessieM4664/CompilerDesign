package slpinterpreter;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;
import slpinterpreter.grammar.Stm;
import org.junit.Test;
import static org.junit.Assert.fail;
import slpinterpreter.Interpreter;
import slpinterpreter.grammar.AssignStm;
import slpinterpreter.grammar.EseqExp;
import slpinterpreter.grammar.LastExpList;
import slpinterpreter.grammar.NumExp;
import slpinterpreter.grammar.PairExpList;
import slpinterpreter.grammar.PrintStm;

/**
 *
 * @author richardburns
 */
public class Prog5SingleTest {

    static Stm probToRun = new AssignStm("b",
                    new EseqExp(
                            new PrintStm(
                                    new PairExpList(new NumExp(10),
                                            new PairExpList(new NumExp(9),
                                                    new PairExpList(new NumExp(8),
                                                            new LastExpList(
                                                                    new EseqExp(
                                                                            new AssignStm("c",
                                                                                    new EseqExp(
                                                                                            new PrintStm(
                                                                                                    new PairExpList(new NumExp(11),
                                                                                                            new PairExpList(new NumExp(10),
                                                                                                                    new PairExpList(new NumExp(9),
                                                                                                                            new PairExpList(new NumExp(8),
                                                                                                                                    new LastExpList(new NumExp(7))))))
                                                                                            ),
                                                                                            new NumExp(6)
                                                                                    )
                                                                            ),
                                                                            new NumExp(5)
                                                                    )
                                                            ))))
                            ),
                            new NumExp(3)
                    )
            );
    
    @Test
    public void evaluatesMaxArgs() {
        try {
            int correct = 5;
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
            String correct = "10 9 8 11 10 9 8 7"+System.getProperty("line.separator")+
                             "5";
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
