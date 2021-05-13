import java.util.Random;
public class TokenPass {
	private int[] board;
	private int currentPlayer;
	public TokenPass(int playerCount) {
		Random gen = new Random();
		board = new int[playerCount];
		for(int i = 0; i < playerCount; i++) {
			board[i] = gen.nextInt(11);
		}
		currentPlayer = gen.nextInt(playerCount - 1);
	}
	public void distributeCurrentPlayerTokens() {
		int tokens = board[currentPlayer];
		board[currentPlayer] = 0;
		int i = currentPlayer;
		for(int token = tokens; token > 0; token--) {
			if(i >= board.length-1) {
				i = 0;
			}
			board[i]++;
			i++;
		}
	}
}
