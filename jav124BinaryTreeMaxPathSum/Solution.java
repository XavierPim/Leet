package jav124BinaryTreeMaxPathSum;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}
    TreeNode(int val) {this.val = val;}
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution {
    private int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxSum;
    }

    private int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }
        // Get max sum from left and right subtrees (ignore negative values)
        int leftMax = Math.max(dfs(node.left), 0);
        int rightMax = Math.max(dfs(node.right), 0);

        // Compute max path sum considering the current node as root
        int currentPathSum = node.val + leftMax + rightMax;

        // Update the global max sum
        maxSum = Math.max(maxSum, currentPathSum);

        // Return the max gain from either left or right path
        return node.val + Math.max(leftMax, rightMax);
    }
}
