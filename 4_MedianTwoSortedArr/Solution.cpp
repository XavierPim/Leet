#include "Solution.hpp"

double Solution::findMedianSortedArray(vector<int> &nums1, vector<int> nums2) {
    vector<int> combinedArr;
    vector<int>* biggerArr= nums1.size()>nums2.size()?&nums1:&nums2;
    vector<int>* smallerArr = nums1.size() > nums2.size() ? &nums2 : &nums1;
    int i = 0, j = 0;
    int totalSize = nums1.size() + nums2.size();
    for( int count = 0; count < totalSize; ++count) {
    int current;
    if(i<biggerArr->size() &&
        (j > smallerArr->size() || biggerArr[i] < smallerArr[j])) {
        current = (*biggerArr)[i++];
    } else {
        current = ()
    }
    }
}
double Solution::medianCal(vector<int> sortedArr) {
}
