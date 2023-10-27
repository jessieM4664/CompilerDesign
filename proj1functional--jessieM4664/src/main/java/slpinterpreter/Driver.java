package slpinterpreter;

import slpinterpreter.grammar.MaxArgs;
import slpinterpreter.grammar.Stm;
import slpinterpreter.grammar.AssignStm;
import slpinterpreter.grammar.NumExp;

/**
 * Driver. 
 * 
 * @author richardburns
 */

public class Driver {

    public static void main(String[] args) throws Exception {
        Stm probToRun = new AssignStm("a", new NumExp(10));
                
        System.out.println("Maxargs: ");
        System.out.println(MaxArgs.maxargs(probToRun));   // functional
        
        System.out.println("Interpreted Result:");
        Interpreter.interp(probToRun);                    // functional


    }
    
}
