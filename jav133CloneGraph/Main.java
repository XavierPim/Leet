package jav133CloneGraph;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Step 1: Create graph nodes
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        // Step 2: Establish bidirectional connections (Undirected Graph)
        node1.neighbors.add(node2);
        node1.neighbors.add(node4);
        node2.neighbors.add(node1);
        node2.neighbors.add(node3);
        node3.neighbors.add(node2);
        node3.neighbors.add(node4);
        node4.neighbors.add(node1);
        node4.neighbors.add(node3);

        // Step 3: Clone the graph
        Solution solution = new Solution();
        Node clonedGraph = solution.cloneGraph(node1);

        // Step 4: Print original and cloned graphs to verify correctness
        System.out.println("Original Graph:");
        printGraph(node1, new HashSet<>());

        System.out.println("\nCloned Graph:");
        printGraph(clonedGraph, new HashSet<>());
    }

    // Helper function to print the graph (DFS traversal)
    public static void printGraph(Node node, Set<Integer> visited) {
        if (node == null || visited.contains(node.val)) return;
        visited.add(node.val);

        System.out.print("Node " + node.val + " -> [ ");
        for (Node neighbor : node.neighbors) {
            System.out.print(neighbor.val + " ");
        }
        System.out.println("]");

        for (Node neighbor : node.neighbors) {
            printGraph(neighbor, visited);
        }
    }
}
