package session10.advanceVisitor.mathexpression;

import session10.advanceVisitor.visitors.Visitor;

public class EqualNode extends Node{
    public EqualNode(String string) {
        super(string);
    }

    public static boolean detectNode(String string){
        if (string.equals("="))
            return true;
        else
            return false;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this); // Calls visitor.visit(EqualNode)
    }

    @Override
    public String toString() {
        return "EqualNode{" +
                string +
                '}';
    }
}
