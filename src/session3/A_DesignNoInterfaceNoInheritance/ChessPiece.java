package session3.A_DesignNoInterfaceNoInheritance;



public class ChessPiece {

    private String type;
    private String color;
    private int x;
    private int y;
    private ChessBoard chessBoard;

    public ChessPiece(ChessBoard chessBoard, String type, String color, int x, int y) {
        this.chessBoard = chessBoard;
        this.type = type;
        this.color = color;
        this.chessBoard.setInitialPositionChessPiece(x,y,this);
    }

    public String getColor() {
        return color;
    }

    public int getX() {
        return x;
    }

    protected void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    protected void setY(int y) {
        this.y = y;
    }

    public ChessBoard getChessBoard() {
        return this.chessBoard;
    }

    public boolean isLegalTheMovement(int newX, int newY){

        boolean success = false;
        switch (this.type){
            case "King":
                success = Movements.isLegalVerticalMovement(this.chessBoard, this.getX(), this.getY(), newX, newY, 1) ||
                        Movements.isLegalHorizontalMovement(this.chessBoard, this.getX(), this.getY(), newX, newY, 1) ||
                        Movements.isLegalDiagonalMovement(this.chessBoard, this.getX(), this.getY(), newX, newY, 1);
                return success;
            case "Queen":
                success = Movements.isLegalVerticalMovement(this.chessBoard, this.getX(), this.getY(), newX, newY, 8) ||
                        Movements.isLegalHorizontalMovement(this.chessBoard, this.getX(), this.getY(), newX, newY, 8) ||
                        Movements.isLegalDiagonalMovement(this.chessBoard, this.getX(), this.getY(), newX, newY, 8);
                return success;
            case "Bishop":
                success = Movements.isLegalDiagonalMovement(this.chessBoard, this.getX(), this.getY(), newX, newY, 8);
                return success;

        }
        return false;
    }

}
