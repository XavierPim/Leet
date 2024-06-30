#include <iostream>
#include "Solution.hpp"

int main () {
    ListNode* l2;

    int number = 321;
    ListNode* l1 = Solution::createListFromDigits(number);
    ListNode* current = l1;
    while (current != nullptr) {
        std::cout << current->val;
        if(current->next != nullptr) {
            std::cout<< " -> ";
        }
        std:: cout  <<std::endl;
    }

    current = l1;
    while(current != nullptr) {
        ListNode* temp = current;
        current = current->next;
        delete temp;
    }
    // ListNode* result = Solution().addTwoNumbers(l1,l2);
    return 0;
}