public class Main {
    public static void main(String[] args) {
        TicTacToe.initializeBoard();
        TicTacToe.printBoard();

        while (!TicTacToe.gameOver) {
            TicTacToe.whoIsPlaying();
            TicTacToe.printBoard();
            TicTacToe.checkForWinner();
            TicTacToe.checkForTie();
            TicTacToe.switchPlayer();
        }
        
    }

}
