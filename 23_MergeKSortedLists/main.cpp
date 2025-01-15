#include <iostream>
#include "Solution.hpp"

int main() {
    ListNode *Node2_A = new ListNode(5, nullptr);
    ListNode *Node1_A = new ListNode(4, Node2_A);
    ListNode *Node0_A = new ListNode(1, Node1_A);

    ListNode *Node2_B = new ListNode(4, nullptr);
    ListNode *Node1_B = new ListNode(3, Node2_B);
    ListNode *Node0_B = new ListNode(1, Node1_B);

    ListNode *Node1_C = new ListNode(6, nullptr);
    ListNode *Node0_C = new ListNode(2, Node1_C);

    std::vector<ListNode*> lists;
    lists.push_back(Node0_A);
    lists.push_back(Node0_B);
    lists.push_back(Node0_C);
    Solution* solution = new Solution();
    ListNode* result = solution->mergeKLists(lists);
    solution->printList(result);
}
