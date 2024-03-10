package MainFunction.designpattern.ticktacktoe;

public class Board {
    int size;
    PlayingPiece[][]playingPieces;
    public Board(int size){
        this.size=size;
        playingPieces =new PlayingPiece[size][size];
    }
    public Boolean hasFreeSpace(int x,int y){
        if (playingPieces[x][y]!=null){
            return false;
        }
        else {
            return true;
        }
    }
    public Boolean addPiece(int x,int y,PlayingPiece playingPiece){

        if (playingPieces[x][y]!=null){
            return false;
        }
        else {
            playingPieces[x][y]=playingPiece;
            return true;
        }

    }
    public void printBoard(){
        for (int i=0;i<playingPieces.length;i++){
            for (int j=0;j<playingPieces.length;j++){
                if (playingPieces[i][j]!=null){
                    System.out.print(playingPieces[i][j].pieceType.name()+"   ");
                }
                else {
                    System.out.print("   ");
                }
                System.out.print(" | ");

            }
            System.out.println();
        }
    }
}
