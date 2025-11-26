package session10.visitors;

import session10.mathexpression.MathExpression;
import session10.mathexpression.Node;

import java.util.Scanner;

/**
 * Exercise: Create a new vistor for counting the number of integers in a mathematical expression.
 *  For example, for the input "3 + 2 + 1 + 5= ", you should get:
 *      "Number of integers = 4"
 */
public class B_ExerciseCountIntegers {
    public static void main(String[] args) {

        System.out.println("Enter the math expression (e.g., 3 + 2 = )");
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        System.out.println();
        //We create the object
        MathExpression mathExpression = new MathExpression();
        mathExpression.parse(line);

        System.out.println("Printing the parsed expression:");
        System.out.println(mathExpression);
        System.out.println();
        System.out.println();

        System.out.println("Counting the number of operations: ");

        Visitor visitor = new CountIntegersVisitor();
        for (Node node: mathExpression){
            visitor.visit(node);
        }

        System.out.println(visitor);

        /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/
        /*
        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session10_B", I_did_finish, I_did_understand, comment);
        */
    }
}
