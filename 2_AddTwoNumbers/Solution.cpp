#include "Solution.hpp"
ListNode* Solution::createListFromDigits(int digits) {
    ListNode* head = nullptr;
    ListNode* current = nullptr;

    if (digits == 0) {
        return new ListNode(0);
    }

    while (digits > 0)  {
        int digit = digits % 10;
        if(head == nullptr){
            head = new ListNode(digit);
            current = head;
        }else {
            digit = digits % 10;
            current->next = new ListNode(digit);
            current = current->next;
        }
            digits = digits /10;
    }
        return  head;
};

ListNode * Solution::addTwoNumbers(ListNode *l1, ListNode *l2) {
    return nullptr;
}
