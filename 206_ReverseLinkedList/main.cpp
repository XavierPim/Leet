#include "Solution.hpp"

int main() {
    // Initialize linked list: 1 -> 2 -> 3 -> 4
    ListNode* node4 = new ListNode(4);
    ListNode* node3 = new ListNode(3, node4);
    ListNode* node2 = new ListNode(2, node3);
    ListNode* head = new ListNode(1, node2);

    // Reverse the linked list
    head = Solution::reverseList(head);

    // Print the reversed linked list
    std::cout << "[";
    Solution::printList(head);
    std::cout << "]";

    // Free allocated memory
    while (head != nullptr) {
        ListNode* temp = head;
        head = head->next;
        delete temp;
    }

    return 0;
}
