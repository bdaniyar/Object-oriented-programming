package lab2.problem2;

import lab2.problem2.Bonus.Color;

public class Knight extends Piece {

    public Knight(Position a, Color color){
        super(a, color);
    }

    @Override
    public boolean isLegalMove(Position b){

        int rowDiff = Math.abs(a.row - b.row);
        int colDiff = Math.abs(a.col - b.col);

        return (rowDiff == 2 && colDiff == 1) ||
               (rowDiff == 1 && colDiff == 2);
        // 2 squares + 1 square move in L shape
    }
}