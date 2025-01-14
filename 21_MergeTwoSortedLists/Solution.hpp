#ifndef SOLUTION_H
#define SOLUTION_H

 struct ListNode {
    int val;
    ListNode* next;
    ListNode(): val(0), next(nullptr){}
    explicit ListNode(int x): val(x), next(nullptr){}
    ListNode(int x, ListNode* ptr): val(x), next(ptr){}
};

class Solution {
public:
    static ListNode* MergeTwoLists(ListNode* list1, ListNode* list2);
};


#endif

