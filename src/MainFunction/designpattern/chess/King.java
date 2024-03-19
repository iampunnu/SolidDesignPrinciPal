package MainFunction.designpattern.chess;

public class King extends Piece {
    public King(boolean white) {
        super(white);
    }
    public boolean canMove(Board board, Block startBlock, Block endBlock) {
        return false;
    }
}