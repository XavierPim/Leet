#include "Solution.hpp"

ListNode* Solution::mergeKLists(std::vector<ListNode*>& lists) {
    if (lists.empty()) {
        return nullptr; // Return if the list is empty
    }

    // Initialize result as nullptr
    ListNode* result = nullptr;

    // Merge each list into the result
    for (int i = 0; i < lists.size(); ++i) {
        result = mergeTwoSortedLists(result, lists[i]);
    }

    return result; // Return the merged list
}

ListNode* Solution::mergeTwoSortedLists(ListNode* head_A, ListNode* head_B) {
    // Create a dummy node to serve as the starting point
    auto* dummy = new ListNode();
    ListNode* current = dummy;

    // Traverse both lists until one becomes null
    while (head_A != nullptr && head_B != nullptr) {
        if (head_A->val <= head_B->val) {
            current->next = head_A;  // Attach head_A to the result
            head_A = head_A->next;  // Move head_A forward
        } else {
            current->next = head_B;  // Attach head_B to the result
            head_B = head_B->next;  // Move head_B forward
        }
        current = current->next;  // Move the current pointer forward
    }

    // Attach the remaining nodes of the non-empty list (if any)
    if (head_A != nullptr) {
        current->next = head_A;
    } else {
        current->next = head_B;
    }

    // The actual merged list starts at dummy->next
    ListNode* mergedHead = dummy->next;
    delete dummy; // Free the dummy node
    return mergedHead;
}

void Solution::printList(ListNode* head) {
    while (head != nullptr) {
        std::cout << head->val;
        if (head->next != nullptr) {
            std::cout << " -> ";
        }
        head = head->next;
    }
}
