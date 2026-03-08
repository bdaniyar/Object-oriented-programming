package lab2.problem2;

public class Pawn extends Piece {

    public Pawn(Position a){
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b){

        return b.row == a.row + 1 &&
               b.col == a.col;

    }
}