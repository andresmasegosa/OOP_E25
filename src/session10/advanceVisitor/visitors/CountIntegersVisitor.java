package session10.advanceVisitor.visitors;


import session10.advanceVisitor.mathexpression.EqualNode;
import session10.advanceVisitor.mathexpression.IntegerNode;
import session10.advanceVisitor.mathexpression.OperationNode;

public class CountIntegersVisitor implements Visitor {

    private int numberOfIntegers = 0;


    @Override
    public void visit(IntegerNode node) {
        numberOfIntegers++;
    }

    @Override
    public String toString() {
        return "CountOperations{" +
                "numberOfSumOperations=" + numberOfIntegers +
                '}';
    }
}