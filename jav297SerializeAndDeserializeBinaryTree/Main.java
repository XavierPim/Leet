package jav297SerializeAndDeserializeBinaryTree;

public class Main {
     public static void main(String[] args){
         TreeNode root = new TreeNode(1);
         root.left = new TreeNode(2);
         root.right = new TreeNode(3, new TreeNode(4), new TreeNode(5));
         Codec codec = new Codec();
        System.out.print(codec.serialize(root));
     }
}