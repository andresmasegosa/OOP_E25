package session6.F_Map.exercise;

/**
 * TODO: Complete the implementation of this class using the generic Board class.
 *
 * Aim:
 * Represent a chess board that stores chess pieces at specific positions.
 * This class should internally use a Board<ChessPiece> object to manage
 * where each piece is placed.
 *
 * You should:
 * 1. Create and initialize a private Board<ChessPiece> attribute.
 * 2. Implement 'getChessPiece' to return the piece at the given position.
 * 3. Implement 'setInitialPositionChessPiece' to place a piece at a given position.
 *
 * Hints:
 * - The Board class already provides methods to store and retrieve objects by position.
 * - Think about how to delegate calls from ChessBoard to Board.
 */
public class ChessBoard {

    public ChessBoard() {

    }

    public ChessPiece getChessPiece(Position position){
        return null;
    }

    public void setInitialPositionChessPiece(Position position, ChessPiece piece){
    }

}

