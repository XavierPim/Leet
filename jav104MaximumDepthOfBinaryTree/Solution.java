package jav104MaximumDepthOfBinaryTree;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int data) {this.val = data;}
    TreeNode(int data, TreeNode left, TreeNode right) {
        this.val = data;
        this.left = left;
        this.right = right;
    }
}
public class Solution {
    public int maxDepth(TreeNode root) {
    if(root==null)return 0;
    if(root.left == null && root.right == null) return 1;
    int left = maxDepth(root.left);
    int right = maxDepth(root.right);

    return Math.max(left, right)+1;
    }
}

