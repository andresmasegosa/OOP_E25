package session10.visitors;

import session10.mathexpression.OperationNode;

public class CountOperationsVisitor implements Visitor{

    private int numberOfOperations=0;

    @Override
    public void visit(Element node) {
        if (node instanceof OperationNode){
            numberOfOperations++;
        }
    }

    @Override
    public String toString() {
        return "CountOperations{" +
                "numberOfOperations=" + numberOfOperations +
                '}';
    }
}
