package ticTacToeVersion2.models;


public class Board {
	private int noOfrows;
	private int noOfcolumns;
	private char arr[][];
	
	public Board(int noOfrows, int noOfcolumns) {
		this.noOfrows = noOfrows;
		this.noOfcolumns = noOfcolumns;
		arr =new char[noOfrows][noOfcolumns];
		
	}

	public int getNoOfrows() {
		return noOfrows;
	}

	public void setNoOfrows(int noOfrows) {
		this.noOfrows = noOfrows;
	}

	public int getNoOfcolumns() {
		return noOfcolumns;
	}

	public void setNoOfcolumns(int noOfcolumns) {
		this.noOfcolumns = noOfcolumns;
	}

	
	
	public char[][] getArr() {
		return arr;
	}

	public void setArr(int row,int col,char c) {
		arr[row][col]=c;
	}
	
}
