package ticTacToeVersion2.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Game {
	private int noOfPlayers;
	private Player player[];
	private Board board;
	private Player winner=null;
	private static int count =0;

	
	public int checkWinner(char c) {
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		for(int i=0;i<board.getNoOfrows();i++) {
//			arr.add(0);
//		}
		int symbolcount1 =0;
		int symbolcount2=0;
		int symbolcount3=0;
		int symbolcount4=0;
		
		for(int i = 0;i<board.getNoOfrows();i++) {

			for(int j=0;j<board.getNoOfrows();j++) {
//				System.out.println("i"+i+"j"+j);
				if(j!=board.getNoOfrows()-1&&(board.getArr()[i][j]==board.getArr()[i][j+1])&&(board.getArr()[i][j]==c))
				{
					symbolcount1++;
//					System.out.println("symbol1"+ symbolcount1);2
				}
				if(j!=board.getNoOfrows()-1&&(board.getArr()[j][i]==board.getArr()[j+1][i])&&(board.getArr()[j][i]==c)) {
					symbolcount2++;
//					System.out.println("symbol2"+ symbolcount2);
				}
				if(i==j&&board.getArr()[i][j]==c) {
					symbolcount3++;
//					System.out.println("symbol3"+ symbolcount3);
				}
				if(i+j==2&&board.getArr()[i][j]==c) {
					symbolcount4++;
//					System.out.println("symbol4"+ symbolcount4);
				}
				
			}
			if(symbolcount1==board.getNoOfrows()-1||symbolcount2==board.getNoOfrows()-1||symbolcount3==board.getNoOfrows()||symbolcount4==board.getNoOfrows()){
				return 1;
			}
			
		}
		return 0;
	}
	public void startGame() {
		while(count<board.getNoOfrows()*board.getNoOfcolumns()&&winner==null) {
			HashMap<String,Integer>hmap=player[count%player.length].makeMove();
			
			if(player[count%player.length] instanceof Human) {
				Human h= (Human)player[count%player.length];
				this.board.setArr(hmap.get("row"), hmap.get("col"),h.getSymbol());
				displayBoard();
				int result=checkWinner(h.getSymbol());
				if(result==1) {
					System.out.println(h.getName()+" is the winner");
					winner=h;
					return;
				}
			}
			count++;
		}
		System.out.println("draw");
		
	}
	public void displayBoard() {
		char arr[][]= board.getArr();
		for(int i=0;i<board.getNoOfrows();i++) {
			for(int j=0;j<board.getNoOfcolumns();j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	public void registerPlayer() {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<player.length;i++) {
			System.out.println("Enter the name of player "+i+1);
			String name = sc.next();
			System.out.println("Enter the symbol of player in a single character " +i+1);
			String str = sc.next();
			while(str.length()!=1) {
				System.out.println("Please enter single character");
				str=sc.next();
			}
			char symbol = str.charAt(0);
			player[i] =new Human(name,symbol);
			
		}
		
	}
	
	public Game(int noOfPlayers, Board board) {
		super();
		this.noOfPlayers = noOfPlayers;
		this.player = new Player[noOfPlayers];
		this.board = board;
	}
	public void setNoOfPlayers(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}
	public void setPlayer(Player[] player) {
		this.player = player;
	}
	public void setBoard(Board board) {
		this.board = board;
	}
}
