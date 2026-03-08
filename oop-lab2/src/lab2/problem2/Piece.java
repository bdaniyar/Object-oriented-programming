package lab2.problem2;

public abstract class Piece {

    public Position a;

    public Piece(Position a){
        this.a = a;
    }

    public abstract boolean isLegalMove(Position b);

}