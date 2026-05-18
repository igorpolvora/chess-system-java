package application;

import java.util.Scanner;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();

		while (true) {
			try {
				UI.printBoard(chessMatch.getPieces());
				System.out.println();
				System.out.print("Source: ");
				chess.ChessPosition source = UI.readChessPosition(sc);
				System.err.println();
				System.out.print("Target: ");
				chess.ChessPosition target = UI.readChessPosition(sc);
				chess.ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
			}
			catch (RuntimeException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
