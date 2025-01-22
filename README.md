# LeetCode C++ Solutions

## Table of Contents

| Problem # | Problem Name                                   | GoTo                                                              | Language |
|-----------|------------------------------------------------|-------------------------------------------------------------------|----------|
| 1         | Two Sum                                        | [Link](#problem-1-two-sum)                                        | C++      |  
| 2         | Add Two Numbers                                | [Link](#problem-2-add-two-numbers)                                | C++      |
| 3         | Longest Substring Without Repeating Characters | [Link](#problem-3-longest-substring-without-repeating-characters) | C++      |
| 4         | Median of Two Sorted Arrays                    | [Link](#problem-4-median-of-two-sorted-arrays)                    | C++      |
| 5         | Longest Palindromic Substring                  | [Link](#problem-5-longest-palindromic-substring)                  | C++      |
| 6         | Zigzag Conversion                              | [Link](#problem-6-zigzag-conversion)                              | C++      |
| 7         | Reverse Integer                                | [Link](#problem-7-reverse-integer)                                | C++      |
| 8         | String to Integer                              | [Link](#problem-8-string-to-integer)                              | C++      |
| 9         | Palindrome Number                              | [Link](#problem-9-palindrome-number)                              | C++      |
| 10        | Regular Expression Matching                    | [Link](#problem-10-regular-expression-matching)                   | C++      |
| 11        | Container with Most Water                      | [Link](#problem-11-container-with-most-water)                     | Java     |
| 15        | 3Sum                                           | [Link](#problem-15-3Sum)                                          | Java     |
| 19        | Remove Nth Node From End of List               | [Link](#problem-19-remove-nth-node-from-end-of-list)              | Java     |
| 20        | Valid Parentheses                              | [Link](#problem-20-valid-parentheses)                             | Java     |
| 21        | Merge Two Sorted Lists                         | [Link](#problem-21-merge-two-sorted-lists)                        | C++      |
| 23        | Merge K Sorted Lists                           | [Link](#problem-23-merge-k-sorted-lists)                          | C++      |
| 33        | Search in Rotated Sorted Array                 | [Link](#problem-33-search-in-rotated-sorted-array)                | Java     |
| 48        | Rotate Image                                   | [Link](#problem-48-rotate-image)                                  | Java     |
| 49        | Group Anagrams                                 | [Link](#problem-49-group-anagrams)                                | Java     |
| 53        | Maximum Subarray                               | [Link](#problem-53-maximum-subarray)                              | Java     |
| 54        | Spiral Matrix                                  | [Link](#problem-54-spiral-matrix)                                 | Java     |
| 73        | Set Matrix Zero                                | [Link](#problem-73-set-matrix-zero)                               | Java     |
| 76        | Minimum Window Substring                       | [Link](#problem-76-minimum-window-substring)                      | Java     |
| 121       | Best Time to Buy and Sell                      | [Link](#problem-121-best-time-to-buy-and-sell-stock)              | C++      |
| 141       | Link List Cycle                                | [Link](#problem-141-linked-list-cycle)                            | Java     |
| 143       | Reorder List                                   | [Link](#problem-143-reorder-list)                                 | Java     |
| 150       | Evaluate Reverse Polish Notation               | [Link](#problem-150-evaluate-reverse-polish-notation)             | C++      |
| 152       | Maximum Product Subarray                       | [Link](#problem-152-maximum-product-subarray)                     | Java     |
| 153       | Find Minimum in Rotated Sorted Array           | [Link](#problem-153-find-minimum-in-rotated-sorted-array)         | Java     |
| 190       | Reverse Bits                                   | [Link](#problem-190-reverse-bits)                                 | Java     |
| 191       | Number of 1 Bits                               | [Link](#problem-191-number-of-1-bits)                             | Java     |
| 206       | Reverse a Linked List                          | [Link](#problem-206-reverse-linked-list)                          | C++      |
| 217       | Contains Duplicate                             | [Link](#problem-217-contains-duplicate)                           | C++      |
| 238       | Product of Array Except Self                   | [Link](#problem-238-product-of-array-except-self)                 | C++      |
| 242       | Valid Anagram                                  | [Link](#problem-242-valid-anagram)                                | Java     |
| 268       | Missing Number                                 | [Link](#problem-268-missing-number)                               | Java     |
| 338       | Counting Bits                                  | [Link](#problem-338-counting-bits)                                | Java     |
| 371       | Sum of Two Integers                            | [Link](#problem-371-sum-of-two-integers)                          | Java     |
| 424       | Longest Repeating Character Replacement        | [Link](#problem-424-longest-repeating-character-replacement)      | Java     |

---

## Problem #1: Two Sum

### Intuition:

The problem is to find two numbers in an array that sum up to a given target. A brute-force approach would check every
possible pair, but that's inefficient. Instead, we can solve this problem efficiently by using a hash map (
unordered_map) to store the numbers and their indices as we iterate through the array.

### Approach:

1. We initialize an unordered_map to store numbers as keys and their corresponding indices as values.
2. As we iterate through the array, we calculate the complement of the current number (target - current number).
3. If the complement exists in the map, we've found the two numbers that sum to the target, and we return their indices.
4. Otherwise, we store the current number and its index in the map.
5. The algorithm continues until we find the two numbers or finish iterating.

### Complexity:

- **Time complexity**: O(n), where `n` is the number of elements in the array. Each element is processed once as we
  perform lookups and insertions in the hash map in constant time.
- **Space complexity**: O(n), since we use extra space to store the hash map, which can contain up to `n` elements in
  the worst case.

[Solution Code](1_TwoSum/Solution.cpp)

---

## Problem #2: Add Two Numbers

### Intuition:

The problem involves adding two numbers represented as linked lists, where each node contains a single digit. This is
similar to manual addition, where we need to consider carrying over any value greater than 9. The linked lists represent
the numbers in reverse order, making the least significant digit the head of the list.

### Approach:

1. We initialize pointers for the result linked list and a carry variable to track values greater than 9 during the
   addition.
2. We iterate through both linked lists, adding corresponding digits along with the carry from the previous addition.
3. If one list is shorter, we continue adding the digits from the longer list, along with any remaining carry.
4. When we reach the end of both lists and if there's still a carry left, we create a new node with the carry value.
5. The process continues until all nodes have been processed and the result linked list is constructed.

### Complexity:

- **Time complexity**: O(max(m, n)), where `m` and `n` are the lengths of the two linked lists. We traverse each list
  once.
- **Space complexity**: O(max(m, n)), because we need space to store the resulting linked list, which will have at most
  `max(m, n)` digits, plus an extra digit for carry if necessary.

[Solution Code](2_AddTwoNumbers/Solution.cpp)

---

## Problem #3: Longest Substring Without Repeating Characters

### Intuition:

The problem asks for the longest substring where no character repeats. Using a brute-force approach would involve
generating all possible substrings, but this would be inefficient. Instead, we use a sliding window to dynamically check
substrings without repeating characters.

### Approach:

We maintain a window using two pointers, `index` and `next`. As `next` moves through the string, we expand the window
and add characters to a set. If we encounter a character already in the set, we shrink the window from the left. The
maximum window size during this process is the length of the longest substring without repeating characters.

### Complexity:

- **Time complexity**: O(n), where `n` is the length of the string. Both `index` and `next` traverse the string at most
  once.
- **Space complexity**: O(min(n, m)), where `n` is the length of the string and `m` is the size of the character set.

[Solution Code](3_LongestSubNoRepeat/Solution.cpp)

## Problem #4: Median of Two Sorted Arrays

### Intuition:

The problem asks for the longest substring where no character repeats. Using a brute-force approach would involve
generating all possible substrings, but this would be inefficient. Instead, we use a sliding window to dynamically check
substrings without repeating characters.

### Approach:

We maintain a window using two pointers, index and next. As next moves through the string, we expand the window and add
characters to a set. If we encounter a character already in the set, we shrink the window from the left. The maximum
window size during this process is the length of the longest substring without repeating characters.

### Complexity:

- **Time complexity**:  O(n). In the worst case, each character is visited twice (once by the index pointer and once by
  the next pointer), so the algorithm runs in linear time.
- **Space complexity**:  O(min(n, m)). We use a set to store characters in the current window. The size of the set is
  bounded by the size of the alphabet m (if characters are from a specific range) or n (the length of the input string).

[Solution Code](4_MedianTwoSortedArr/Solution.cpp)

## Problem #5: Longest Palindromic Substring

### Intuition:

The problem asks for the longest palindromic substring in a given string. A brute-force approach would involve checking
all possible substrings and verifying if they are palindromes, which is inefficient. Instead, we use the Expand Around
Center technique. This approach is based on the observation that a palindrome mirrors around its center. For each
character (and the space between each character), we expand outward as long as the substring remains a palindrome.

### Approach:

1. We iterate through each character in the string as a potential center for a palindrome.
2. For each character, we expand around it both for odd-length palindromes (single character center) and even-length
   palindromes (two adjacent characters as the center).
3. During expansion, if the substring is a palindrome, we continue expanding outward. If not, we stop the expansion.
4. We keep track of the longest palindrome found during this process.
5. The result is the longest palindromic substring identified during these expansions.

### Complexity:

- **Time complexity**: O(n), where n is the length of the string. For each character, we expand outward to check for
  palindromes, leading to quadratic time complexity.
- **Space complexity**: O(1), since we are not using extra space except for variables to track indices and the resulting
  longest palindrome.

[Solution Code](5_LongestPalindromeSubstring/Solution.cpp)

## Problem #6: Zigzag Conversion

### Intuition:

The goal of the problem is to rearrange a string in a zigzag pattern across a specified number of rows, then read the
string row by row. Rather than creating a 2D grid explicitly, we can simulate the row traversal using a vector to store
the characters for each row. As we iterate through the string, we switch directions (moving up or down) once we reach
either the top or bottom row.

### Approach:

1. We initialize a vector of strings, where each string represents a row in the zigzag pattern.
2. We iterate through each character of the input string and place it in the corresponding row of the vector.
3. When we reach the top or bottom row, we change direction (up or down) accordingly.
4. After processing all characters, we concatenate the strings from each row to obtain the final zigzagged string.

### Complexity:

- **Time complexity**: O(n), where n is the length of the input string. We process each character exactly once,
  inserting it into one of the rows.
- **Space complexity**: O(n), where n is the length of the input string. We need additional space to store the
  characters in the row strings before combining them into the final result.

[Solution Code](6_ZigzagConversion/Solution.cpp)

## Problem #7: Reverse Integer

### Intuition:

The problem is to reverse the digits of a given 32-bit signed integer. The main challenge is to ensure the reversal
doesn't cause an overflow beyond the 32-bit integer range. We can approach this by extracting the digits one by one and
building the reversed number while checking for overflow.

### Approach:

1. Initialize result to 0.
2. Use a while loop to process the number:

-
    - Extract the last digit of the integer by taking the modulus (x % 10).
-
    - Multiply result by 10 and add the last digit to result.
-
    - Divide the original integer by 10 to remove the last digit.
-
    - Check if multiplying result by 10 would cause overflow (i.e., if the value exceeds the 32-bit signed integer
      limit).

3. If no overflow occurs, return the reversed integer; otherwise, return 0.

### Complexity:

- **Time complexity**: O(logⁿ), where n is the number of digits in the integer (since we process each digit once).
- **Space complexity**: O(1), since we only use a constant amount of extra space for the result, last digit, and input
  integer.

[Solution Code](7_ReverseInteger/Solution.cpp)

## Problem #8: String to Integer

### Intuition:

The problem is to convert a string into a 32-bit signed integer, handling various edge cases like leading/trailing
spaces, optional signs ('+' or '-'), and non-numeric characters. The solution should also handle overflow by clamping
the result within the 32-bit signed integer range [-2³¹, 2³¹ - 1].

### Approach:

1. Ignore leading spaces: Traverse the string and skip all leading whitespace characters.
2. Check for sign: After skipping spaces, check if the next character is either a '+' or '-'. This determines whether
   the number will be positive or negative.
3. Convert characters to digits: Loop through the remaining characters, convert them from their character representation
   to their numeric value, and construct the integer. Stop if a non-numeric character is encountered.
4. Handle overflow: As you build the integer, check if multiplying by 10 and adding a new digit would cause overflow. If
   it does, return INT_MAX or INT_MIN as appropriate.
5. Return the result: Multiply the integer by the sign and return the final result.

### Complexity:

- **Time complexity**: O(n), where n is the length of the string. We process each character of the string once.
- **Space complexity**: O(1), since we only use a few variables for processing the string and storing the result.

[Solution Code](8_StringToInteger/Solution.cpp)

## Problem #9: Palindrome Number

### Intuition:

The goal of this problem is to determine if a given integer is a palindrome without converting it into a string. A
number is a palindrome if it reads the same backward as forward. Instead of relying on string manipulation, we attempt
to solve the problem using mathematical operations, leveraging the logarithmic properties to calculate the number of
digits in the integer. This approach focuses on extracting the most and least significant digits and comparing them to
check for symmetry.

### Approach:

1. Handle Edge Cases:

-
    - If the integer is negative, return false since negative numbers can't be palindromes due to the negative sign.
-
    - If the integer is 0, return true because 0 is a palindrome.

2. Find the Number of Digits:

-
    - To determine the number of digits in the integer, we use the formula floor(log10(x)) + 1, where x is the integer.
      This gives the total number of digits in the number.
-
    - Extract and Compare Digits:

3. Loop through half of the digits and compare the corresponding most significant and least significant digits.

-
    - The least significant digit is extracted using modulus and division (x % 10).
-
    - The most significant digit is extracted by dividing the number by the appropriate power of 10 to shift the digit
      to the least significant position.

4. Return the Result:

-
    - If all corresponding digits match, the number is a palindrome.
-
    - If any mismatch is found, return false.

### Complexity:

- **Time complexity**:O(log₁₀(x)), where x is the given integer. The time complexity depends on the number of digits in
  the number. Since we compare each pair of digits only once, this results in logarithmic complexity.
- **Space complexity**: O(1), as we only use a few variables to store results and perform the digit comparisons.

[Solution Code](9_PalindromeNumber/Solution.cpp)

## Problem #10: Regular Expression Matching

### Intuition:

The problem is to determine if a given string matches a pattern that can include wildcards. The pattern can contain:

. which matches any single character.

* which matches zero or more occurrences of the preceding element.

### Approach:

1. Dynamic Programming (DP) Table Setup: Create a 2D DP table where dp[i][j] indicates whether the first i characters of
   the string match the first j characters of the pattern.
2. Initialization: Initialize dp[0][0] to true, as an empty pattern matches an empty string. Handle cases where the
   pattern starts with *.
3. Filling the DP Table:

- Iterate through each character in the string and the pattern.
- If the current character in the pattern is *, check:
-
    - If * represents zero occurrences of the preceding character (i.e., match dp[i][j-2]).
-
    - If it represents one or more occurrences (i.e., match dp[i-1][j] if the current character in the string matches
      the character before *).
- If the current character is a normal character or ., check if they match and propagate the match status from the
  previous characters.

4. Final Result: The value of dp[n][m] (where n is the length of the string and m is the length of the pattern) will
   indicate whether the entire string matches the entire pattern.

### Complexity:

- **Time complexity**: O(n * m), where n is the length of the string and m is the length of the pattern. Each cell in
  the DP table is computed based on previous cells, leading to a nested iteration.
- **Space complexity**: O(n * m) for the DP table. However, this can be optimized to O(m) by only keeping track of the
  current and previous rows.

[Solution Code](10_RegularExpressionMatching/Solution.cpp)

## Problem #11: Container With Most Water

### Intuition:

The problem involves finding two vertical lines from an array of heights that, along with the x-axis, form a container
that can hold the maximum amount of water. The area of water that can be held by two lines depends on:

- The height of the shorter line (because water can't exceed this height).
- The distance between the two lines (breadth).
  The goal is to maximize:

Area = min(height[left], height[right]) × (right−left)
The two-pointer approach is ideal here because it efficiently narrows down the search for the maximum area.

### Approach:

1. Two Pointers:

- Place one pointer (left) at the beginning of the array and the other (right) at the end.
- Calculate the area using the formula:
-
    - Area=min(height[left], height[right])×(right−left)
- Update maxArea if the current area is larger.

2. Move the Shorter Line:

- Move the pointer pointing to the shorter line inward (left++ or right--) to potentially find a taller line that could
  increase the area.
- Repeat until the two pointers meet.

3. Edge Cases:

- Minimum input size (height.length == 2).
- Arrays with all equal heights.

### Complexity:

- **Time complexity**: O(n) Each pointer is processed at most once.
- **Space complexity**: O(1) No additional data structures are used.
  [Solution Code](jav11ContainerWithMostWater/Solution.java)

## Problem #15: 3Sum

### Intuition:

The 3Sum problem requires finding all unique triplets in an array that sum up to zero. Sorting the array simplifies this
process, as it allows efficient traversal using a fixed pivot and the two-pointer technique. In this implementation, we
used QuickSort to sort the array in O(nlogn), which complements the subsequent two-pointer approach.

### Approach:

1. Sort the Array with QuickSort:

- Sorting the array using QuickSort ensures efficient traversal and helps in skipping duplicates.

2. Iterate with a Pivot:

- Fix one element (the pivot) in the triplet using a loop.
- Skip duplicate values for the pivot to avoid duplicate triplets.

3. Two-Pointer Search:

- Use two pointers (left and right) to find two additional elements that, when added to the pivot, sum to zero.
- Adjust the pointers based on the sum:
-
    - If the sum is zero, add the triplet to the result and move both pointers inward.
-
    - If the sum is less than zero, increment the left pointer to increase the sum.
-
    - If the sum is greater than zero, decrement the right pointer to decrease the sum.
- Skip duplicate values for both left and right to ensure unique triplets.

4. Handle Edge Cases:

- If the input array has fewer than three elements, return an empty list.
- Ensure proper handling of duplicate triplets by skipping repeated values.

5. Return the Result:

- After processing all potential pivots, return the list of triplets.

### Complexity:

- **Time complexity**:
-
    - Sorting the array using QuickSort takes
-
    - The two-pointer search is O(n^2) in total, as it runs once for each element.
-
    - Overall complexity:O(n^2).
- **Space complexity**:O(k) Sorting with QuickSort is in-place, so no additional memory is required for the array.

[Solution Code](jav15ThreeSum/Solution.java)

## Problem #19: Remove Nth Node From End of List

### Intuition:

The goal of this problem is to remove the \(n\)-th node from the end of a singly linked list in one pass. To achieve this, we can use the **two-pointer technique**, which allows us to efficiently find the node to be removed without requiring multiple passes or extra memory.

By maintaining a gap of \(n\) nodes between two pointers (`fast` and `slow`), we ensure that when `fast` reaches the end of the list, `slow` will be just before the node to be removed.

### Approach:

1. **Initialize a Dummy Node**:
    - Create a dummy node and set its `next` to the head of the linked list. This simplifies edge cases, such as removing the first node.
    - Set two pointers, `fast` and `slow`, both starting at the dummy node.

2. **Move the Fast Pointer**:
    - Advance the `fast` pointer \(n + 1\) steps forward. This creates a gap of \(n\) nodes between `fast` and `slow`.

3. **Move Both Pointers**:
    - Move `fast` and `slow` one step at a time until `fast` reaches the end of the list. At this point, `slow` will point to the node just before the \(n\)-th node from the end.

4. **Remove the Target Node**:
    - Modify `slow.next` to skip the \(n\)-th node from the end by pointing it to `slow.next.next`.

5. **Return the Result**:
    - Return `dummy.next`, which is the head of the updated linked list.

### Complexity:

- **Time Complexity**: \(O(L)\), where \(L\) is the length of the linked list. The list is traversed once.
- **Space Complexity**: \(O(1)\), as the operation is performed in place without using additional memory.

### Key Notes:
- The dummy node simplifies the implementation by handling edge cases like removing the first node or dealing with an empty list.
- This approach ensures a single-pass solution, which is optimal for this problem.

### Example:

Input: `head = [1, 2, 3, 4, 5], n = 2`  
Output: `[1, 2, 3, 5]`

**Steps**:
1. Move `fast` pointer \(n + 1 = 3\) steps ahead:
    - After 3 steps, `fast` points to the node with value `3`.

2. Move both pointers until `fast` reaches the end:
    - `fast` at `5`, `slow` at `3`.

3. Modify `slow.next` to skip the node with value `4`.

4. Return the updated list: `[1, 2, 3, 5]`.


[Solution Code](jav19RemoveNthNodeFromEndOfList/Solutions.java)

## Problem #20: Valid Parentheses

### Intuition:
The problem involves checking if a given string of parentheses is valid. A string is valid if:
1. Every opening parenthesis has a corresponding closing parenthesis.
2. Parentheses are closed in the correct order.

To solve this efficiently, we can use a **stack** data structure to match opening and closing parentheses as we traverse the string.

---

### Approach:
1. **Use a Stack**:
    - Push every opening parenthesis (`{`, `[`, `(`) onto the stack.
    - When encountering a closing parenthesis (`}`, `]`, `)`):
        - Check if the stack is non-empty and the top of the stack matches the current closing parenthesis.
        - If the stack is empty or the top does not match, the string is invalid.

2. **Matching Logic**:
    - Use pairs to ensure that:
        - `{` matches with `}`.
        - `[` matches with `]`.
        - `(` matches with `)`.

3. **Final Check**:
    - After traversing the string, the stack should be empty. If not, it means there are unmatched opening parentheses.

---

### Complexity:
- **Time Complexity**: \( O(n) \)
    - Each character in the string is processed once.
- **Space Complexity**: \( O(n) \)
    - The stack stores unmatched opening parentheses, which can be at most \( n/2 \) for a valid string.

[Solution Code](jav20ValidParentheses/Solution.java)

## Problem #21: Merge Two Sorted Lists

### Intuition:

The goal of this problem is to merge two sorted linked lists into a single sorted linked list. By leveraging the fact that both input lists are already sorted, we can achieve this efficiently without requiring additional sorting operations.

The key is to iterate through both lists, comparing their elements, and appending the smaller element to the merged list at each step. This ensures that the resulting list remains sorted throughout the merging process.

### Approach:

1. **Create a Dummy Node**:
    - Use a dummy node to simplify the implementation. The merged list will be constructed starting from this dummy node.
    - A `current` pointer is initialized to the dummy node to track the tail of the merged list.

2. **Traverse Both Lists**:
    - Use two pointers (`head_A` and `head_B`) to traverse the input lists (`list1` and `list2`).
    - At each step:
        - Compare the values of the nodes pointed to by `head_A` and `head_B`.
        - Attach the smaller node to the `current` pointer's `next`.
        - Advance the pointer (either `head_A` or `head_B`) of the list from which the node was taken.
        - Move the `current` pointer forward.

3. **Attach Remaining Nodes**:
    - Once one of the lists is fully traversed, attach the remaining nodes of the other list to the merged list.

4. **Return the Result**:
    - The merged list starts at `dummy->next`. Return this node as the head of the merged list.

### Complexity:

- **Time complexity**: \( O(n + m) \)
    - Both input lists are traversed once, where \( n \) and \( m \) are the lengths of the two lists.
- **Space complexity**: \( O(1) \)
    - The merging is done in place without using additional memory for storing nodes.

[Solution Code](21_MergeTwoSortedLists/Solution.cpp)

## Problem #23: Merge K Sorted Lists

### Intuition:

The goal of this problem is to merge \( k \) sorted linked lists into a single sorted linked list. Since each of the input lists is already sorted, we can leverage this property to merge them efficiently. Instead of sorting all the nodes from scratch, we can repeatedly merge two lists at a time until only one merged list remains.

By merging the lists iteratively, we minimize the overhead of repeatedly handling all nodes, ensuring a more efficient solution.

### Approach:

1. **Iterative Merging**:
    - Initialize the result list as `nullptr`.
    - Traverse through the array of \( k \) linked lists and iteratively merge each list into the result using a helper function (`mergeTwoSortedLists`).

2. **Helper Function**:
    - Use the `mergeTwoSortedLists` function to merge two sorted linked lists.
    - Create a dummy node to simplify the merging logic.
    - Compare the nodes from both lists, attaching the smaller node to the merged list at each step.
    - After merging, return the list starting from `dummy->next`.

3. **Edge Cases**:
    - If the input array is empty, return `nullptr`.
    - If any of the lists in the input array is empty, skip it during merging.

### Complexity:

- **Time Complexity**: \( O(N \times k) \)
    - Where \( N \) is the average number of nodes in each list, and \( k \) is the number of lists.
    - Each merge operation takes \( O(N) \), and there are \( k \) lists to merge iteratively.
- **Space Complexity**: \( O(1) \)
    - The merging is done in place without using additional memory for nodes.

### Key Notes:
- The iterative approach simplifies implementation without requiring a priority queue or recursion.
- This solution can be optimized further using a divide-and-conquer approach or a min-heap.

[Solution Code](23_MergeKSortedLists/Solution.cpp)

## Problem #33: Search In Rotated Sorted Array

### Intuition:

In a rotated sorted array, the array is initially sorted in ascending order but then "rotated" at some unknown pivot.
This means one half of the array remains sorted, while the other half is rotated. By leveraging this property, we can
use a modified binary search to find the target in O(logn) time.

### Approach:

1. Binary Search with Adjustments:

- Initialize pointers left and right to represent the search range.
- Calculate the midpoint mid at each step and check if it matches the target.

2. Determine Which Half is Sorted:

- If nums[left] <= nums[mid], the left side is sorted.
- Check if the target lies within nums[left] and nums[mid].
-
    - If it does, continue searching in the left half.
-
    - Otherwise, search the right half.
- If nums[mid] <= nums[right], the right side is sorted.
-
    - Check if the target lies within nums[mid] and nums[right].
-
    -
        - If it does, continue searching in the right half.
-
    -
        - Otherwise, search the left half.

3. Recursive Search:

- Continue the search by narrowing down the range until the base case is met.
- Base cases:
-
    - If left > right, the target is not present, so return -1.
-
    - If nums[mid] == target, return mid.

### Complexity:

- **Time complexity**: O(logn), as the array is halved in each recursive call.
- **Space complexity**: O(logn) due to the recursive stack, but can be reduced to O(1) if implemented iteratively.

[Solution Code](jav33SearchInRotatedSortedArray/Solution.java)

## Problem #48: Rotate Image

### Intuition:

The goal is to rotate a given \(n \times n\) 2D matrix by 90 degrees clockwise **in place**, meaning no additional memory is used to store a new matrix. This can be achieved by rotating the matrix layer by layer, starting from the outermost layer and working inward.

For each layer, the elements along the edges of the matrix are cyclically swapped in a clockwise direction:
1. Top-left becomes top-right.
2. Top-right becomes bottom-right.
3. Bottom-right becomes bottom-left.
4. Bottom-left becomes top-left.

This process is repeated for all layers until the matrix is fully rotated.

### Approach:

1. **Define Boundaries**:
    - Use `leftBound` and `rightBound` to track the boundaries of the current layer being rotated.
    - Start with `leftBound = 0` and `rightBound = n - 1`.

2. **Iterate Through Layers**:
    - While `leftBound < rightBound`, process the current layer by rotating its elements in a clockwise direction.
    - For each element in the layer:
        - Save the top-left element in a temporary variable.
        - Move the bottom-left element to the top-left position.
        - Move the bottom-right element to the bottom-left position.
        - Move the top-right element to the bottom-right position.
        - Move the saved top-left element to the top-right position.

3. **Shrink the Boundaries**:
    - After processing the current layer, increment `leftBound` and decrement `rightBound` to move inward to the next layer.

4. **Repeat Until All Layers Are Rotated**:
    - Continue until all layers are rotated, i.e., when `leftBound >= rightBound`.

### Complexity:

- **Time Complexity**: \(O(n^2)\)
    - Each element of the matrix is visited exactly once.
- **Space Complexity**: \(O(1)\)
    - The rotation is performed in place without using additional memory.

[Solution Code](jav48RotateImage/Solution.java)

## Problem #49: Group Anagrams

### Intuition:
The goal is to group strings that are anagrams of each other. An anagram is a word formed by rearranging the letters of another, such as "eat" and "tea". The challenge includes handling edge cases like empty strings (`""`) and ensuring that all anagrams are grouped correctly.

1. **Anagram Detection**:
    - Two strings are anagrams if their sorted character arrays are identical.

2. **Grouping Logic**:
    - Use a temporary list (`tempList`) to collect anagrams of a string.
    - Process each string only once and dynamically group anagrams together.

3. **Edge Case: Empty Strings**:
    - Group all empty strings (`""`) together at the start to simplify the main logic.


### Approach:
1. **Collect Empty Strings**:
    - Separate empty strings into their own group and remove them from the main list.

2. **Group Non-Empty Strings**:
    - Iterate through the remaining strings and group anagrams together:
        - Pick a string as the base (`currStr`).
        - Compare it with all remaining strings to find its anagrams.
        - Remove matched anagrams from the list to avoid reprocessing.

3. **Helper Function for Anagram Detection**:
    - Sort the characters of two strings and check if they are identical.

4. **Add Groups to the Result**:
    - After processing a group, add it to the result list and clear temporary variables.

### Complexity:
- **Time Complexity**:
    - Collecting empty strings: \( O(n) \), where \( n \) is the number of strings.
    - Outer loop: \( O(n) \), iterating through all strings.
    - Inner loop: \( O(n^2) \), comparing each string with the rest.

[Solution Code](jav49GroupAnagrams/Solution.java)

## Problem #53: Maximum Subarray

### Intuition:

The goal is to find a contiguous subarray within a given array of integers that has the largest possible sum. A
brute-force approach might involve calculating all possible subarray sums, but this would be inefficient for large
arrays. Instead, we can use Kadane's Algorithm, which allows us to find the maximum sum in a single pass through the
array.

### Approach:

1. Initialize two variables: compareSum to track the maximum sum of the subarray ending at each index, and maxSum to
   store the overall maximum sum found.
2. Iterate through the array:

- For each element, decide if it's better to start a new subarray with this element alone or to continue adding it to
  the existing subarray (compareSum).
- Update compareSum as the maximum of the current element itself or the current element plus compareSum.
- Update maxSum if compareSum is greater than the previous maxSum.

3. Return maxSum after the loop finishes. This holds the largest sum of any contiguous subarray in the array.

### Complexity:

- **Time complexity**: O(n), where n is the length of the array, because we make only one pass through the array.
- **Space complexity**: O(1), as we only use a few extra variables (compareSum and maxSum) and don’t require any
  additional data structures.

[Solution Code](jav53MaximumSubarray/Solution.java)

## Problem #54: Spiral Matrix

### Intuition:

The goal is to traverse a 2D matrix in a **spiral order** starting from the top-left corner. The traversal must move in a defined pattern:
1. From **left to right** along the top row.
2. From **top to bottom** along the rightmost column.
3. From **right to left** along the bottom row.
4. From **bottom to top** along the leftmost column.

This pattern is repeated, shrinking the boundaries of the matrix after completing each direction, until all elements are visited.

The key is to manage **boundaries** (`top`, `bottom`, `left`, `right`) and update them after processing rows or columns.

### Approach:

1. **Define Boundaries**:
    - Start with `top = 0`, `bottom = m - 1`, `left = 0`, `right = n - 1`, where `m` and `n` are the number of rows and columns, respectively.

2. **Traverse in Spiral Order**:
    - While the boundaries are valid (`top <= bottom` and `left <= right`):
        - Traverse from **left to right** along the top boundary. Then move the `top` boundary down.
        - Traverse from **top to bottom** along the right boundary. Then move the `right` boundary left.
        - Traverse from **right to left** along the bottom boundary (if still valid). Then move the `bottom` boundary up.
        - Traverse from **bottom to top** along the left boundary (if still valid). Then move the `left` boundary right.

3. **Collect Results**:
    - Add each visited element to a `List<Integer>` in the order of traversal.

4. **Stop Condition**:
    - Stop when all elements have been processed, i.e., when the boundaries overlap.

### Complexity:

- **Time Complexity**: \(O(m \times n)\)
    - Each element of the matrix is visited exactly once.
- **Space Complexity**: \(O(1)\)
    - No extra space is used except for the result list.

[Solution Code](jav54SpiralMatrix/Solution.java)

## Problem #73: Set Matrix Zeroes

### Intuition:

The goal of this problem is to update a given matrix such that if an element is `0`, its entire row and column are set to `0`. The challenge is to accomplish this **in place**, without using additional space proportional to the matrix size.

We can achieve this by identifying the rows and columns that need to be zeroed, either by:
1. Using external space like `TreeSet` to track zero rows and columns, or
2. Optimizing further by using the matrix itself to store this information.

### Approach:

#### Basic Approach:
1. Use two sets (`rows` and `cols`) to keep track of the indices of rows and columns that contain at least one zero.
2. Traverse the matrix to find all `0` elements:
    - Add their row index to the `rows` set.
    - Add their column index to the `cols` set.
3. Perform a second traversal of the matrix:
    - If the current cell’s row or column index is in the `rows` or `cols` set, set the cell to `0`.

#### Optimized Approach (In-place):
1. Use the first row and first column of the matrix itself to mark which rows and columns need to be zeroed.
2. Use a separate variable to track if the first row and first column themselves need to be zeroed.
3. Perform the following steps:
    - Traverse the matrix to mark rows and columns in the first row/column.
    - Traverse the matrix again, using the markers to set cells to `0`.
    - Finally, handle the first row and column separately, based on the stored variable.

### Complexity:

- **Time Complexity**: \( O(m \times n) \), where \( m \) is the number of rows and \( n \) is the number of columns.
    - The matrix is traversed twice: once to identify rows/columns and once to set zeros.
- **Space Complexity**:
    - **Using `TreeSet`**: \( O(m + n) \), where additional space is used for storing row and column indices.
    - **Optimized in-place approach**: \( O(1) \), as no additional space is used apart from variables.

[Solution Code](jav73SetMatrixZeroes/Solution.java)

## Problem #76: Minimum Window Substring

### Intuition:
The task is to find the smallest substring in `s` that contains all the characters of string `t` (including duplicates). This is a classic **sliding window** problem where we dynamically adjust the window size to meet the requirements of the problem.

1. **Character Frequency Map**:
    - First, build a frequency map (`t_map`) of all characters in `t` to know how many of each character is required.

2. **Sliding Window**:
    - Use two pointers (`left` and `right`) to define a window in `s` that can dynamically expand and shrink.
    - Track the counts of characters in the current window using a `window_map`.
    - When the window contains all required characters in `t` (i.e., matches the counts in `t_map`), shrink the window from the left to find the smallest valid substring.

3. **Result Tracking**:
    - Keep track of the minimum-length window and its start position whenever the window meets the conditions.

---

### Approach:
1. **Initialize Maps**:
    - Create a `t_map` for character frequencies in `t`.
    - Use `window_map` to track the character counts in the current sliding window.

2. **Expand the Window**:
    - Iterate through `s` with the `right` pointer, adding characters to `window_map`.

3. **Check Validity**:
    - When the current window satisfies all character requirements (tracked using a `formed` counter), attempt to shrink the window from the left.

4. **Shrink the Window**:
    - Move the `left` pointer to minimize the window size while ensuring all character requirements remain satisfied.

5. **Track the Result**:
    - Update the minimum-length substring and its start index whenever a valid window is found.

6. **Return Result**:
    - Return the smallest valid substring or an empty string if no valid substring exists.
   
### Complexity:
- **Time Complexity**: \( O(m + n) \), where \( m \) is the length of `s` and \( n \) is the length of `t`.
- **Space Complexity**: \( O(k) \), where \( k \) is the number of unique characters in `t`.


[Solution Code](jav76MinimumWindowSubstring/Solution.java)

## Problem #121: Best Time to Buy and Sell Stock

### Intuition:

The goal is to maximize profit by identifying the best day to buy and the best day to sell the stock within the given
list of prices. The challenge lies in ensuring the buying day occurs before the selling day, so we’re essentially
looking for the smallest price up to any point in the array and the maximum difference between any later price and this
minimum.

### Approach:

Approach:

1. Initialize the Minimum Price: Start with the first price as the initial smallest value. Track this as you iterate
   through the prices to determine the best potential buy price up to any given day.
2. Iterate Through Prices:

- For each price, if it’s less than the smallest price so far, update smallest and mark the day as the buying day.
- If it’s greater than the smallest price but before the current selling day, calculate the difference (potential
  profit) between this price and the smallest price.
- Track the largest difference found as maxProfit.

3. Return Result: After finishing the iteration, maxProfit contains the highest possible profit, or 0 if no transaction
   is beneficial.

### Complexity:

- **Time complexity**: O(n) where n is the number of prices. We traverse the list once.
- **Space complexity**: O(1), as we only use a few variables to track the smallest price, the maximum profit, and
  current indices for buy/sell days.
  [Solution Code](217_ContainsDuplicate/Solution.cpp)

## Problem #141: Linked List Cycle

### Intuition:

The goal of this problem is to determine whether a given singly linked list contains a cycle. A cycle occurs when a node’s `next` pointer points to a previously visited node. Instead of tracking visited nodes explicitly, we can use **Floyd’s Cycle Detection Algorithm** (also known as the Tortoise and Hare algorithm).

This algorithm uses two pointers moving at different speeds (slow and fast). If there is a cycle, the two pointers will eventually meet inside the cycle. If there is no cycle, the fast pointer will reach the end of the list (`null`).


### Approach:

1. **Initialize Two Pointers**:
    - Start both `slow` and `fast` pointers at the head of the linked list.

2. **Traverse the List**:
    - Move the `slow` pointer one step at a time.
    - Move the `fast` pointer two steps at a time.

3. **Check for a Cycle**:
    - If the `fast` pointer reaches `null` (or `fast.next` is `null`), the list has no cycle.
    - If the `slow` pointer and the `fast` pointer meet at some point, there is a cycle.

4. **Return the Result**:
    - Return `true` if a cycle is detected (pointers meet).
    - Return `false` if the traversal ends (`fast` reaches `null`).


### Complexity:

- **Time Complexity**: \( O(n) \)
    - The `slow` and `fast` pointers traverse the list at most once. In a cycle, the pointers may loop a few times before meeting, but this still results in a linear runtime.

- **Space Complexity**: \( O(1) \)
    - The algorithm uses only two pointers (`slow` and `fast`), making it space-efficient.

[Solution Code](jav141LinkedListCycle/Solution.java)


## Problem #143: Reorder List

### Intuition:

The goal of this problem is to reorder a singly linked list in a specific interleaving pattern:  
Given a list:
L0 → L1 → L2 → ... → Ln-1 → Ln
Reorder it as:
L0 → Ln → L1 → Ln-1 → L2 → Ln-2 → ...
The key is to split the list into two halves, reverse the second half, and then merge the two halves in the desired order. This ensures that the reordering is performed efficiently without modifying the values in the nodes.

### Approach:

1. **Store Nodes in a List**:
    - Traverse the linked list and store all the nodes in an `ArrayList`.
    - This makes it easier to access nodes by their positions.

2. **Reorder Using Two Pointers**:
    - Use two pointers:
        - `left` starts at the beginning of the list (`L0`).
        - `right` starts at the end of the list (`Ln`).
    - Alternate between nodes from the start and end, connecting them to create the reordered list.
    - Stop when the two pointers meet in the middle.

3. **Ensure Termination**:
    - After reordering, make sure the last node points to `null` to avoid creating a cycle.

4. **Edge Cases**:
    - If the list has fewer than two nodes, no reordering is necessary.

### Complexity:

- **Time Complexity**: \( O(n) \)
    - Traversing the list to store nodes: \( O(n) \).
    - Reordering the list using two pointers: \( O(n) \).

- **Space Complexity**: \( O(n) \)
    - An `ArrayList` is used to store the nodes, requiring extra space proportional to the number of nodes in the list.

### Key Notes:
- The `ArrayList` allows efficient access to nodes during the reordering process.
- The algorithm ensures that the linked list structure is modified without altering the values stored in the nodes.
- Edge cases, such as empty lists or single-node lists, are handled gracefully.

[Solution Code](jav143ReorderList/Solution.java)

## Problem #150: Evaluate Reverse Polish Notation

### Intuition:

Reverse Polish Notation (RPN) is a mathematical notation in which operators follow their operands. This notation allows
expressions to be evaluated from left to right using a stack, as operators can be applied as soon as they appear. By
using a stack, we can efficiently manage the operands and apply operations in the correct order without parentheses.

### Approach:

1. Use a Stack for Operands: As we process each token in the expression:

- If it’s an operand (a number), push it onto the stack.
- If it’s an operator (+, -, *, /), pop the top two elements from the stack (the two most recent operands), apply the
  operator, and push the result back onto the stack.

2. Operator Handling:

- Use a helper function to identify if a token is an operator.
- For each operator, pop two values, perform the calculation, and handle integer division by truncating towards zero.

3. Final Result:

- Once all tokens are processed, the final result will be the only element left on the stack.

4. Edge Cases:

- Single operand (e.g., ["3"]).
- Division by zero is not allowed by the problem constraints, so we don’t handle it explicitly.
- Negative results and truncation towards zero for division.

### Complexity:

- **Time complexity**: O(n) where n is the number of tokens. Each token is processed once, and stack operations (push,
  pop) are O(1).
- **Space complexity**: O(1), due to the storage of operands on the stack.
[Solution Code](150_EvaluateReversePolishNotation/Solution.cpp)

## Problem #152: Maximum Product Subarray

### Intuition:

The idea is to find the longest(element-wise) contiguous subarray the yields the cumulative largest product

### Approach:

1. We can first declare 3 variables as the first element in the passed in array

- result for the storing the product if we add the next element
- maxProd for storing the cumulative sum of the sub array
- minProd for storing the smallest product

2. maxProd calls Math.max() to compare if adding next element results in a higher product subarray
3. minProd calls Math.max() again to compare a temporary maxProd and actual maxPod to see which product is higher
4. result calls Math.max() to see if maxProd or previous result is a higher product

### Complexity:

- **Time complexity**: O(n) where n is the number of elements traversed once
- **Space complexity**: O(1), as there is only 2 variables getting reassigned
  [Solution Code](jav152MaximumProductSubarray/Solution.java)

## Problem #153: Find Minimum in Rotated Sorted Array

### Intuition:

The problem requires finding the minimum element in a sorted array that has been rotated at an unknown pivot. Since the
array is sorted but rotated, the smallest element can be found inO(logn) time complexity by applying binary search
principles.

### Approach:

Binary Search:

1. We use a binary search approach to achieve O(logn) time complexity.
2. Initialize Pointers:

- left is set to the first element (start of the array).
- right is set to the last element (end of the array).

3. Base Case:

- If the array is already sorted (nums[left] < nums[right]), then nums[left] is the minimum.
- If left is equal to right, then we have narrowed down to the minimum element.

4. Binary Search Process:

- Calculate mid as the midpoint between left and right.
- Comparisons:
-
    - If nums[mid] > nums[right], this means the smallest element must be in the right half (because rotation implies
      the smallest element is beyond mid). Set left to mid + 1.
-
    - Otherwise, if nums[mid] <= nums[right], the minimum is in the left half, so set right to mid.
- Repeat the process recursively (or iteratively) until the base case is met.

5. Result:

- When left meets right, nums[left] (or nums[right]) will be the minimum element.

### Complexity:

- **Time complexity**: O(n)
- **Space complexity**: O(1),
  [Solution Code](jav153FindMinimumInRotatedSortedArray/Solution.java)

## Problem #190: Reverse Bits

### Intuition:
The task is to reverse the bits of a 32-bit unsigned integer. The least significant bit (LSB) of the input becomes the most significant bit (MSB) of the output, and vice versa. To achieve this, we iteratively extract bits from the input number and insert them into the correct positions in the reversed number using bitwise operations.

### Approach:
1. **Process Each Bit**:
    - Use bitwise AND (`&`) to extract the least significant bit (LSB) of the number.
    - Shift the reversed number to the left to make space for the new bit.
    - Append the extracted bit to the reversed number using bitwise OR (`|`).

2. **Shift the Input Number**:
    - Use bitwise right shift (`>>`) to discard the LSB of the input number, preparing for the next iteration.

3. **Repeat**:
    - Perform these operations for all 32 bits to ensure the entire binary representation of the number is reversed.

---

### Complexity:
- **Time Complexity**: \( O(1) \)
    - The number of bits is fixed at 32, so the operations take constant time.
- **Space Complexity**: \( O(1) \)
    - No additional data structures are used.
      [Solution Code](jav190ReverseBits/Solution.java)

##  Problem #191: Number of 1 Bits

### Intuition:

The problem requires that we find the number of 1 Bits in a given integer

### Approach:

1. We take integer n and initialize a count to 0
2. Then iterate over a max of 32 Bits

- First we shift the bits right by i to check in each place value
- We then use & to extract the value of the LSB
-
    - This means if we & 2 bits it will yield 1 if both are a 1 Bit

3. We increment count by 1 if the LSB is 1

### Complexity:

- **Time complexity**: O(1) since it's only going up to 32 digits/bits
- **Space complexity**: O(1) since it only uses a max of 32 digits/bits
  [Solution Code](jav191NumberOf1Bits/Solution.java)

## Problem #206: Reverse Linked List

### Intuition:

The goal of this problem is to reverse a singly linked list. Instead of creating a new list or using extra memory for storing nodes, we aim to reverse the list **in place** by modifying the `next` pointers of the nodes. The process involves iterating through the list while keeping track of the previous and current nodes.

This approach ensures that the linked list is reversed with minimal memory overhead and linear time complexity.


### Approach:

1. **Initialize Pointers**:
    - Start with two pointers:
        - `prev` initialized to `nullptr` to represent the end of the reversed list.
        - `current` initialized to the head of the original list.

2. **Iterate Through the List**:
    - While the `current` pointer is not `nullptr`:
        - Store the next node of the current node in a temporary pointer (`nextNode`).
        - Reverse the link by pointing `current->next` to `prev`.
        - Move `prev` to the `current` node (i.e., advance the reversed list).
        - Move `current` to `nextNode` (i.e., advance the original list).

3. **Return the New Head**:
    - At the end of the loop, `prev` will point to the new head of the reversed linked list.

### Complexity:

- **Time complexity**: \( O(n) \)
    - The list is traversed once, processing each node in linear time.
- **Space complexity**: \( O(1) \)
    - The reversal is done in place, using only a few additional pointers.

  [Solution Code](206_ReverseLinkedList/Solution.cpp)

## Problem #217: Contains Duplicate

### Intuition:

The problem is to determine if a given integer array contains any duplicates. This means we need to check if any integer
appears more than once in the array. A simple way to think about this is to keep track of the integers we encounter as
we iterate through the array and see if we've seen any of them before.

### Approach:

1. Utilize an Unordered Set: We can use an unordered set to track elements as we iterate through the vector.
2. Iterate Through the Vector: For each element in the vector:

- Check if it already exists in the set.
- If it does, return true indicating a duplicate has been found.
- If it doesn't, insert it into the set.

3. Return False: If the iteration completes without finding duplicates, return false

### Complexity:

- **Time complexity**: O(n) This approach runs in O(n) time complexity, where n is the number of elements in the vector,
  as it requires a single pass through the vector and utilizes O(n) space for the set.
- **Space complexity**: O(1) as it exits out right after first detection
  [Solution Code](217_ContainsDuplicate/Solution.cpp)

## Problem #238: Product of Array Except Self

### Intuition:

The problem requires calculating the product of all elements in the array except the current element, without using
division in most cases. A simple approach would be to compute the total product and divide by each element, but this
fails when there are zeros in the array. To handle zeros, we need a conditional approach:

- If there’s one zero, only the index with zero should contain the product of non-zero elements.
- If there are more than one zero, all products will be zero.

### Approach:

Initialize Variables:

1. totalProduct to store the product of all non-zero elements.

- hasZeroCount to track the number of zeros in the array.
- Calculate Total Product (Ignoring Zeros):

2. Iterate through nums and compute the product of all non-zero elements.

- Track the count of zeros in hasZeroCount.
- Check Zero Count Cases:

3. If hasZeroCount > 1: Return an array filled with zeroes, as any product involving two or more zeros is zero.

- If hasZeroCount == 1: Only the position of the zero in nums should contain totalProduct; other positions remain zero.
- If hasZeroCount == 0: Populate answer[i] with totalProduct / nums[i] for each element, calculating the product except
  itself.

4. Fill the Result Array:

- Use another loop to populate answer based on the above conditions.

### Complexity:

- **Time complexity**: O(n), where n is the number of elements in nums, as we perform two single-pass iterations over
  the array.
- **Space complexity**: O(1) (excluding output array), as we use a few extra variables (totalProduct, hasZeroCount) and
  the result array answer is returned.
  [Solution Code](238_ProductOfArrayExceptSelf/Solution.cpp)

## Problem #242: Valid Anagram - VALID UNICODE EDGE CASE 

### Intuition:
The task is to determine if two strings `s` and `t` are anagrams of each other. Two strings are anagrams if they contain the same characters with the same frequencies. Unlike traditional approaches that handle only ASCII lowercase letters, this solution is robust and works for **Unicode characters** as well, making it suitable for a wide range of inputs, including multilingual text.

### Approach:
1. **Check String Lengths**:
    - If the lengths of `s` and `t` differ, they cannot be anagrams.

2. **Character Frequency Map**:
    - Use a `HashMap` to count the frequencies of characters in `s` using their Unicode values as keys.
    - Increment the count for each character in `s`.

3. **Validate Against `t`**:
    - For each character in `t`, check if it exists in the frequency map:
        - If it does, decrement its count.
        - If the count becomes `0`, remove the character from the map.
        - If the character is not found, return `false`.

4. **Final Check**:
    - After processing both strings, the `HashMap` should be empty if `s` and `t` are valid anagrams.

### Complexity:
- **Time Complexity**: \( O(n) \), where \( n \) is the length of the strings. Each character in `s` and `t` is processed once.
- **Space Complexity**: \( O(k) \), where \( k \) is the number of unique characters in the input strings. This depends on the diversity of characters (e.g., ASCII vs Unicode).

  [Solution Code](jav242ValidAnagram/Solution.java)

## Problem #268: Missing Number

### Intuition:
You are given an array nums containing n distinct numbers in the range [0,n]. The array is missing one number from this range. Your task is to return the missing number.
The problem can be solved efficiently using the XOR operation because of its unique properties:
- x ⊕ x =0: Any number XORed with itself cancels out.
- x ⊕ 0 = x: XORing with zero leaves the number unchanged.
- XOR is commutative and associative, allowing us to rearrange operations.
By XORing all numbers in the range [0,n] and all elements in nums, the numbers that appear in both sets will cancel out, leaving only the missing number.

### Approach:
1. Initialize `xorRange` to 0.
2. Compute the XOR of all numbers in the range \([0, n]\) and store the result in `xorRange`.
3. Compute the XOR of all elements in the array `nums` and store the result in `xorNums`.
4. The missing number is computed as:
   \[
   \text{missingNumber} = \text{xorRange} \oplus \text{xorNums}
   \]
5. Return the result.
### Complexity:
- **Time complexity**: \( O(n) \), where \( n \) is the number of elements in the array, since each element is checked once.
- **Space complexity**: \( O(1) \), since the solution uses constant additional space.

  [Solution Code](jav268MissingNumber/Solution.java)

## Problem #338: Counting Bits

### Intuition:

The problem requires calculating the number of 1 Bits up to the value of n.(include 0 as the start as result[0])

### Approach:

1. Initialize Variables:

- int result array with 0's as the elements

2. Begin iterating where we start at result[1] because if we count to n at result[0] is always zero 1 bits.
3. Now we begin reassignment in each step for result[i] where i starts at 1;

- the equation is result[i>>1] + (i&1);
-
    - broken down result[i>>1] essentially checks the previous result number of ones. kind of like recursive but
      iterative
-
    - add (i & 1) - where this checks if the LSB is a 1 or 0;
- Now with both above steps adding reassigns the new result[i]

4. This uses previous result instead of creating ever expanding subsets of counting ones for each count digit up.

### Complexity:

- **Time complexity**: O(n), where n is the number of elements since we need to chack each element once.
- **Space complexity**: O(n) we only need to use the size of the n array + 1
  [Solution Code](jav338CountingBits/Solution.java)

## Problem #371: Sum Of Two Integers

### Intuition:

The task requires summing two binary strings and returning the result as a binary string. Binary addition rules mirror
decimal addition but use only two digits (0 and 1). The primary challenge lies in handling carry propagation
effectively.
Instead of directly using the + operator, bitwise operations can emulate addition by:

- Using XOR for adding bits without carry.
- Using AND to calculate the carry.
- Shifting the carry left to add it to the next higher bit position.

### Approach:

1. Convert Binary Strings to Integers:

- Parse the binary strings into integers using Integer.parseInt with a base of 2.

2. Add Integers Without + Using getSum:

- XOR (^): Adds bits without handling carry.
- AND (&) and <<: Identifies and shifts the carry.
- Repeat until the carry is zero.

3. Convert Result Back to Binary:

- Use Integer.toBinaryString to convert the result from integer to binary string.

4. Edge Cases:

- Empty strings or null inputs.
- Unequal string lengths (implicitly handled by conversion to integers).

### Complexity:

- **Time complexity**: O(n), where n is the number of bits in the larger number.
- **Space complexity**: O(1), as no additional data structures are used.
  [Solution Code](jav371SumOfTwoIntegers/Solution.java)

## Problem #424: Longest Repeating Character Replacement

### Intuition:

The problem is to find the longest substring of the same contiguous repeating character. You are given "k" repetitions
if there is any character to help lengthen the substring if the element is not the same character

- We will use a modified sliding window to achieve this solution
- We will also use a form of dynamic programming in the form of a count array for the alphabet letters.

### Approach:

1. Initialize variables:

- freq[] array to store the number of repetitions of the character
- maxFreq to hold the highest frequency of the highest repeating character
- left to get the left most index as we grow the window
- maxLength to hold the longest valid repeating character

2. Begin to loop over the input string character array

- where "right" is the beginning index

3. Increment frequency for the current character

- where we get the current value of the character in the string array by s.charAt(right)-'A'
-
    - We subtract - 'A' by using an ASCII subtraction to get a value of 1-26
- once we get the index of the letter (where A = 1, B = 2, C = 3) we increment the index by one in the
  freq[current letter]++

4. Update the maximum frequency of any single character in the window

- where max frequency of the current character is compared with current longest same character

5. We do and invalidity check to see if the curr char is beyond the k replacement threshold

- so where we do this by calculating length of widow = longest repetition of char + k replacement threshold
- If the longest repetition of char or maxFreq is not long enough to cover then its invalid
- We now shrink the window size by incrementing "left"
- and decrement the char from the count from the alphabet array

6. Return result of the higher value between the longest window or the current window.

- this checks for longer windows closer to the start or end of the string s array

### Complexity:

- **Time complexity**: O(n), where n number of elements
- **Space complexity**: O(n), where we use the space of the input string array
  [Solution Code](jav424LongestRepeatingCharacterReplacement/Solution.java)