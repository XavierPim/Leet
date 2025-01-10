package jav141LinkedListCycle;

public class Main {
    public static void main(String[] args){
        ListNode node3 = new ListNode(-4);
        ListNode node2 = new ListNode(0);
        ListNode node1 = new ListNode(2);
        ListNode head = new ListNode(3);


        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node1);
        Solution detect = new Solution();

        boolean result = detect.hasCycle(head);
        System.out.println(result);

    }
}
