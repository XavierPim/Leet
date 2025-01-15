package jav19RemoveNthNodeFromEndOfList;

import static jav19RemoveNthNodeFromEndOfList.Solution.printList;

public class Main {
    public static void main(String[] Args){
    ListNode node4 = new ListNode(5, null);
    ListNode node3 = new ListNode(4, node4);
    ListNode node2 = new ListNode(3, node3);
    ListNode node1 = new ListNode(2, node2);
    ListNode head = new ListNode(1, node1);

    Solution solution = new Solution();
    ListNode result = solution.removeNthFromEnd(head, 2);
    printList(result);
    }
}
