import java.util.ArrayList;
import java.util.Collections;

public class Diamond {
	public ArrayList<Integer> diamondCards ;
	public String[] diamondCardsMap = {" " , " " , "2" , "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
	public Diamond(){
		diamondCards = new ArrayList<Integer>();
		diamondCards.add(2);
		diamondCards.add(3);
		diamondCards.add(4);
		diamondCards.add(5);
		diamondCards.add(6);
		diamondCards.add(7);
		diamondCards.add(8);
		diamondCards.add(9);
		diamondCards.add(10);
		diamondCards.add(11);
		diamondCards.add(12);
		diamondCards.add(13);
		diamondCards.add(14);
		
		
		Hand Player = new Player();
		Hand Computer = new Computer();
		suffle();
		playGame();
	}

	public void playGame() {
		for(Integer card : diamondCards){
			System.out.println(diamondCardsMap[card]);
			int c = Computer.nextBid(card);
			int p = Player.nextBid(card);
			bidResult(c,p,card);
			removeLastDiamondCard();
		}
	}

	private void removeLastDiamondCard() {
		diamondCards.remove(0);
	}

	private void bidResult(int c , int p , int diamondcard) {
		if(c<p) Player.Score = diamondcard;
		else if(c > p) Computer.Score = diamondcard;
		else {
			Player.Score = diamondcard/2;
			Computer.Score = diamondcard/2;
		}
		
	}

	public void suffle() {
		Collections.shuffle(diamondCards);
	}
	
	public static void main(String args[]){
		Diamond Game = new Diamond();
	}
	
}
