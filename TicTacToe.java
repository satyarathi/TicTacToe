package com.workshoptwo;

import java.util.Scanner;

public class TicTacToe {

	static char[] board = new char[10];
	static char userLetter;
	static char computerLetter;

	public static void main(String[] args) {
		createEmptyBoard();
	}

	public static void createEmptyBoard() {
		for (int i = 1; i < board.length; i++) {
			board[i] = ' ';
		}
	}
	
	public static void chooseLetter() {
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Choose a letter :: X or O : ");
	        userLetter = scanner.next().toUpperCase().charAt(0);
	        computerLetter = (userLetter == 'X') ? 'O' : 'X';
	}


}


