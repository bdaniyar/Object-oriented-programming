package lab2.problem2;

import lab2.problem2.Bonus.Color;

public class Pawn extends Piece {

    public Pawn(Position a, Color color) {
        super(a, color);
    }

    @Override
    public boolean isLegalMove(Position b) {
        // Base pawn movement pattern:
        // - one square forward (direction depends on color)
        // Captures / blocked squares are checked in Board (needs board context).
        int dir = (color == Color.WHITE) ? 1 : -1;
        return b.col == a.col && b.row == a.row + dir;
    }
}
