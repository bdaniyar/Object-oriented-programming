package lab2.problem2.Bonus;

import java.util.Scanner;

import lab2.problem2.Position;

public class Main {

    public static void main(String[] args) {

        Board board = new Board();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            board.drawBoard();

            System.out.println("Enter move: fromRow fromCol toRow toCol");
            System.out.println("Example: 1 0 2 0");

            int fromRow = scanner.nextInt();
            int fromCol = scanner.nextInt();
            int toRow = scanner.nextInt();
            int toCol = scanner.nextInt();

            Position from = new Position(fromRow, fromCol);
            Position to = new Position(toRow, toCol);

            board.movePiece(from, to);

            System.out.println(); 
        }
    }
}