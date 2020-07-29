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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = null;
        ListNode cur = null;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int tmp = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
            if (tmp >= 10) {
                tmp %= 10;
                carry = 1;
            } else {
                carry = 0;
            }
            if (res == null) {
                res = new ListNode(tmp, null);
                cur = res;
            } else {
                cur.next = new ListNode(tmp, null);
                cur = cur.next;
            }
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        if (carry == 1) {
            cur.next = new ListNode(1, null);
        }
        return res;
    }
}
