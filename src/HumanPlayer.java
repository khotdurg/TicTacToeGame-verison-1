import java.util.Scanner;

public class HumanPlayer extends Players{

    public HumanPlayer(String name, char mark) {
        this.name = name;
        this.mark = mark;
    }

    public void makeMove(){
        Scanner scn = new Scanner(System.in);
        int row;
        int col;
        do{
            System.out.println("enter the row and col");
            row = scn.nextInt();
            col = scn.nextInt();
        }
        while (!isValidMove(row, col));
        TicTacToe.placeMark(row, col, mark);
    }


}
