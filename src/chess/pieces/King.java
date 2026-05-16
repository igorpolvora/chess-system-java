package chess.pieces;

import chess.ChessPiece;
import chess.Color;
import boardgame.Board;

public class King extends ChessPiece {

    public King(Color color, Board board) {
        super(color, board);
    }

    @Override
    public String toString() {
        return "K";
    }
}
