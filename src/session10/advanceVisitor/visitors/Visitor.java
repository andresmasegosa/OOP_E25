package session10.advanceVisitor.visitors;


import session10.advanceVisitor.mathexpression.*;

public interface Visitor {

     default void visit(Element node){
         //do nothing by default!
     }

    // We add specific methods for each concrete node type
    default void visit(EqualNode node){
        this.visit((Element)node);
    }
    default void visit(IntegerNode node){
        this.visit((Element)node);
    }
    default void visit(OperationNode node){
        this.visit((Element)node);
    }

    default void visit(SumNode node){
        this.visit((OperationNode) node);
    }

    default void visit(SubtractionNode node){
        this.visit((OperationNode) node);
    }
}