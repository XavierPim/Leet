#include "Solution.hpp"

double Solution::findMedianSortedArray(vector<int>& nums1, vector<int> nums2) {
    vector<int> *biggerArr = nums1.size() > nums2.size() ? &nums1 : &nums2;
    vector<int> *smallerArr = nums1.size() > nums2.size() ? &nums2 : &nums1;
    int i = 0, j = 0;
    int previous = 0, current = 0;
    int totalSize = nums1.size() + nums2.size();

    // Traverse until the median element(s)
    for (int count = 0; count <= totalSize / 2; ++count) {
        previous = current;

        // Ensure we don't exceed the array bounds
        if (i < biggerArr->size() && (j >= smallerArr->size() || (*biggerArr)[i] < (*smallerArr)[j])) {
            current = (*biggerArr)[i++];
        } else {
            current = (*smallerArr)[j++];
        }
    }

    // If odd total size, return the current middle element
    if (totalSize % 2 == 1) {
        return current;
    }

    // If even total size, return the average of the two middle elements
    return (previous + current) / 2.0;
}