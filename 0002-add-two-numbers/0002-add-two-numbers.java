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
        int carry = 0;
        ListNode temp = l1;
        ListNode res = temp;
        while (l1 != null || l2 != null || carry!=0) {
            temp.val = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
            if (temp.val > 9) {
                temp.val %= 10;
                carry = 1;
            } else {
                carry = 0;
            }
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
            if (l1 != null || l2 != null || carry != 0) {
                temp.next = new ListNode();
                temp = temp.next;
            }
        }
        return res;
    }
}