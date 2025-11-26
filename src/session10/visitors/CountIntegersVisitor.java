package session10.visitors;

import session10.mathexpression.IntegerNode;
import session10.mathexpression.SumNode;

public class CountIntegersVisitor implements Visitor {

    int numberOfSumIntegers=0;

    @Override
    public void visit(Element node) {
        if (node instanceof IntegerNode){
            numberOfSumIntegers++;
        }
    }

    @Override
    public String toString() {
        return "CountIntegersVisitor{" +
                "numberOfSumIntegers=" + numberOfSumIntegers +
                '}';
    }
}
