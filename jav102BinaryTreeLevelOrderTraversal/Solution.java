package jav102BinaryTreeLevelOrderTraversal;

import java.util.ArrayList;
import java.util.List;
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        levelTraverse(root, 0, result);  // Start DFS traversal from root at level 0
        return result;
    }

    private void levelTraverse(TreeNode root, int level, List<List<Integer>> result) {
        if (root == null) return;

        // If result size is smaller than the level, add a new list
        if (result.size() == level) {
            result.add(new ArrayList<>());
        }

        // Add current node's value to the corresponding level list
        result.get(level).add(root.val);

        // Recursive calls for left and right subtrees
        levelTraverse(root.left, level + 1, result);
        levelTraverse(root.right, level + 1, result);
    }
}


