package jav102BinaryTreeLevelOrderTraversal;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        Solution solution = new Solution();
        List<List<Integer>> result = solution.levelOrder(root);
        for(List<Integer> list : result){
            System.out.print(list);
        }
    }
}
