import java.util.Scanner;

public class lb3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Player name O: ");
        String nameX = scanner.nextLine();
        player playerX = new player(nameX, 'O');

        System.out.print("Player name X: ");
        String nameO = scanner.nextLine();
        player playerO = new player(nameO, 'X');

        gamebar gameBoard = new gamebar();
        boolean gameOver = false;
        player currentPlayer = playerX;

        System.out.println("Start to play!");

        while (!gameOver) {
            currentPlayer.displayInfo();
            gameBoard.displayBoard();

            int[] move = currentPlayer.makeMove();
            if (gameBoard.makeMove(move[0], move[1], currentPlayer.symbol)) {
                if (gameBoard.checkWin(currentPlayer.symbol)) {
                    gameBoard.displayBoard();
                    System.out.println(currentPlayer.name + " WIN!");
                    gameOver = true;
                } else if (isBoardFull(gameBoard)) {
                    gameBoard.displayBoard();
                    System.out.println("DRAW!");
                    gameOver = true;
                } else {
                    currentPlayer = (currentPlayer == playerX) ? playerO : playerX;
                }
            } else {
                System.out.println("False step. Try again!");
            }
        }
    }

    public static boolean isBoardFull(gamebar gameBoard) {
        char[][] board = gameBoard.getBoard();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false; 
                }
            }
        }
        return true; 
    }
}