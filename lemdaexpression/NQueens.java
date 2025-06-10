package lemdaexpression;
import java.util.*;

public class NQueens {

    // Function to check if placing a queen is safe
    public static boolean isSafe(char[][] board, int row, int col, int n) {
        for (int i = 0; i < row; i++)
            if (board[i][col] == 'Q') return false;

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 'Q') return false;

        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++)
            if (board[i][j] == 'Q') return false;

        return true;
    }

    // Recursive function to solve N-Queens
    public static void solveNQueens(char[][] board, int row, int n, int[] positions) {
        if (row == n) {
            printBoard(board, n);
            printPositionArray(positions);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {
                board[row][col] = 'Q';
                positions[row] = col + 1; // store column (1-based)
                solveNQueens(board, row + 1, n, positions);
                board[row][col] = '.';
                positions[row] = 0;
            }
        }
    }

    // Print the board matrix
    public static void printBoard(char[][] board, int n) {
        System.out.println("🔹 Matrix Solution:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(board[i][j] + " ");
            System.out.println();
        }
    }

    // Print the solution as a column position array
    public static void printPositionArray(int[] positions) {
        System.out.print("📍 Column Positions: {");
        for (int i = 0; i < positions.length; i++) {
            System.out.print(positions[i]);
            if (i != positions.length - 1) System.out.print(", ");
        }
        System.out.println("}\n");
    }

    // Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N (Number of Queens): ");
        int n = sc.nextInt();

        char[][] board = new char[n][n];
        int[] positions = new int[n]; // Stores column positions of queens

        for (int i = 0; i < n; i++)
            Arrays.fill(board[i], '.');

        solveNQueens(board, 0, n, positions);
        sc.close();
    }
}