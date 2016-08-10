public class PlusOneStratergy implements NextMoveStratergy {
	public String nextBid(Integer diamondCardValue) {
		
		String[] CardsMap = {"2" , "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		String bid=CardsMap[(diamondCardValue-2+1)%13];
		return bid;
	}
}