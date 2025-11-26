package session10.mathexpression;

public class SumNode extends OperationNode{

    public SumNode(String string) {
        super(string);
    }

    @Override
    public int apply(int result, int currentInteger) {
        return result + currentInteger;
    }

    public static boolean detectNode(String string){
        if (string.equals("+"))
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "SumNode{" +
                string +
                '}';
    }
}
