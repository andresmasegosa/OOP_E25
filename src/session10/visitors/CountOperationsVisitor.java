package session10.visitors;

import session10.mathexpression.IntegerNode;
import session10.mathexpression.SubtractionNode;
import session10.mathexpression.SumNode;

public class CountOperationsVisitor implements Visitor{

    private int numberOfOperations=0;

    @Override
    public void visit(Element node) {
        if (node instanceof SumNode || node instanceof SubtractionNode){
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
