# LeetCode C++ Solutions

## Table of Contents
| Problem # | Problem Name                                   | GoTo                                                              |
|-----------|------------------------------------------------|-------------------------------------------------------------------|
| 1         | Two Sum                                        | [Link](#problem-1-two-sum)                                        |
| 2         | Add Two Numbers                                | [Link](#problem-2-add-two-numbers)                                |
| 3         | Longest Substring Without Repeating Characters | [Link](#problem-3-longest-substring-without-repeating-characters) |
| 4         | Median of Two Sorted Arrays                    | [Link](#problem-4-longest-substring-without-repeating-characters) |
| 5         | Longest Palindromic Substring                  | [Link](#problem-4-longest-palindromic-substring)       |
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

## Problem #4: Longest Substring Without Repeating Characters

### Intuition:
The problem asks for the longest substring where no character repeats. Using a brute-force approach would involve generating all possible substrings, but this would be inefficient. Instead, we use a sliding window to dynamically check substrings without repeating characters.

### Approach:
We maintain a window using two pointers, index and next. As next moves through the string, we expand the window and add characters to a set. If we encounter a character already in the set, we shrink the window from the left. The maximum window size during this process is the length of the longest substring without repeating characters.

### Complexity:
- **Time complexity**:  O(n). In the worst case, each character is visited twice (once by the index pointer and once by the next pointer), so the algorithm runs in linear time.
- **Space complexity**:  O(min(n, m)). We use a set to store characters in the current window. The size of the set is bounded by the size of the alphabet m (if characters are from a specific range) or n (the length of the input string). 

[Solution Code](4_MedianTwoSortedArr/Solution.cpp)

## Problem #4: Longest Palindromic Substring

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