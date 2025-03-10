package jav133CloneGraph;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    private Map<Node, Node> clonedNodes = new HashMap<>();

    public Node cloneGraph(Node node){
        if(node == null) return node;

        if(clonedNodes.containsKey(node)){
        return clonedNodes.get(node);
        }

        Node clone = new Node(node.val);
        clonedNodes.put(node, clone);

        for(Node neighbor : node.neighbors){
            clone.neighbors.add(cloneGraph(neighbor));
        }
        return clone;
    }
}
