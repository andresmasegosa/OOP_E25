package session10.advanceVisitor.visitors;


import session10.advanceVisitor.mathexpression.*;

public class CountOperationsVisitor implements Visitor {

    private int numberOfOperations = 0;


    // Specific method for OperationNode
    @Override
    public void visit(OperationNode node) {
        numberOfOperations++;
    }
    @Override
    public String toString() {
        return "CountOperations{" +
                "numberOfSumOperations=" + numberOfOperations +
                '}';
    }
}