package jav79WordSearch;

public class Solution {
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;

        // Iterate over the entire grid
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                // Start DFS if the first character matches
                if (board[row][col] == word.charAt(0) && dfs(board, word, 0, row, col)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int index, int row, int col) {
        // Base case: if all characters in the word are found
        if (index == word.length()) {
            return true;
        }

        // Check if out of bounds or character does not match
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length || board[row][col] != word.charAt(index)) {
            return false;
        }

        // Mark the current cell as visited (e.g., using a temporary placeholder)
        char temp = board[row][col];
        board[row][col] = '#';

        // Explore all 4 possible directions
        boolean found = dfs(board, word, index + 1, row + 1, col) || // Down
                dfs(board, word, index + 1, row - 1, col) || // Up
                dfs(board, word, index + 1, row, col + 1) || // Right
                dfs(board, word, index + 1, row, col - 1);   // Left

        // Backtrack: Restore the cell's original value
        board[row][col] = temp;

        return found;
    }
}
