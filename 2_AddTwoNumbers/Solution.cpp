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
ListNode* head = nullptr;
ListNode* current = nullptr;
int carry = 0;
while(l1 != nullptr || l2 != nullptr || carry != 0) {
int sum = carry;
    if(l1 != nullptr) {
        sum += l1->val;
        l1= l1->next;
    }
    if(l2 != nullptr) {
        sum += l2->val;
        l2 = l2->next;
    }

    carry = sum / 10;
    ListNode* newNode = new ListNode(sum % 10);
    if(head== nullptr) {
        head = newNode;
        current = head;
    } else {
        current->next =  newNode;
        current = current->next;
    }
}
    return  head;
}
