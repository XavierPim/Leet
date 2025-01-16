package jav143ReorderList;

import java.util.ArrayList;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x, ListNode head){
        this.val = x;
        this.next = head;
    }
}
public class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return; // No need to reorder if the list has 0 or 1 nodes
        }

        // Initialize fast and slow pointers
        ListNode fast = head;
        ListNode slow = head;

        // ArrayList to store the nodes
        ArrayList<ListNode> list = new ArrayList<>();

        // Traverse the list and store all nodes in the ArrayList
        while (slow != null) {
            list.add(slow);
            slow = slow.next;
        }

        // Reorder the list using the ArrayList
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            // Connect the current node to the node from the right
            list.get(left).next = list.get(right);
            left++;

            // Avoid creating a cycle for the last pair
            if (left == right) break;

            // Connect the current right node to the next node from the left
            list.get(right).next = list.get(left);
            right--;
        }

        // Ensure the last node points to null
        list.get(left).next = null;

        // Print the reordered list for debugging
        printList(head);
    }

    void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}
