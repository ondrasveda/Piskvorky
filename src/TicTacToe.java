import java.util.Scanner;

public class TicTacToe {

    private static void playTurn() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Palyer"+ currentPlayer + " s turn:");
        System.out.printf("Enter row (0, 1, 2): ");
        int row = sc.nextInt();
        System.out.printf("Enter column (0, 1, 2): ");
        int col = sc.nextInt();

        if (board[row][col] == ' ') {
            board[row][col] = currentPlayer;
        } else {
            System.out.println("That spot is already taken. Try again.");
            playTurn();
        }
    }

    private static void checkTie() {
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

    private static void switchPlayer(){
        currentPlayer = (currentPlayer == 'x') ? 'O' : 'X';
    }
}
