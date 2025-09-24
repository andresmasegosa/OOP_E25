package session3;

import session3.B_DesignWithInheritance.ChessBoard;
import session3.B_DesignWithInheritance.ChessPiece;
import session3.B_DesignWithInheritance.Queen;

public class Demo2 {

    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard();

        Queen queen = new Queen(chessBoard, "Black", 0, 2);

        chessBoard.moveChessPiece(queen, 3,2);

    }
}
