package lab2.problem2;

public class King extends Piece {

    public King(Position a){
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b){

        int rowDiff = Math.abs(a.row - b.row);
        int colDiff = Math.abs(a.col - b.col);

        return rowDiff <= 1 && colDiff <= 1;
    }
}