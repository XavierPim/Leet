package jav226InvertBinaryTree;

public class Main {
    public static void main(String[] args){
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        root.right = new TreeNode(7, new TreeNode(6), new TreeNode(9));
        Solution solution = new Solution();
        solution.invertTree(root);
    }
}
