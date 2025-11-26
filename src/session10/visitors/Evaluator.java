package session10.visitors;

import session10.mathexpression.IntegerNode;
import session10.mathexpression.Node;
import session10.mathexpression.SubtractionNode;
import session10.mathexpression.SumNode;

public class Evaluator implements Visitor {

    int result;
    Node lastOperation;

    public Evaluator() {
        result = 0;
        lastOperation = null;
    }

    @Override
    public void visit(Element node) {
        if (node instanceof SumNode || node instanceof SubtractionNode) {
            this.lastOperation = (Node) node;
        }else if (node instanceof IntegerNode && this.lastOperation == null) {
            this.result = ((IntegerNode) node).getIntValue();
        } else if (node instanceof IntegerNode && this.lastOperation != null) {
            if (this.lastOperation instanceof SumNode)
                this.result = this.result + ((IntegerNode) node).getIntValue();
            else
                this.result = this.result - ((IntegerNode) node).getIntValue();
        }

    }

    @Override
    public String toString() {
        return "Evaluator{" +
                "result=" + result +
                '}';
    }
}
