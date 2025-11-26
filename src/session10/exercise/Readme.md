### Exercise: Implement a Tree-Based Mathematical Expression and Adapt the Visitor Pattern

**Objective:** Design a `TreeMathExpression` class to represent mathematical expressions as a tree. Extend the existing Visitor pattern to:
1. Count mathematical operations.
2. Count integers.
3. Evaluate the mathematical expression.

Through this exercise, observe how the Visitor pattern remains independent of the underlying data structure used to represent the expression.

---

#### **Instructions**

1. **Create the `TreeMathExpression` Class**
    - **Purpose:** Represent a mathematical expression as a tree structure.
    - **Structure:**
        - Terminal nodes (leaves) hold integers (e.g., `2`, `3`).
        - Intermediate nodes (non-leaf nodes) represent operations (e.g., `+`, `-`).
    - **Steps:**
        - Include subclasses or fields to distinguish between terminal nodes and intermediate nodes.
        - Terminal nodes should store an integer value.
        - Intermediate nodes should store an operation and references to their child nodes.

    
2**Implement Specific Visitors**
    - **CountOperations Visitor:**
        - Count the number of operation nodes (e.g., `+`, `-`).
    - **CountIntegers Visitor:**
        - Count the number of terminal nodes holding integers.
    - **EvaluateExpression Visitor:**
        - Traverse the tree and evaluate the mathematical expression.

3 **Extend the classes to handle mathematical  multiplications expressions including multiplications and divisions** 

#### **Takeaways**
- This demonstrates how the Visitor pattern decouples algorithms from the data structure on which they operate.