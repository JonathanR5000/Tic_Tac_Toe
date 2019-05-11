public class Show_TTT {

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run() {
				TicTacToeGUI gui = new TicTacToeGUI();
			}
		});
	}
}