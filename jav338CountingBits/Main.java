package jav338CountingBits;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 5;
        int[] result = solution.countBits(n);
        System.out.print("[");
        for (int i = 0; i < n + 1; i++) {
            System.out.print(result[i]);
            if (i < n) {
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}
