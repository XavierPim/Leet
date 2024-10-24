# LeetCode C++ Solutions

## Table of Contents
| Problem # | Problem Name                                   | GoTo                                                              |
|-----------|------------------------------------------------|-------------------------------------------------------------------|
| 1         | Two Sum                                        | [Link](#problem-1-two-sum)                                        |
| 2         | Add Two Numbers                                | [Link](#problem-2-add-two-numbers)                                |
| 3         | Longest Substring Without Repeating Characters | [Link](#problem-3-longest-substring-without-repeating-characters) |
| 4         | Median of Two Sorted Arrays                    | [Link](#problem-4-median-of-two-sorted-arrays)                    |
| 5         | Longest Palindromic Substring                  | [Link](#problem-5-longest-palindromic-substring)                  |
| 6         | Zigzag Conversion                              | [Link](#problem-6-zigzag-conversion)                              |
| 7         | Reverse Integer                                | [Link](#problem-7-reverse-integer)                                |
| 8         | String to Integer                              | [Link](#problem-8-string-to-integer)                              |
| 9         | Palindrome Number                              | [Link](#problem-9-palindrome-number)                              |
---

## Problem #1: Two Sum

### Intuition:
The problem is to find two numbers in an array that sum up to a given target. A brute-force approach would check every possible pair, but that's inefficient. Instead, we can solve this problem efficiently by using a hash map (unordered_map) to store the numbers and their indices as we iterate through the array.

### Approach:
1. We initialize an unordered_map to store numbers as keys and their corresponding indices as values.
2. As we iterate through the array, we calculate the complement of the current number (target - current number).
3. If the complement exists in the map, we've found the two numbers that sum to the target, and we return their indices.
4. Otherwise, we store the current number and its index in the map.
5. The algorithm continues until we find the two numbers or finish iterating.

### Complexity:
- **Time complexity**: O(n), where `n` is the number of elements in the array. Each element is processed once as we perform lookups and insertions in the hash map in constant time.
- **Space complexity**: O(n), since we use extra space to store the hash map, which can contain up to `n` elements in the worst case.


[Solution Code](1_TwoSum/Solution.cpp)

---

## Problem #2: Add Two Numbers

### Intuition:
The problem involves adding two numbers represented as linked lists, where each node contains a single digit. This is similar to manual addition, where we need to consider carrying over any value greater than 9. The linked lists represent the numbers in reverse order, making the least significant digit the head of the list.

### Approach:
1. We initialize pointers for the result linked list and a carry variable to track values greater than 9 during the addition.
2. We iterate through both linked lists, adding corresponding digits along with the carry from the previous addition.
3. If one list is shorter, we continue adding the digits from the longer list, along with any remaining carry.
4. When we reach the end of both lists and if there's still a carry left, we create a new node with the carry value.
5. The process continues until all nodes have been processed and the result linked list is constructed.

### Complexity:
- **Time complexity**: O(max(m, n)), where `m` and `n` are the lengths of the two linked lists. We traverse each list once.
- **Space complexity**: O(max(m, n)), because we need space to store the resulting linked list, which will have at most `max(m, n)` digits, plus an extra digit for carry if necessary.

[Solution Code](2_AddTwoNumbers/Solution.cpp)

---

## Problem #3: Longest Substring Without Repeating Characters

### Intuition:
The problem asks for the longest substring where no character repeats. Using a brute-force approach would involve generating all possible substrings, but this would be inefficient. Instead, we use a sliding window to dynamically check substrings without repeating characters.

### Approach:
We maintain a window using two pointers, `index` and `next`. As `next` moves through the string, we expand the window and add characters to a set. If we encounter a character already in the set, we shrink the window from the left. The maximum window size during this process is the length of the longest substring without repeating characters.

### Complexity:
- **Time complexity**: O(n), where `n` is the length of the string. Both `index` and `next` traverse the string at most once.
- **Space complexity**: O(min(n, m)), where `n` is the length of the string and `m` is the size of the character set.

[Solution Code](3_LongestSubNoRepeat/Solution.cpp)

## Problem #4: Median of Two Sorted Arrays

### Intuition:
The problem asks for the longest substring where no character repeats. Using a brute-force approach would involve generating all possible substrings, but this would be inefficient. Instead, we use a sliding window to dynamically check substrings without repeating characters.

### Approach:
We maintain a window using two pointers, index and next. As next moves through the string, we expand the window and add characters to a set. If we encounter a character already in the set, we shrink the window from the left. The maximum window size during this process is the length of the longest substring without repeating characters.

### Complexity:
- **Time complexity**:  O(n). In the worst case, each character is visited twice (once by the index pointer and once by the next pointer), so the algorithm runs in linear time.
- **Space complexity**:  O(min(n, m)). We use a set to store characters in the current window. The size of the set is bounded by the size of the alphabet m (if characters are from a specific range) or n (the length of the input string). 

[Solution Code](4_MedianTwoSortedArr/Solution.cpp)

## Problem #5: Longest Palindromic Substring

### Intuition:
The problem asks for the longest palindromic substring in a given string. A brute-force approach would involve checking all possible substrings and verifying if they are palindromes, which is inefficient. Instead, we use the Expand Around Center technique. This approach is based on the observation that a palindrome mirrors around its center. For each character (and the space between each character), we expand outward as long as the substring remains a palindrome.

### Approach:
1. We iterate through each character in the string as a potential center for a palindrome.
2. For each character, we expand around it both for odd-length palindromes (single character center) and even-length palindromes (two adjacent characters as the center).
3. During expansion, if the substring is a palindrome, we continue expanding outward. If not, we stop the expansion.
4. We keep track of the longest palindrome found during this process.
5. The result is the longest palindromic substring identified during these expansions.

### Complexity:
- **Time complexity**: O(n),  where n is the length of the string. For each character, we expand outward to check for palindromes, leading to quadratic time complexity.
- **Space complexity**: O(1), since we are not using extra space except for variables to track indices and the resulting longest palindrome.
 
[Solution Code](5_LongestPalindromicSubstring/Solution.cpp)

## Problem #6: Zigzag Conversion

### Intuition:
The goal of the problem is to rearrange a string in a zigzag pattern across a specified number of rows, then read the string row by row. Rather than creating a 2D grid explicitly, we can simulate the row traversal using a vector to store the characters for each row. As we iterate through the string, we switch directions (moving up or down) once we reach either the top or bottom row.

### Approach:
1. We initialize a vector of strings, where each string represents a row in the zigzag pattern.
2. We iterate through each character of the input string and place it in the corresponding row of the vector.
3. When we reach the top or bottom row, we change direction (up or down) accordingly.
4. After processing all characters, we concatenate the strings from each row to obtain the final zigzagged string.

### Complexity:
- **Time complexity**: O(n), where n is the length of the input string. We process each character exactly once, inserting it into one of the rows.
- **Space complexity**: O(n), where n is the length of the input string. We need additional space to store the characters in the row strings before combining them into the final result.
  
[Solution Code](6_ZigzagConversion/Solution.cpp)

## Problem #7: Reverse Integer

### Intuition:
The problem is to reverse the digits of a given 32-bit signed integer. The main challenge is to ensure the reversal doesn't cause an overflow beyond the 32-bit integer range. We can approach this by extracting the digits one by one and building the reversed number while checking for overflow.

### Approach:
1. Initialize result to 0.
2. Use a while loop to process the number:
- - Extract the last digit of the integer by taking the modulus (x % 10).
- - Multiply result by 10 and add the last digit to result.
- - Divide the original integer by 10 to remove the last digit.
- - Check if multiplying result by 10 would cause overflow (i.e., if the value exceeds the 32-bit signed integer limit).
3. If no overflow occurs, return the reversed integer; otherwise, return 0.

### Complexity:
- **Time complexity**: O(logⁿ), where n is the number of digits in the integer (since we process each digit once).
- **Space complexity**: O(1), since we only use a constant amount of extra space for the result, last digit, and input integer.
 
[Solution Code](7_ReverseInteger/Solution.cpp)

## Problem #8: String to Integer

### Intuition:
The problem is to convert a string into a 32-bit signed integer, handling various edge cases like leading/trailing spaces, optional signs ('+' or '-'), and non-numeric characters. The solution should also handle overflow by clamping the result within the 32-bit signed integer range [-2³¹, 2³¹ - 1].

### Approach:
1. Ignore leading spaces: Traverse the string and skip all leading whitespace characters.
2. Check for sign: After skipping spaces, check if the next character is either a '+' or '-'. This determines whether the number will be positive or negative.
3. Convert characters to digits: Loop through the remaining characters, convert them from their character representation to their numeric value, and construct the integer. Stop if a non-numeric character is encountered.
4. Handle overflow: As you build the integer, check if multiplying by 10 and adding a new digit would cause overflow. If it does, return INT_MAX or INT_MIN as appropriate.
5. Return the result: Multiply the integer by the sign and return the final result.

### Complexity:
- **Time complexity**: O(n), where n is the length of the string. We process each character of the string once.
- **Space complexity**: O(1), since we only use a few variables for processing the string and storing the result.
  
[Solution Code](8_StringToInteger/Solution.cpp)

## Problem #9: Palindrome Number

### Intuition:
The goal of this problem is to determine if a given integer is a palindrome without converting it into a string. A number is a palindrome if it reads the same backward as forward. Instead of relying on string manipulation, we attempt to solve the problem using mathematical operations, leveraging the logarithmic properties to calculate the number of digits in the integer. This approach focuses on extracting the most and least significant digits and comparing them to check for symmetry.

### Approach:
1. Handle Edge Cases:
- - If the integer is negative, return false since negative numbers can't be palindromes due to the negative sign.
- - If the integer is 0, return true because 0 is a palindrome.
2. Find the Number of Digits:
- - To determine the number of digits in the integer, we use the formula floor(log10(x)) + 1, where x is the integer. This gives the total number of digits in the number.
- - Extract and Compare Digits:

3. Loop through half of the digits and compare the corresponding most significant and least significant digits.
- - The least significant digit is extracted using modulus and division (x % 10).
- - The most significant digit is extracted by dividing the number by the appropriate power of 10 to shift the digit to the least significant position.
4. Return the Result:
- - If all corresponding digits match, the number is a palindrome.
- - If any mismatch is found, return false.

### Complexity:
- **Time complexity**:O(log₁₀(x)), where x is the given integer. The time complexity depends on the number of digits in the number. Since we compare each pair of digits only once, this results in logarithmic complexity.
- **Space complexity**: O(1), as we only use a few variables to store results and perform the digit comparisons.

[Solution Code]9_PalindromeNumber/Solution.cpp)