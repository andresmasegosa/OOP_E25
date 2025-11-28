package session10.advanceVisitor.visitors;

import session10.advanceVisitor.mathexpression.*;


public class Evaluator implements Visitor {

    private int result = 0;

    // We store the current strategy object instead of a String
    private OperationNode currentOperation;

    public Evaluator() {
        // Default strategy: If the expression starts with a number (e.g., "3 +..."),
        // we treat it as "0 + 3". So we need a default SumNode logic.
        this.currentOperation = new SumNode("+");
    }

    public int getResult() {
        return result;
    }

    @Override
    public void visit(IntegerNode node) {
        // POLYMORPHISM IN ACTION:
        // We don't care if it's sum, subtract, multiply, etc.
        // We just ask the current operation to "apply" itself.
        result = currentOperation.apply(result, node.getIntValue());
    }

    @Override
    public void visit(OperationNode node) {
        this.currentOperation = node; // Switch strategy to Addition
    }

}