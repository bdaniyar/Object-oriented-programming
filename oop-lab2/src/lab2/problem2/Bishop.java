package lab2.problem2;

import lab2.problem2.Bonus.Color;

public class Bishop extends Piece {

    public Bishop(Position a, Color color){
        super(a, color);
    }

    @Override
    public boolean isLegalMove(Position b){
    

        return Math.abs(a.row - b.row) ==
               Math.abs(a.col - b.col);

               // diagonal move

    }
}