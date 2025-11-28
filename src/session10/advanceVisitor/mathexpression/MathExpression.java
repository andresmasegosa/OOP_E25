package session10.advanceVisitor.mathexpression;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MathExpression implements Iterable<Node> {

    private List<Node> nodeList;

    public MathExpression() {
        this.nodeList = new LinkedList<>();;
    }

    public void parse(String string){
       string = string.trim();
        for (String stringPart : string.split(" ")){
            Node node = NodeFactory.createNode(stringPart);
            nodeList.add(node);
        }
    }

    public List<Node> getNodeList() {
        return nodeList;
    }

    @Override
    public Iterator<Node> iterator() {
        return this.nodeList.iterator();
    }

    @Override
    public String toString() {
        String output = "MathExpression{ ";

        for (Node node: nodeList) {
            output += node.toString();
            output += " : ";
        }

        output+=" }";
        return  output;
    }

}
