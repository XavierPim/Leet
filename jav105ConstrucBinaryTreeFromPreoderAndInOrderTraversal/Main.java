package jav105ConstrucBinaryTreeFromPreoderAndInOrderTraversal;

public class Main {
    public static void main(String[] args){
    int[] preorder= {3,9,20,15,17};
    int[] inorder = {9,3,15,20,17};
Solution solution = new Solution();
solution.buildTree(preorder, inorder);

    }
}
