package jav143ReorderList;

public class Main {
    public static void main(String[] args){

    ListNode node5 = new ListNode(5,null);
    ListNode node4 = new ListNode(4,node5);
    ListNode node3 = new ListNode(3,node4);
    ListNode node2 = new ListNode(2,node3);
    ListNode head = new ListNode(1,node2);

    Solution solution = new Solution();
    solution.reorderList(head);
    }
}
