    #include <iostream>
#include "Solution.hpp"

int main () {
    int number1 = 321;
    int number2 = 111;
    ListNode* l1 = Solution::createListFromDigits(number1);
    ListNode* l2 = Solution::createListFromDigits(number2);


    ListNode* result = Solution::addTwoNumbers(l1,l2);

    while (result != nullptr) {
        std::cout << result->val;
        if(result->next != nullptr) {
            std::cout<< " -> ";
        }
        result = result->next;
    }
        std:: cout  <<std::endl;
    result = l1;
    while(result != nullptr) {
        ListNode* temp = result;
        result = result->next;
        delete temp;
    }

    result = l2;
    while(result != nullptr) {
        ListNode* temp = result;
        result = result->next;
        delete temp;
    }
    return 0;
}