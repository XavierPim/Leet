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
| 15        | 3Sum                                           | [Link](#problem-15-3Sum)                                          | Java     |
| 33        | Search in Rotated Sorted Array                 | [Link](#problem-33-search-in-rotated-sorted-array)                | Java     |
| 53        | Maximum Subarray                               | [Link](#problem-53-maximum-subarray)                              | Java     |
| 121       | Best Time to Buy and Sell                      | [Link](#problem-121-best-time-to-buy-and-sell-stock)              | C++      |
| 150       | Evaluate Reverse Polish Notation               | [Link](#problem-150-evaluate-reverse-polish-notation)             | C++      |
| 152       | Maximum Product Subarray                       | [Link](#problem-152-maximum-product-subarray)                     | Java     |
| 153       | Find Minimum in Rotated Sorted Array           | [Link](#problem-153-find-minimum-in-rotated-sorted-array)         | Java     |
| 217       | Contains Duplicate                             | [Link](#problem-217-contains-duplicate)                           | C++      |
| 238       | Product of Array Except Self                   | [Link](#problem-238-product-of-array-except-self)                 | C++      |
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
 
[Solution Code](5_LongestPalindromeSubstring/Solution.cpp)

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

[Solution Code](9_PalindromeNumber/Solution.cpp)

## Problem #10: Regular Expression Matching

### Intuition:
The problem is to determine if a given string matches a pattern that can include wildcards. The pattern can contain:

. which matches any single character.
* which matches zero or more occurrences of the preceding element.
### Approach:
1. Dynamic Programming (DP) Table Setup: Create a 2D DP table where dp[i][j] indicates whether the first i characters of the string match the first j characters of the pattern.
2. Initialization: Initialize dp[0][0] to true, as an empty pattern matches an empty string. Handle cases where the pattern starts with *.
3. Filling the DP Table:
- Iterate through each character in the string and the pattern.
- If the current character in the pattern is *, check:
- - If * represents zero occurrences of the preceding character (i.e., match dp[i][j-2]).
- - If it represents one or more occurrences (i.e., match dp[i-1][j] if the current character in the string matches the character before *).
- If the current character is a normal character or ., check if they match and propagate the match status from the previous characters.
4. Final Result: The value of dp[n][m] (where n is the length of the string and m is the length of the pattern) will indicate whether the entire string matches the entire pattern.
### Complexity:
- **Time complexity**: O(n * m), where n is the length of the string and m is the length of the pattern. Each cell in the DP table is computed based on previous cells, leading to a nested iteration.
- **Space complexity**: O(n * m) for the DP table. However, this can be optimized to O(m) by only keeping track of the current and previous rows.

[Solution Code](10_RegularExpressionMatching/Solution.cpp)

## Problem #15: 3Sum

### Intuition:
The 3Sum problem requires finding all unique triplets in an array that sum up to zero. Sorting the array simplifies this process, as it allows efficient traversal using a fixed pivot and the two-pointer technique. In this implementation, we used QuickSort to sort the array in O(nlogn), which complements the subsequent two-pointer approach.

### Approach:
1. Sort the Array with QuickSort:
- Sorting the array using QuickSort ensures efficient traversal and helps in skipping duplicates.
2. Iterate with a Pivot:
- Fix one element (the pivot) in the triplet using a loop.
- Skip duplicate values for the pivot to avoid duplicate triplets.
3. Two-Pointer Search:
- Use two pointers (left and right) to find two additional elements that, when added to the pivot, sum to zero.
- Adjust the pointers based on the sum:
- - If the sum is zero, add the triplet to the result and move both pointers inward.
- - If the sum is less than zero, increment the left pointer to increase the sum.
- - If the sum is greater than zero, decrement the right pointer to decrease the sum.
- Skip duplicate values for both left and right to ensure unique triplets.
4. Handle Edge Cases:
- If the input array has fewer than three elements, return an empty list.
- Ensure proper handling of duplicate triplets by skipping repeated values.
5. Return the Result:
- After processing all potential pivots, return the list of triplets.
### Complexity:
- **Time complexity**: 
- - Sorting the array using QuickSort takes
- - The two-pointer search is O(n^2) in total, as it runs once for each element.
- - Overall complexity:O(n^2).
- **Space complexity**:O(k) Sorting with QuickSort is in-place, so no additional memory is required for the array.

[Solution Code](jav15ThreeSum/Solution.java)

## Problem #33: Search In Rotated Sorted Array

### Intuition:
In a rotated sorted array, the array is initially sorted in ascending order but then "rotated" at some unknown pivot. This means one half of the array remains sorted, while the other half is rotated. By leveraging this property, we can use a modified binary search to find the target in O(logn) time.

### Approach:
1. Binary Search with Adjustments:
- Initialize pointers left and right to represent the search range.
- Calculate the midpoint mid at each step and check if it matches the target.
2. Determine Which Half is Sorted:
- If nums[left] <= nums[mid], the left side is sorted.
- Check if the target lies within nums[left] and nums[mid].
- - If it does, continue searching in the left half.
- - Otherwise, search the right half.
- If nums[mid] <= nums[right], the right side is sorted.
- - Check if the target lies within nums[mid] and nums[right].
- - - If it does, continue searching in the right half.
- - - Otherwise, search the left half.
3. Recursive Search:
- Continue the search by narrowing down the range until the base case is met.
- Base cases:
- - If left > right, the target is not present, so return -1.
- - If nums[mid] == target, return mid.

### Complexity:
- **Time complexity**: O(logn), as the array is halved in each recursive call.
- **Space complexity**: O(logn) due to the recursive stack, but can be reduced to O(1) if implemented iteratively.

[Solution Code](jav33SearchInRotatedSortedArray/Solution.java)

## Problem #53: Maximum Subarray

### Intuition:
The goal is to find a contiguous subarray within a given array of integers that has the largest possible sum. A brute-force approach might involve calculating all possible subarray sums, but this would be inefficient for large arrays. Instead, we can use Kadane's Algorithm, which allows us to find the maximum sum in a single pass through the array.

### Approach:
1. Initialize two variables: compareSum to track the maximum sum of the subarray ending at each index, and maxSum to store the overall maximum sum found.
2. Iterate through the array:
- For each element, decide if it's better to start a new subarray with this element alone or to continue adding it to the existing subarray (compareSum).
- Update compareSum as the maximum of the current element itself or the current element plus compareSum.
- Update maxSum if compareSum is greater than the previous maxSum.
3. Return maxSum after the loop finishes. This holds the largest sum of any contiguous subarray in the array.

### Complexity:
- **Time complexity**: O(n), where n is the length of the array, because we make only one pass through the array.
- **Space complexity**: O(1), as we only use a few extra variables (compareSum and maxSum) and don’t require any additional data structures.

[Solution Code](jav53MaximumSubarray/Solution.java)

## Problem #121: Best Time to Buy and Sell Stock

### Intuition:
The goal is to maximize profit by identifying the best day to buy and the best day to sell the stock within the given list of prices. The challenge lies in ensuring the buying day occurs before the selling day, so we’re essentially looking for the smallest price up to any point in the array and the maximum difference between any later price and this minimum.
### Approach:
Approach:
1. Initialize the Minimum Price: Start with the first price as the initial smallest value. Track this as you iterate through the prices to determine the best potential buy price up to any given day.
2. Iterate Through Prices:
- For each price, if it’s less than the smallest price so far, update smallest and mark the day as the buying day.
- If it’s greater than the smallest price but before the current selling day, calculate the difference (potential profit) between this price and the smallest price.
- Track the largest difference found as maxProfit.
3. Return Result: After finishing the iteration, maxProfit contains the highest possible profit, or 0 if no transaction is beneficial.

### Complexity:
- **Time complexity**: O(n) where n is the number of prices. We traverse the list once.
- **Space complexity**: O(1), as we only use a few variables to track the smallest price, the maximum profit, and current indices for buy/sell days.
[Solution Code](217_ContainsDuplicate/Solution.cpp)

## Problem #150: Evaluate Reverse Polish Notation

### Intuition:
Reverse Polish Notation (RPN) is a mathematical notation in which operators follow their operands. This notation allows expressions to be evaluated from left to right using a stack, as operators can be applied as soon as they appear. By using a stack, we can efficiently manage the operands and apply operations in the correct order without parentheses.

### Approach:
1. Use a Stack for Operands: As we process each token in the expression:
- If it’s an operand (a number), push it onto the stack.
- If it’s an operator (+, -, *, /), pop the top two elements from the stack (the two most recent operands), apply the operator, and push the result back onto the stack.
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
- **Time complexity**: O(n) where n is the number of tokens. Each token is processed once, and stack operations (push, pop) are O(1).
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
The problem requires finding the minimum element in a sorted array that has been rotated at an unknown pivot. Since the array is sorted but rotated, the smallest element can be found inO(logn) time complexity by applying binary search principles.

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
- - If nums[mid] > nums[right], this means the smallest element must be in the right half (because rotation implies the smallest element is beyond mid). Set left to mid + 1.
- - Otherwise, if nums[mid] <= nums[right], the minimum is in the left half, so set right to mid.
- Repeat the process recursively (or iteratively) until the base case is met.
5. Result:
- When left meets right, nums[left] (or nums[right]) will be the minimum element.

### Complexity:
- **Time complexity**: O(n) 
- **Space complexity**: O(1), 
  [Solution Code](jav153FindMinimumInRotatedSortedArray/Solution.java)

## Problem #217: Contains Duplicate

### Intuition:
The problem is to determine if a given integer array contains any duplicates. This means we need to check if any integer appears more than once in the array. A simple way to think about this is to keep track of the integers we encounter as we iterate through the array and see if we've seen any of them before.

### Approach:

1. Utilize an Unordered Set: We can use an unordered set to track elements as we iterate through the vector.
2. Iterate Through the Vector: For each element in the vector:
- Check if it already exists in the set.
- If it does, return true indicating a duplicate has been found.
- If it doesn't, insert it into the set.
3. Return False: If the iteration completes without finding duplicates, return false

### Complexity:
- **Time complexity**: O(n) This approach runs in O(n) time complexity, where n is the number of elements in the vector, as it requires a single pass through the vector and utilizes O(n) space for the set.
- **Space complexity**: O(1) as it exits out right after first detection
  [Solution Code](217_ContainsDuplicate/Solution.cpp)

## Problem #238: Product of Array Except Self

### Intuition:
The problem requires calculating the product of all elements in the array except the current element, without using division in most cases. A simple approach would be to compute the total product and divide by each element, but this fails when there are zeros in the array. To handle zeros, we need a conditional approach:
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
- If hasZeroCount == 0: Populate answer[i] with totalProduct / nums[i] for each element, calculating the product except itself.
4. Fill the Result Array:
- Use another loop to populate answer based on the above conditions.

### Complexity:
- **Time complexity**: O(n), where n is the number of elements in nums, as we perform two single-pass iterations over the array.
- **Space complexity**: O(1) (excluding output array), as we use a few extra variables (totalProduct, hasZeroCount) and the result array answer is returned.
  [Solution Code](238_ProductOfArrayExceptSelf/Solution.cpp)

