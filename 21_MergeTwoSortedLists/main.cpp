#include <iostream>
#include "Solution.hpp"

int main() {
    ListNode* A_node2 = new ListNode(4);
    ListNode* A_node1 = new ListNode(3, A_node2);
    ListNode* A_head = new ListNode(1, A_node1);

    ListNode* B_node2 = new ListNode(3);
    ListNode* B_node1 = new ListNode(2, B_node2);
    ListNode*  B_head = new ListNode(1, B_node1);
    ListNode* merge = Solution::MergeTwoLists(A_head, B_head);

    while (merge != nullptr) {
        std::cout << merge->val << " ";
        merge = merge->next;
    }
    return 0;
}
