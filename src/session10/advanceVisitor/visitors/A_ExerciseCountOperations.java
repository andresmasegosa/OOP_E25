package session10.advanceVisitor.visitors;

import session10.advanceVisitor.mathexpression.MathExpression;
import session10.advanceVisitor.mathexpression.Node;

import java.util.Scanner;

/**
 * ### Exercise: Implement the Visitor Pattern to Count Operations in Mathematical Expressions
 *
 * **Objective:** Use the Visitor design pattern to count the number of operations in a mathematical expression. For example, for the expression `2 + 3 + 5 + 1 =`, the output must be `3` (as there are three addition operations).
 */
public class A_ExerciseCountOperations {
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

        Visitor visitor = new CountOperationsVisitor();
        for (Node node: mathExpression){
            node.accept(visitor);
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

        feedback.Feedback.submit("session10_A", I_did_finish, I_did_understand, comment);
        */
    }
}
