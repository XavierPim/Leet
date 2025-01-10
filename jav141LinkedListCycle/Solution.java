package jav141LinkedListCycle;


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        next = null;
        val = x;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}

public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false; // No cycle in an empty list or a single-node list
        }

        ListNode slow = head; // Tortoise pointer
        ListNode fast = head; // Hare pointer

        while (fast != null && fast.next != null) {
            slow = slow.next;       // Move slow one step
            fast = fast.next.next;  // Move fast two steps

            if (slow == fast) {     // If they meet, a cycle exists
                return true;
            }
        }

        return false; // No cycle found
    }
}


