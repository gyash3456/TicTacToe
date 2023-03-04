package ticTacToeVersion2.models;

import java.util.HashMap;
import java.util.Scanner;


public class Human implements Player{
	
	private String name;
	private char symbol;
	
	public Human(String name, char symbol) {
		super();
		this.name = name;
		this.symbol = symbol;
	}

	public char getSymbol() {
		return symbol;
	}

	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	@Override
	public HashMap<String, Integer> makeMove() {
		HashMap<String,Integer> hmap = new HashMap<>();
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your row number");
		hmap.put("row",sc.nextInt());
		System.out.println("Enter your col number");
		hmap.put("col",sc.nextInt());
		return hmap;
		
	}

}
