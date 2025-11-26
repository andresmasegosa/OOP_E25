package session10.mathexpression;

import session10.visitors.Element;
import session10.visitors.Visitor;

public abstract class Node implements Element {
    protected String string;

    public Node(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    @Override
    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}