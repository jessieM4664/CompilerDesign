package slpinterpreter;

import slpinterpreter.grammar.*;

public class MaxArgs {
    public static int maxargs(Stm s) throws Exception {
        if(s instanceof CompoundStm){
            return Math.max(maxargs(((CompoundStm)s).stm1), maxargs(((CompoundStm)s).stm2));
        }
        else if(s instanceof AssignStm){
            return maxargs(((AssignStm)s).exp);
        }
        else if(s instanceof PrintStm){
            return Math.max(printNum((((PrintStm)s).exps)), maxargs(((PrintStm)s).exps));
        }
        return 0;
    }

    static int maxargs(Exp e) throws Exception {
        if (e instanceof IdExp) {
            return 0;
        } else if (e instanceof NumExp) {
            return 0; // returns this method
        } else if (e instanceof OpExp) {
            return Math.max(maxargs(((OpExp) e).left), maxargs(((OpExp) e).right));
        } else if (e instanceof EseqExp) {
            return Math.max(maxargs(((EseqExp) e).exp), maxargs(((EseqExp) e).stm));
        }
        return 0;
    }
    static int maxargs(ExpList el) throws Exception {
        if(el instanceof PairExpList){
            return  Math.max(maxargs(((PairExpList)el).head), maxargs(((PairExpList)el).tail));
        }
        else if (el instanceof LastExpList){
            return maxargs(((LastExpList)el).head);
        }
        return 0;
    }
    static int printNum(ExpList el) {
        if(el instanceof PairExpList){
            return 1 + printNum(((PairExpList)el).tail);
        }
        else {
            return 1;
        }
    }
}
