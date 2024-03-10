package MainFunction.designpattern.ticktacktoe;

public class TicktackMain {
    public static void main(String[] args) {

        String s="1,1";
        String[] values = s.split(",");
        for (int i=0;i<values.length;i++){
            System.out.println(i);
            System.out.println(values[i]);
        }
        System.out.println(values);
        int inputRow = Integer.valueOf(values[0]);
        int inputColumn = Integer.valueOf(values[1]);

       TicTacToeGame ticTacToeGame=new TicTacToeGame();
       ticTacToeGame.initilizeGame();
       ticTacToeGame.startGame();
    }
}
