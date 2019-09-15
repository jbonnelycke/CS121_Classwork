
public class PlayingWithCards {
	enum Rank {ace, two, three, four, five, six, seven, eight, nine, ten, jack, queen, king}

	public static void main(String[] args) {
		Rank faceCard, card1, card2;
		faceCard = Rank.queen;
		card1 = Rank.three;
		card2 = Rank.seven;
		
		System.out.println("A one card hand: " + faceCard);
		System.out.println("A two card hand: " + card1.name() + " " + card2.name());
		System.out.println("Hand value: " + (card1.ordinal() + card2.ordinal() + 2));
	}
}

