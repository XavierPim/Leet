#include <iostream>

#include "../4_MedianTwoSortedArr/Solution.hpp"
using namespace std;
int main() {
   vector nums1 = {1,3};
   vector nums2 = {2};
   Solution solution;
cout<< "result median:" << solution.findMedianSortedArray(nums1,nums2);
}