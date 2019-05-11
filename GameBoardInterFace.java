public interface GameBoardInterFace {

		void clearBoard();
		void displayBoard();
		void takeTurn();
		void displayWinner();
		void displayCurrPlayer();
		void displayChampion();
		void createFile();
		boolean isFull();
		boolean playAgain();
		boolean isWinner(String currPlayer);
}