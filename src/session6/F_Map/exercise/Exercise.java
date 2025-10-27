package session6.F_Map.exercise;

/**
 * Exercise: Implementing ChessBoard using a Map<Position,ChessPiece> object.
 *   a) The class Board is supposed to represent a general collection where objects are stored
 *   at different positions. The current implementation is unfinished. Go and finish the implementation
 *   of the Board class.
 *   b) Use this Board class to implement the ChessBoard class.
 */
public class Exercise {
    public static void main(String[] args) {

        //Create the Chess Board
        ChessPiece king = new ChessPiece("King","Black");
        ChessPiece queen = new ChessPiece("Queen","Black");

        ChessBoard chessBoard = new ChessBoard();
        chessBoard.setInitialPositionChessPiece(new Position(0,7), king);
        chessBoard.setInitialPositionChessPiece(new Position(0,6), queen);

        System.out.println(chessBoard.getChessPiece(new Position(0,6)));

        /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/

        /*
        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session6_D", I_did_finish, I_did_understand, comment);
        */
    }
}
