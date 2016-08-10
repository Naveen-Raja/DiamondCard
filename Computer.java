public class Computer extends Hand {
	NextMoveStratergy p;

	Computer(String decision) {
		if (decision.equals("1"))
			p = new PlusOneStratergy();
		//else
			//p = new PlusTwoStratergy();
	}

	public String nextBid(Integer diamondCardValue) {
		
		String nextBid = p.nextBid(diamondCardValue);
		return nextBid;
	}

}