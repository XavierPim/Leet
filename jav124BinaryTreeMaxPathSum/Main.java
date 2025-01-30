package jav124BinaryTreeMaxPathSum;

public class Main {
    public static void main(String[] args){
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    Solution solution = new Solution();
    System.out.println(solution.maxPathSum(root));
    }
}
