#ifndef SOLUTION_HPP
#define SOLUTION_HPP

#include <iostream>

// ListNode definition
struct ListNode {
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    explicit ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

// Solution class declaration
class Solution {
public:
    static ListNode* reverseList(ListNode* head);
    static void printList(ListNode* head);
};

#endif // SOLUTION_HPP
