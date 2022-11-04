package main;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game game= new Game();
		game.setTurn("x");
		game.setBoxNumber();
//		for(int i=0;i<=9)
//		game.setBoard();
		String winner = null;
		System.out.println("First turn will be for x and second for o");
		int count =0;
		while(winner==null&&count<9) {
			Scanner sc =new Scanner(System.in);
			
			System.out.println(game.getBoard());
			System.out.println("Player "+game.getTurn()+" Please enter your desired box number");
			int input= sc.nextInt();
			if(input<1||input>9) {
				System.out.println("Enter a valid number");
				continue;
			}
			else {
				if(!(game.boxNumber[input].equals(String.valueOf(input)))) {
					System.out.println("the box number has already been taken");
					continue;
				}
				else {
					game.boxNumber[input]=game.getTurn();
					if(game.getTurn()=="x") {
						game.setTurn("o");
					}
					else {
						game.setTurn("x");
					}
				}
			}
			count++;
			System.out.println(game.getBoard());
			winner=game.checkWinner();
		}
		if(count==9) {
			System.out.print("The match is draw");
		}
		else {
			System.out.println("Winner is "+winner);
		}

	}

}
