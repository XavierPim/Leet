#ifndef SOLUTION_HPP
#define SOLUTION_HPP
// Definition for singly-linked list.
  struct ListNode {
      int val;
      ListNode *next;
ListNode() : val(0), next(nullptr) {}
ListNode(int x) : val(x), next(nullptr) {}
ListNode(int x, ListNode *next) : val(x), next(next) {}
  };


class Solution {
public:
    static ListNode* createListFromDigits(int digits);
    static ListNode* addTwoNumbers(ListNode* l1, ListNode* l2);
};

#endif //SOLUTION_HPP
