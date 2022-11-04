package main;

public class Game {
	private String turn;
	public String boxNumber[];
//	private String board;
//	public int[] getBoxNumber() {
//		return boxNumber;
//	}
	public void setBoxNumber() {
		boxNumber=new String[10];
		for(int i=0;i<=9;i++) {
			boxNumber[i]=String.valueOf(i);
		};
	}
//	public String setBoard() {
//		this.board="1"+"2"+"3"+"\n"+"4"+"5"+"6"+"\n"+"7"+"8"+"9"+"\n";
//		return board;
//	}
	public String getBoard() {
		return boxNumber[1]+boxNumber[2]+boxNumber[3]+"\n"
				+boxNumber[4]+boxNumber[5]+boxNumber[6]+"\n"
				+boxNumber[7]+boxNumber[8]+boxNumber[9]+"\n";
	}
	public String checkWinner() {
		if((boxNumber[1]+boxNumber[2]+boxNumber[3]).equals("xxx"))
			return "x";
		if((boxNumber[4]+boxNumber[5]+boxNumber[6]).equals("xxx"))
			return "x";
		if((boxNumber[7]+boxNumber[8]+boxNumber[9]).equals("xxx"))
			return "x";
		if((boxNumber[1]+boxNumber[4]+boxNumber[7]).equals("xxx"))
			return "x";
		if((boxNumber[2]+boxNumber[5]+boxNumber[8]).equals("xxx"))
			return "x";
		if((boxNumber[3]+boxNumber[6]+boxNumber[9]).equals("xxx"))
			return "x";
		if((boxNumber[1]+boxNumber[5]+boxNumber[9]).equals("xxx"))
			return "x";
		if((boxNumber[3]+boxNumber[5]+boxNumber[7]).equals("xxx"))
			return "x";
		
		if((boxNumber[1]+boxNumber[2]+boxNumber[3]).equals("ooo"))
			return "o";
		if((boxNumber[4]+boxNumber[5]+boxNumber[6]).equals("ooo"))
			return "o";
		if((boxNumber[7]+boxNumber[8]+boxNumber[9]).equals("ooo"))
			return "o";
		if((boxNumber[1]+boxNumber[4]+boxNumber[7]).equals("ooo"))
			return "o";
		if((boxNumber[2]+boxNumber[5]+boxNumber[8]).equals("ooo"))
			return "o";
		if((boxNumber[3]+boxNumber[6]+boxNumber[9]).equals("ooo"))
			return "o";
		if((boxNumber[1]+boxNumber[5]+boxNumber[9]).equals("ooo"))
			return "o";
		if((boxNumber[3]+boxNumber[5]+boxNumber[7]).equals("ooo"))
			return "o";
		
		else return null;
	}
	public String getTurn() {
		return turn;
	}
	public void setTurn(String turn) {
		this.turn = turn;
	}
}
