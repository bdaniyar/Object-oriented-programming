package lab2.problem2;

import lab2.problem2.Bonus.Color;

public abstract class Piece {
    Position a;
    Color color;

    public Piece(Position a, Color color) {
        this.a = a;
        this.color = color;
    }

    public Position getPosition() {
        return a;
    }

    public void setPosition(Position a) {
        this.a = a;
    }

    public Color getColor() {
        return color;
    }

    public abstract boolean isLegalMove(Position b);
}