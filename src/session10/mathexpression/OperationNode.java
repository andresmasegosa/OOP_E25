package session10.mathexpression;

public abstract class OperationNode extends Node {

    public OperationNode(String string) {
        super(string);
    }

    public abstract int apply(int result, int currentInteger);
}
