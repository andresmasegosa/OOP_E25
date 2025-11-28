package session10.advanceVisitor.mathexpression;

import session10.advanceVisitor.visitors.Visitor;

public class SumNode extends OperationNode{

    public SumNode(String string) {
        super(string);
    }

    @Override
    public int apply(int a, int b) {
        return a + b;
    }

    public static boolean detectNode(String string){
        if (string.equals("+"))
            return true;
        else
            return false;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this); // Calls visitor.visit(SumNode)
    }

    @Override
    public String toString() {
        return "SumNode{" +
                string +
                '}';
    }
}
