package session10.mathexpression;

public class SubtractionNode extends OperationNode {

    public SubtractionNode(String string) {
        super(string);
    }

    @Override
    public int apply(int result, int currentInteger) {
        return result - currentInteger;
    }

    public static boolean detectNode(String string){
        if (string.equals("-"))
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "SubstractionNode{" +
                string +
                '}';
    }
}
