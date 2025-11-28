package session10.visitors;

import session10.mathexpression.IntegerNode;

public class CountIntegersVisitor implements Visitor {

    int numberOfIntegers =0;

    @Override
    public void visit(Element node) {
        if (node instanceof IntegerNode){
            numberOfIntegers++;
        }
    }

    @Override
    public String toString() {
        return "CountIntegersVisitor{" +
                "numberOfSumIntegers=" + numberOfIntegers +
                '}';
    }
}
