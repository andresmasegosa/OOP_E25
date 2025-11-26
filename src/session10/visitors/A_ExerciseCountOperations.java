package session10.visitors;

import session10.mathexpression.MathExpression;
import session10.mathexpression.Node;

import java.util.Scanner;

/**
 * ### Exercise: Implement the Visitor Pattern to Count Operations in Mathematical Expressions
 *
 * **Objective:** Use the Visitor design pattern to count the number of operations in a mathematical expression. For example, for the expression `2 + 3 + 5 + 1 =`, the output must be `3` (as there are three addition operations).
 *
 * ---
 *
 * #### **Instructions**
 *
 * 1. **Create the `Visitor` Interface**
 *    - **Purpose:** The `Visitor` interface is the backbone of the Visitor design pattern. It defines a set of methods corresponding to the elements in the object structure that will be visited.
 *    - **Steps:**
 *      - Define the `Visitor` interface in your project.
 *      - Add a method `visit(Node node)` that all classes implementing the `Visitor` interface must define.
 *      - Explain the role of this method: It enables the `Visitor` to operate on a `Node` object.
 *
 *      **Reference:**
 *      ```java
 *      public interface Visitor {
 *          void visit(Node node);
 *      }
 *      ```
 *      *(File: Visitor.java)*
 *
 * 2. **Create the `Element` Interface**
 *    - **Purpose:** The `Element` interface defines the contract for any class that can accept a `Visitor`. It represents elements in the mathematical expression (like numbers and operations).
 *    - **Steps:**
 *      - Define the `Element` interface.
 *      - Include an `accept(Visitor visitor)` method, which allows a `Visitor` object to process the implementing class.
 *
 *      **Reference:**
 *      ```java
 *      public interface Element {
 *          void accept(Visitor visitor);
 *      }
 *      ```
 *      *(File: Element.java)*
 *
 * 3. **`Node` Class**
 *    - **Purpose:** The `Node` class represents a component in the mathematical expression (e.g., numbers or operations).
 *                   It must implement the `Element` interface.
 *    - **Steps:**
 *      - Make the `Node` class implement the `Element` interface.
 *      - Implement the `accept(Visitor visitor)` method to allow a `Visitor` to act upon a `Node`.
 *
 * 4. **Implement the `CountOperations` Class**
 *    - **Purpose:** `CountOperations` is a concrete implementation of the `Visitor` interface that counts specific types of operations (e.g., addition).
 *    - **Steps:**
 *      - Implement the `visit(Node node)` method.
 *      - Use `instanceof` to identify the type of the operation (e.g., `SumNode`) and increment a counter accordingly.
 *      - Override the `toString()` method to display the count of each type of operation.
 *
 *      **Reference:**
 *      ```java
 *      public class CountOperations implements Visitor {
 *          private int numberOfSumOperations = 0;
 *
 *          @Override
 *          public void visit(Node node) {
 *              if (node instanceof SumNode) {
 *                  numberOfSumOperations++;
 *              }
 *          }
 *
 *          @Override
 *          public String toString() {
 *              return "CountOperations{" +
 *                      "numberOfSumOperations=" + numberOfSumOperations +
 *                      '}';
 *          }
 *      }
 *      ```
 *      *(File: CountOperations.java)*
 *
 * ---
 *
 * #### **Expected Workflow**
 * 1. Create mathematical expression nodes (e.g., `SumNode`) to build a tree structure of the expression.
 * 2. Traverse the tree using the `accept` method, passing an instance of `CountOperations` to count the operations.
 * 3. Print the count of each operation type using the `toString` method of `CountOperations`.
 *
 * #### **Example Usage**
 * ```java
 * Node sum1 = new SumNode(...);
 * Node sum2 = new SumNode(...);
 * // Build a tree with sum1, sum2, etc.
 *
 * CountOperations counter = new CountOperations();
 * sum1.accept(counter);
 * sum2.accept(counter);
 *
 * System.out.println(counter);
 * ```
 *
 * This design ensures separation of concerns, as the `Node` classes handle structure and `CountOperations` handles counting logic.
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

        feedback.Feedback.submit("session10_A", I_did_finish, I_did_understand, comment);
        */
    }
}
