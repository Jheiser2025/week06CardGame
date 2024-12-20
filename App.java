package cardGameWeek06;

public class App { 
	public static void main(String[] args) {
		Deck deck = new Deck(); 
		deck.shuffle(); 
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2"); 
		for (int i = 0; i < 52; i++) { 
			if (i % 2 == 0) { player1.draw(deck);
			} else { 
				player2.draw(deck);
				}
			} 
		for (int i = 0; i < 26; i++) { 
			Card card1 = player1.flip();
			Card card2 = player2.flip();
			card1.describe();
			card2.describe(); 
			if (card1.getValue() > card2.getValue()) {
				player1.incrementScore(); 
				System.out.println(player1.getName() + " wins this round."); 
				} 
			else if (card1.getValue() < card2.getValue()) { 
				player2.incrementScore(); 
				System.out.println(player2.getName() + " wins this round.");
				} else {
System.out.println("It's a tie. No points awarded.");
}
			try { 
				Thread.sleep(1000); 
				} catch (InterruptedException e) { 
					e.printStackTrace(); } 
			} 
		System.out.println("Final Scores:");
		System.out.println(player1.getName() + ": " + player1.getScore());
		System.out.println(player2.getName() + ": " + player2.getScore());
		if (player1.getScore() > player2.getScore()) {
			System.out.println(player1.getName() + " wins the game!"); 
			} else if (player1.getScore() < player2.getScore()) 
			{ 
				System.out.println(player2.getName() + " wins the game!");
				} else { 
					System.out.println("The game is a draw!"); } } }