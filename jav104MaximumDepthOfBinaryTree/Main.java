package jav104MaximumDepthOfBinaryTree;

public class Main {
    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
         root.right = new TreeNode(20);
         root.right.right = new TreeNode(7);
         root.right.left = new TreeNode(15);
         int result;
         Solution solution = new Solution();
         result = solution.maxDepth(root);
         System.out.println(result);
    }
}
