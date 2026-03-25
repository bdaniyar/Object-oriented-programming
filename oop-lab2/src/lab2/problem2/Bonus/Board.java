package lab2.problem2.Bonus;

import lab2.problem2.*;

public class Board {

    private Color currentTurn = Color.WHITE;
    private Piece[][] board = new Piece[8][8];

    public Board() {
        initialize();
    }

    // beginning position of the chess game
    public void initialize() {

        // очистка доски (чтобы при повторном initialize() не оставались старые фигуры)
        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
                board[r][c] = null;
            }
        }

        // WHITE
        board[0][0] = new Rook(new Position(0, 0), Color.WHITE);
        board[0][7] = new Rook(new Position(0, 7), Color.WHITE);

        board[0][1] = new Knight(new Position(0, 1), Color.WHITE);
        board[0][6] = new Knight(new Position(0, 6), Color.WHITE);

        board[0][2] = new Bishop(new Position(0, 2), Color.WHITE);
        board[0][5] = new Bishop(new Position(0, 5), Color.WHITE);

        board[0][3] = new Queen(new Position(0, 3), Color.WHITE);
        board[0][4] = new King(new Position(0, 4), Color.WHITE);

        for (int i = 0; i < 8; i++) {
            board[1][i] = new Pawn(new Position(1, i), Color.WHITE);
        }

        // BLACK
        board[7][0] = new Rook(new Position(7, 0), Color.BLACK);
        board[7][7] = new Rook(new Position(7, 7), Color.BLACK);

        board[7][1] = new Knight(new Position(7, 1), Color.BLACK);
        board[7][6] = new Knight(new Position(7, 6), Color.BLACK);

        board[7][2] = new Bishop(new Position(7, 2), Color.BLACK);
        board[7][5] = new Bishop(new Position(7, 5), Color.BLACK);

        board[7][3] = new Queen(new Position(7, 3), Color.BLACK);
        board[7][4] = new King(new Position(7, 4), Color.BLACK);

        for (int i = 0; i < 8; i++) {
            board[6][i] = new Pawn(new Position(6, i), Color.BLACK);
        }

        currentTurn = Color.WHITE;
    }

    // drawing the chess board
    public void drawBoard() {

        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 8; j++) {

                Piece p = board[i][j];

                if (p == null) {
                    System.out.print(". ");
                } else {
                    char symbol = getSymbol(p);

                    // белые — большие, чёрные — маленькие
                    if (p.getColor() == Color.BLACK) {
                        symbol = Character.toLowerCase(symbol);
                    }

                    System.out.print(symbol + " ");
                }
            }
            System.out.println();
        }
    }

    private char getSymbol(Piece p) {
        if (p instanceof Rook) return 'R';
        if (p instanceof Knight) return 'N';
        if (p instanceof Bishop) return 'B';
        if (p instanceof Queen) return 'Q';
        if (p instanceof King) return 'K';
        if (p instanceof Pawn) return 'P';
        return '?';
    }

    // moving a piece
    public void movePiece(Position from, Position to) {

        // 🔒 проверка границ
        if (!isInside(from) || !isInside(to)) {
            System.out.println("Out of board!");
            return;
        }

        // запрет "хода в ту же клетку"
        if (from.row == to.row && from.col == to.col) {
            System.out.println("Illegal move");
            return;
        }

        Piece piece = board[from.row][from.col];

        // 1. есть ли фигура
        if (piece == null) {
            System.out.println("No piece at this position");
            return;
        }

        // 2. проверка очереди
        if (piece.getColor() != currentTurn) {
            System.out.println("Not your turn");
            return;
        }

        // 3. проверка съедания
        Piece target = board[to.row][to.col];

        if (target != null && target.getColor() == piece.getColor()) {
            System.out.println("Cannot capture your own piece");
            return;
        }

        // 4. проверка хода по фигуре
        if (!piece.isLegalMove(to)) {
            System.out.println("Illegal move");
            return;
        }

        // 4.1 доп. проверки уже существующей логики (нельзя прыгать сквозь фигуры)
        if (piece instanceof Rook || piece instanceof Bishop || piece instanceof Queen) {
            int dr = Integer.compare(to.row, from.row);
            int dc = Integer.compare(to.col, from.col);

            int r = from.row + dr;
            int c = from.col + dc;
            while (r != to.row || c != to.col) {
                if (board[r][c] != null) {
                    System.out.println("Illegal move");
                    return;
                }
                r += dr;
                c += dc;
            }
        }

        // 4.2 пешка: направление зависит от цвета + нельзя идти вперед в занятую клетку,
        // диагональ разрешена только если кого-то едим
        if (piece instanceof Pawn) {
            int dir = (piece.getColor() == Color.WHITE) ? 1 : -1;
            int rowDiff = to.row - from.row;
            int colDiff = to.col - from.col;

            // forward (прямо)
            if (colDiff == 0) {
                if (rowDiff != dir) {
                    System.out.println("Illegal move");
                    return;
                }
                if (target != null) {
                    System.out.println("Illegal move");
                    return;
                }
            } else {
                // diagonal capture
                if (Math.abs(colDiff) != 1 || rowDiff != dir) {
                    System.out.println("Illegal move");
                    return;
                }
                if (target == null) {
                    System.out.println("Illegal move");
                    return;
                }
            }
        }

        // 5. движение (и съедание автоматически)
        board[to.row][to.col] = piece;
        board[from.row][from.col] = null;

        piece.setPosition(to);

        // 6. смена хода
        currentTurn = (currentTurn == Color.WHITE) ? Color.BLACK : Color.WHITE;
    }

    private boolean isInside(Position p) {
        return p != null && p.row >= 0 && p.row < 8 && p.col >= 0 && p.col < 8;
    }
}
