#ifndef SOLUTION_H
#define SOLUTION_H
#include <vector>
#include <iostream>
struct ListNode {
    int val;
    ListNode* next;
    ListNode() : val(0), next(nullptr) {}
  explicit ListNode(int x) : val(x) {}
    ListNode(int x, ListNode* list): val(x), next(list){}
};

class Solution {
public:
   ListNode* mergeKLists(std::vector<ListNode *> &lists);
   ListNode* mergeTwoSortedLists(ListNode* list1, ListNode* list2);
   void printList(ListNode *head);
};
#endif
