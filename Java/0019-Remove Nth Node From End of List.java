/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node1 = head;
        ListNode node2 = head;
        for (int i = 0; i < n; i++) {
            node2 = node2.next;
        }
        if (node2 == null) {
            return head.next;
        }
        while (node2.next != null) {
            node1 = node1.next;
            node2 = node2.next;
        }
        node1.next = node1.next.next;
        return head;
    }
}
