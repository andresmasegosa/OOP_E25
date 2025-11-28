package session10.advanceVisitor.mathexpression;

public class NodeFactory {

    // Centralized logic for creating nodes
    public static Node createNode(String token) {
        if (SumNode.detectNode(token)) {
            return new SumNode(token);
        } else if (SubtractionNode.detectNode(token)) {
            return new SubtractionNode(token);
        } else if (EqualNode.detectNode(token)) {
            return new EqualNode(token);
        } else if (IntegerNode.detectNode(token)) {
            return new IntegerNode(token);
        }

        throw new IllegalArgumentException("Unknown expression token: " + token);
    }
}