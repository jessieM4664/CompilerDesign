package slpinterpreter;

import slpinterpreter.grammar.*;

import static slpinterpreter.MaxArgs.maxargs;

public class Interpreter {
    static void interp(Stm s) throws Exception {
        maxargs(s);
        Table t1 = interpStm(s, null);
    }

    static Table interpStm(Stm s, Table t) {
        if (s instanceof CompoundStm) {
            Table t1 = interpStm(((CompoundStm) s).stm1, t);
            return interpStm(((CompoundStm) s).stm2, t1);
        } else if (s instanceof AssignStm) {
            IntAndTable IAT = interpExp(((AssignStm) s).exp, t);
            return new Table((((AssignStm) s).id), IAT.i, IAT.t);
        } else {
            return helperPrint(((PrintStm) s).exps, t);
        }
    }

    static IntAndTable interpExp(Exp e, Table t) {
        if (e instanceof IdExp) {
            return new IntAndTable(t.lookUp(((IdExp) e).id), t);
        } else if (e instanceof NumExp) {
            return new IntAndTable(pullNumExp(e), t);
        } else if (e instanceof OpExp) {
            return readOp((((OpExp) e).left), (((OpExp) e).oper), (((OpExp) e).right), t);
        } else {
            Table nT = interpStm(((EseqExp) e).stm, t);
            return interpExp(((EseqExp) e).exp, nT);
        }
    }

    static int pullNumExp(Exp e) {
        return ((NumExp) e).num;
    }

    static IntAndTable readOp(Exp l, int Op, Exp r, Table t) {//break into smaller cases
        IntAndTable it1 = interpExp(l, t);
        IntAndTable it2 = interpExp(r, it1.t);
        if (Op == 1) {
            return new IntAndTable(it1.i + it2.i, it2.t);
        } else if (Op == 2) {
            return new IntAndTable(it1.i - it2.i, it2.t);
        } else if (Op == 3) {
            return new IntAndTable(it1.i * it2.i, it2.t);
        } else {
            return new IntAndTable(it1.i / it2.i, it2.t);
        }
    }

    static Table helperPrint(ExpList el, Table t) {
        if (el instanceof PairExpList) {
            IntAndTable it = interpExp(((PairExpList) el).head, t);
            System.out.print(it.i + " ");
            return helperPrint(((PairExpList) el).tail, it.t);
        } else {
            IntAndTable it = interpExp(((LastExpList) el).head, t);
            System.out.println(it.i);
            return it.t;
        }
    }
}
