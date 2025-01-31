package jav297SerializeAndDeserializeBinaryTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Codec {
    public String serialize(TreeNode root) {
        if (root == null) return "null"; // Handle empty tree

        StringBuilder proc = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            if (node == null) {
                proc.append("null,");
                continue;
            }

            proc.append(node.val).append(",");
            queue.add(node.left);
            queue.add(node.right);
        }

        while (proc.length() > 5 && proc.substring(proc.length() - 5).equals("null,")) {
            proc.setLength(proc.length() - 5);
        }
        proc.setLength(proc.length()- 1);
        return proc.toString();
    }

    public TreeNode deserialize(String data) {
        if (data.equals("null")) return null;

        String[] nodes = data.split(",");
        Queue<TreeNode> queue = new LinkedList<>();

        TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));
        queue.add(root);

        int i = 1; // Index for iterating over nodes[]
        while (!queue.isEmpty() && i < nodes.length) {
            TreeNode current = queue.poll(); // Get the current node

            if (i < nodes.length && !nodes[i].equals("null")) {
                current.left = new TreeNode(Integer.parseInt(nodes[i]));
                queue.add(current.left);
            }
            i++;

            if (i < nodes.length && !nodes[i].equals("null")) {
                current.right = new TreeNode(Integer.parseInt(nodes[i]));
                queue.add(current.right);
            }
            i++;
        }

        return root;
    }

}
