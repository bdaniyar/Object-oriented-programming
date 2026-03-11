package lab2.problem2;

public class Queen extends Piece {

    public Queen(Position a){
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b){

        boolean rookMove = a.row == b.row || a.col == b.col;

        boolean bishopMove =
                Math.abs(a.row - b.row) ==
                Math.abs(a.col - b.col);

        return rookMove || bishopMove;
        // combines the moves of Rook and Bishop
        // horizontal, vertical, diagonal move
    }
}