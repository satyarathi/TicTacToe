package com.workshoptwo;

public class TicTacToe {

	static char[] board = new char[10];

	public static void main(String[] args) {
		createEmptyBoard();
	}

	public static void createEmptyBoard() {
		for (int i = 1; i < board.length; i++) {
			board[i] = ' ';
		}
	}
}
