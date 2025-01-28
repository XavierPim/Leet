package jav100SameTree;

public class Main {
    public static void main(String[] args){
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);
        Solution solution = new Solution();
        boolean result = solution.isSameTree(p,q);
        System.out.println(result);
    }
}
