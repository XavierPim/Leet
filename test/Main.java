package test;
import java.util.*;
import java.io.*;

class Main {

        public static String MathChallenge(int num) {
            // Convert number to char array
            char[] digits = String.valueOf(num).toCharArray();
            int n = digits.length;

            // Find the pivot (rightmost digit smaller than the one next to it)
            int i = n - 2;
            while (i >= 0 && digits[i] >= digits[i + 1]) {
                i--;
            }

            // If no greater permutation exists, return -1
            if (i == -1) return "-1";

            // Find the smallest digit on the right that is larger than digits[i]
            int j = n - 1;
            while (digits[j] <= digits[i]) {
                j--;
            }

            // Swap pivot with the next greater element
            swap(digits, i, j);

            // Reverse the right part to get the next smallest permutation
            reverse(digits, i + 1, n - 1);

            // Convert back to string
            String output = new String(digits);

            // Concatenate Challenge Token
            String challengeToken = "p9mye5j763";
            String finalOutput = output + challengeToken;

            // Replace every fourth character with '_'
            finalOutput = replaceEveryFourthCharacter(finalOutput);

            return finalOutput;
        }

        // Helper function to swap two elements in a char array
        private static void swap(char[] arr, int i, int j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // Helper function to reverse a section of the char array
        private static void reverse(char[] arr, int start, int end) {
            while (start < end) {
                swap(arr, start, end);
                start++;
                end--;
            }
        }

        // Function to replace every fourth character with '_'
        private static String replaceEveryFourthCharacter(String str) {
            StringBuilder sb = new StringBuilder(str);
            for (int i = 3; i < sb.length(); i += 4) {
                sb.setCharAt(i, '_');
            }
            return sb.toString();
        }

        public static void main (String[] args) {
            // keep this function call here
            Scanner s = new Scanner(System.in);
            System.out.print(MathChallenge(Integer.parseInt(s.nextLine())));
            s.close();
        }
    }

//import java.util.Scanner;
//
//class MathChallenge {
//
//    public static String MathChallenge(int num, String challengeToken) {
//        // Convert number to char array
//        char[] digits = String.valueOf(num).toCharArray();
//        int n = digits.length;
//
//        // Find the pivot (rightmost digit smaller than the one next to it)
//        int i = n - 2;
//        while (i >= 0 && digits[i] >= digits[i + 1]) {
//            i--;
//        }
//
//        // If no greater permutation exists, return -1
//        if (i == -1) return "-1";
//
//        // Find smallest digit on the right that is larger than digits[i]
//        int j = n - 1;
//        while (digits[j] <= digits[i]) {
//            j--;
//        }
//
//        // Swap pivot with the next greater element
//        swap(digits, i, j);
//
//        // Reverse the right part to get the next smallest permutation
//        reverse(digits, i + 1, n - 1);
//
//        // Final number as string
//        String output = new String(digits);
//
//        // Concatenate Challenge Token
//        String finalOutput = output + challengeToken;
//
//        // Replace every fourth character with '_'
//        finalOutput = replaceEveryFourthCharacter(finalOutput);
//
//        return finalOutput;
//    }
//
//    // Helper function to swap two elements in a char array
//    private static void swap(char[] arr, int i, int j) {
//        char temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//
//    // Helper function to reverse a section of the char array
//    private static void reverse(char[] arr, int start, int end) {
//        while (start < end) {
//            swap(arr, start, end);
//            start++;
//            end--;
//        }
//    }
//
//    // Function to replace every fourth character with '_'
//    private static String replaceEveryFourthCharacter(String str) {
//        StringBuilder sb = new StringBuilder(str);
//        for (int i = 3; i < sb.length(); i += 4) {
//            sb.setCharAt(i, '_');
//        }
//        return sb.toString();
//    }
//
//    public static void main(String[] args) {
//        // Take input from user
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int input = s.nextInt();
//        s.close();
//
//        // Define the Challenge Token
//        String challengeToken = "p9mye5j763";
//
//        // Compute next greater permutation with ChallengeToken formatting
//        String result = MathChallenge(input, challengeToken);
//        System.out.println(result);
//    }
//}
