package MainFunction.designpattern.chess;

public class Rook extends Piece {
    public Rook(boolean white) {
        super(white);
    }
    public boolean canMove(Board board, Block startBlock, Block endBlock) {
        return false;
    }
}
