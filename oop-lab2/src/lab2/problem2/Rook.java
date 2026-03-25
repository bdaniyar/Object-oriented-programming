package lab2.problem2;

import lab2.problem2.Bonus.Color;

public class Rook extends Piece {

    public Rook(Position a, Color color){
        super(a, color);
    }

    @Override
    public boolean isLegalMove(Position b){

        return a.row == b.row || a.col == b.col;
        // horizontal , vertical move

    }
}