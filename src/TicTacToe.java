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


}
