package MainFunction.designpattern.chess;
public class Pawn extends Piece {
    public Pawn(boolean white) {
        super(white);
    }
    public boolean canMove(Board board, Block startBlock, Block endBlock) {
        return false;
    }
}

