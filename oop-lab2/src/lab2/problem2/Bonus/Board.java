package lab2.problem2.Bonus;
import lab2.problem2.*;

public class Board {

    private Piece[][] board = new Piece[8][8];

    public Board() {
        initialize();
    }

    // начальная расстановка некоторых фигур
    public void initialize() {

        board[0][0] = new Rook(new Position(0,0));
        board[0][7] = new Rook(new Position(0,7));

        board[0][1] = new Knight(new Position(0,1));
        board[0][6] = new Knight(new Position(0,6));

        board[0][2] = new Bishop(new Position(0,2));
        board[0][5] = new Bishop(new Position(0,5));

        board[0][3] = new Queen(new Position(0,3));
        board[0][4] = new King(new Position(0,4));

        for(int i = 0; i < 8; i++){
            board[1][i] = new Pawn(new Position(1,i));
        }
    }

    // вывод доски
    public void drawBoard(){

        for(int i = 0; i < 8; i++){

            for(int j = 0; j < 8; j++){

                if(board[i][j] == null){
                    System.out.print(". ");
                }
                else if(board[i][j] instanceof Rook){
                    System.out.print("R ");
                }
                else if(board[i][j] instanceof Knight){
                    System.out.print("N ");
                }
                else if(board[i][j] instanceof Bishop){
                    System.out.print("B ");
                }
                else if(board[i][j] instanceof Queen){
                    System.out.print("Q ");
                }
                else if(board[i][j] instanceof King){
                    System.out.print("K ");
                }
                else if(board[i][j] instanceof Pawn){
                    System.out.print("P ");
                }

            }

            System.out.println();
        }
    }

    // перемещение фигуры
    public void movePiece(Position from, Position to){

        Piece piece = board[from.row][from.col];

        if(piece == null){
            System.out.println("No piece at this position");
            return;
        }

        if(!piece.isLegalMove(to)){
            System.out.println("Illegal move");
            return;
        }

        board[to.row][to.col] = piece;
        board[from.row][from.col] = null;

        piece.a = to;
    }
}