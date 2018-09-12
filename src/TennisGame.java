import java.util.concurrent.TimeUnit;
public class TennisGame {
	
	private int p1;
	private int p2;
	private int scoreFlag;
	
	
	public TennisGame() {
		this.p1 = 0;
		this.p2 = 0;
		this.scoreFlag = 0;
		// TO BE IMPLEMENTED
		System.out.println("I am constructor");
		
	}

	public void winapoint(int aplayer) {
		if(aplayer==1) {
			System.out.println("   ");
			System.out.println("point for player1");
			if (p1<=3) {
				p1= p1+1;
			}
			else if (p1==4 && p2==3) {
				
				p1=5;
			}
			else if (p1==3 && p2<=2) {
				
				p1=5;
			}
			else if (p1==3 && p2==3) {
				
				p1=4;
			}
			else {
				p2=3;
			}
			
		}
		if(aplayer==2) {
			System.out.println("   ");
			System.out.println("point for player2");
			if (p2<=3) {
				p2=p2+1;
			}
			else if (p2==4 && p1==3) {
					
				p2=5;
			}
			else if (p2==3 && p1<=2) {
				
				p2=5;
			}
			else if (p2==3 && p1==3) {
				
				p2=4;
			}
			else {
				
				p1=3;
			}
			
		}
		
	}

	public String getScore() {
		
		if (p1==0 && p2==0) {
			System.out.println("0 - 0");
		}
		else if (p1==1 && p2==0) {
			System.out.println("15 - 0");
		}
		else if (p1==2 && p2==0) {
			System.out.println("30 - 0");
		}
		else if (p1==3 && p2==0) {
			System.out.println("40 - 0");
		}
		
		else if (p1==0 && p2==1) {
			System.out.println("0 - 15");
		}
		else if (p1==1 && p2==1) {
			System.out.println("15 - 15");
		}
		else if (p1==2 && p2==1) {
			System.out.println("30 - 15");
		}
		else if (p1==3 && p2==1) {
			System.out.println("40 - 15");
		}
		else if (p1==0 && p2==2) {
			System.out.println("0 - 30");
		}
		else if (p1==1 && p2==2) {
			System.out.println("15 - 30");
		}
		else if (p1==2 && p2==2) {
			System.out.println("30 - 30");
		}
		else if (p1==3 && p2==2) {
			System.out.println("40 - 30");
		}
		else if (p1==0 && p2==3) {
			System.out.println("0 - 40");
		}
		else if (p1==1 && p2==3) {
			System.out.println("15 - 40");
		}
		else if (p1==2 && p2==3) {
			System.out.println("30 - 40");
		}
		else if (p1==3 && p2==3) {
			System.out.println("deuce");
		}
		else if (p1==4 && p2==3) {
			System.out.println("adventage player1");
		}
		else if (p1==3 && p2==4) {
			System.out.println("adventage player2");
		}
		else if (p1==5) {
			System.out.println("game to player1");
		}
		else if (p2==5) {
			System.out.println("game to player2");
		}
	
			// TO BE IMPLEMENTED
			return "";
	}
}



    
