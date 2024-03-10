package MainFunction.designpattern.ticktacktoe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class TicTacToeGame {
    Deque <Player> players;
    Board board;

    public void initilizeGame(){
        players=new LinkedList<>();
        PieceO pieceO=new PieceO(PieceType.o);
        Player playerO=new Player("player2",pieceO);
        PieceO pieceX=new PieceO(PieceType.x);
        Player playerX=new Player("player1",pieceX);
        players.add(playerX);
        players.add(playerO);
        board=new Board(3);
    }
    public String startGame(){
        boolean noWinner = true;
        while (noWinner){
            Player player=players.removeFirst();
            board.printBoard();
            System.out.print("Player:" + player.name + " Enter row,column: ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);
            Boolean addPiece=board.addPiece(inputRow,inputColumn,player.playingPiece);
            if (!addPiece){
                System.out.println("Incorredt possition chosen, try again");
                players.addFirst(player);
                continue;
            }
            players.addLast(player);

            if (isThereWinner(inputRow,inputColumn,player.playingPiece.pieceType));{
                return player.name;
            }

        }
    return "tie";
    }

    public boolean isThereWinner(int row, int column, PieceType pieceType) {

        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        //need to check in row
        for(int i=0;i<board.size;i++) {

            if(board.playingPieces[row][i] == null || board.playingPieces[row][i].pieceType != pieceType) {
                rowMatch = false;
            }
        }

        //need to check in column
        for(int i=0;i<board.size;i++) {

            if(board.playingPieces[i][column] == null || board.playingPieces[i][column].pieceType != pieceType) {
                columnMatch = false;
            }
        }

        //need to check diagonals
        for(int i=0, j=0; i<board.size;i++,j++) {
            if (board.playingPieces[i][j] == null || board.playingPieces[i][j].pieceType != pieceType) {

                diagonalMatch = false;
            }
        }

        //need to check anti-diagonals
        for(int i=0, j=board.size-1; i<board.size;i++,j--) {
            if (board.playingPieces[i][j] == null || board.playingPieces[i][j].pieceType != pieceType) {
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }

}
