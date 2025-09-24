package session3.B_DesignWithInheritance;

public class King extends ChessPiece{

    boolean checked = false;

    public King(ChessBoard chessBoard, String color, int x, int y) {
        super(chessBoard, "King", color, x, y);
    }

    public boolean isChecked(){
        return checked;
    }

    @Override
    public boolean isLegalTheMovement(int newX, int newY){
        //Check if the movement is allowed.
        boolean success = Movements.isLegalVerticalMovement(this.getChessBoard(), this.getX(), this.getY(), newX, newY, 1) ||
                Movements.isLegalHorizontalMovement(this.getChessBoard(), this.getX(), this.getY(), newX, newY, 1) ||
                Movements.isLegalDiagonalMovement(this.getChessBoard(), this.getX(), this.getY(), newX, newY, 1);
        return success;
    }


}
