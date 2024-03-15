import java.util.Scanner;

public class TicTacToe {

    private static char[][] board = new char[3][3];
    private static char currentPlayer = 'X';
    protected static boolean gameOver = false;


    public static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("---------");
            }
        }
    }

    public static void checkForWinner() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                System.out.println("Player " + currentPlayer + " is the winner!");
                gameOver = true;
                return;
            }
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                System.out.println("Player " + currentPlayer + " is the winner!");
                gameOver = true;
                return;
            }
        }
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            System.out.println("Player " + currentPlayer + " is the winner!");
            gameOver = true;
            return;
        }
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            System.out.println("Player " + currentPlayer + " is the winner!");
            gameOver = true;
            return;
        }
    }
    public static void whoIsPlaying() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Player "+ currentPlayer + "'s turn:");
        System.out.printf("Enter row (1, 2, 3): ");
        int row = sc.nextInt()-1;
        System.out.printf("Enter column (1, 2, 3): ");
        int col = sc.nextInt()-1;

        if (board[row][col] == ' ') {
            board[row][col] = currentPlayer;
        } else {
            System.out.println("This spot is already taken. Try again.");
            whoIsPlaying();
        }
    }

    public static void checkForTie() {
        boolean fullBoard = true;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (board[i][j] == ' ') {
                    fullBoard = false;
                    break;
                }
            }
            if (!fullBoard){
                break;
            }
        }
        if (fullBoard){
            System.out.println("It is a tie!");
            gameOver = true;
        }
    }

    public static void switchPlayer(){
        currentPlayer = (currentPlayer == 'x') ? 'O' : 'X';
    }
}
