package session10.advanceVisitor.mathexpression;

import session10.advanceVisitor.visitors.Visitor;

public class SubtractionNode extends OperationNode {

    public SubtractionNode(String string) {
        super(string);
    }

    @Override
    public int apply(int a, int b) {
        return a - b;
    }

    public static boolean detectNode(String string){
        if (string.equals("-"))
            return true;
        else
            return false;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this); // Calls visitor.visit(SubtractionNode)
    }

    @Override
    public String toString() {
        return "SubstractionNode{" +
                string +
                '}';
    }
}
