package jav105ConstrucBinaryTreeFromPreoderAndInOrderTraversal;

import java.util.HashMap;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int val){this.val = val;}
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class Solution {
    private HashMap<Integer, Integer> inorderMap; // Store index of values in inorder array
    private int preorderIndex = 0; // Track current root in preorder array

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        inorderMap = new HashMap<>();
        // Store inorder values with their indices for quick lookup
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }
        return constructTree(preorder, 0, inorder.length - 1);
    }

    private TreeNode constructTree(int[] preorder, int left, int right) {
        if (left > right) return null; // Base case: no elements to construct the tree

        int rootVal = preorder[preorderIndex++]; // Get the root from preorder
        TreeNode root = new TreeNode(rootVal);

        // Find the root index in inorder array
        int inorderIndex = inorderMap.get(rootVal);

        // Recursively build left and right subtrees
        root.left = constructTree(preorder, left, inorderIndex - 1);
        root.right = constructTree(preorder, inorderIndex + 1, right);

        return root;
    }
}
