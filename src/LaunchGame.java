public class LaunchGame {
    public static void main(String[] args) {
        //call display board
        TicTacToe t = new TicTacToe();
        HumanPlayer p1 = new HumanPlayer("Player1", 'X');
        AiPlayer p2 =new AiPlayer("TAI", 'O');

        Players cp; //current player
        cp = p1;
        while(true){
           System.out.println(cp.name+ " turn");
           cp.makeMove();
           TicTacToe.dispBoard();
           if(TicTacToe.checkColWin() || TicTacToe.checkRowWin() || TicTacToe.checkDiagWin()){
               System.out.println(cp.name + " has won");
               break;
           }
           else if (TicTacToe.checkDraw()) {
               System.out.println("game is draw");
               break;
           } else {
               if(cp == p1){
                   cp = p2;
               }
               else{
                   cp = p1;
               }
           }
       }

    }
}
