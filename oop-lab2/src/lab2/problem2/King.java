package lab2.problem2;

import lab2.problem2.Bonus.Color;

public class King extends Piece {

    public King(Position a, Color color){
        super(a, color);
    }

    @Override
    public boolean isLegalMove(Position b){

        int rowDiff = Math.abs(a.row - b.row);
        int colDiff = Math.abs(a.col - b.col);

        return rowDiff <= 1 && colDiff <= 1;
        // can move one square in any direction
    }
}