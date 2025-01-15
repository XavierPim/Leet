package jav19RemoveNthNodeFromEndOfList;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int x) {
        this.val = x;
    }

    ListNode(int x, ListNode next) {
        this.val = x;
        this.next = next;
    }
}

public class Solution {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;
        //move fast ptr n steps ahead
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;

        return dummy.next;
    }

    public static void printList(ListNode list) {
        while (list != null) {
            System.out.print(list.val + " ");
            list = list.next;
        }
    }
}
