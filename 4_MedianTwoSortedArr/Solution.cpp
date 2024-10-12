#include "Solution.hpp"

double Solution::findMedianSortedArray(vector<int> &nums1, vector<int> nums2) {
    vector<int> combinedArr;
    vector<int> *biggerArr = nums1.size() > nums2.size() ? &nums1 : &nums2;
    vector<int> *smallerArr = nums1.size() > nums2.size() ? &nums2 : &nums1;
    int i = 0, j = 0;
    int previous = 0, current = 0;
    int totalSize = nums1.size() + nums2.size();
    for (int count = 0; count < totalSize / 2; ++count) {
        if (i < biggerArr->size() &&
            (j > smallerArr->size() || biggerArr[i] < smallerArr[j])) {
            current = (*biggerArr)[i++];
        } else {
            current = (*smallerArr)[j++];
        }
        if (totalSize % 2 == 1 && count < totalSize / 2) {
            return current;
        }

        if (count == (totalSize / 2) - 1) {
            return current;
        }
    }
    return (previous +current)/2.0;
}
