package ticTacToeVersion2.models;

import java.util.Scanner;

public class UseVersion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of players");
		int noOfPlayers= inputValidNumber();
		
		System.out.println("Enter number of rows in board");
		int noOfRows=inputValidNumber();
		
		System.out.println("Enger number of columns in board");
		int noOfCol= inputValidNumber();
		
		Board board = new Board(noOfRows, noOfCol);
		
		Game game=new Game(noOfPlayers, board);
		
		game.registerPlayer();
		game.startGame();
		
		
		

	}
	public static int inputValidNumber(){
		Scanner sc = new Scanner(System.in);
		int x;
		while(true) {
			try {
				String str= sc.next();
				x=Integer.parseInt(str);
				break;
			} catch (Exception e) {
				System.out.println("Please enter a valid number");
			}
		}
		
		return x;
	}
}