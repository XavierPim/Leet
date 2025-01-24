package jav79WordSearch;

public class Main {
    public static void main(String[] args) {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        String word = "ABCCED";
        Solution solution = new Solution();
        boolean result = solution.exist(board, word);
        System.out.println(result);
    }
}
