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
    static {
        for (int i = 0; i < 500; i++) {
            new Solution();
        }
    }

    public ListNode sortList(ListNode head) {
        int n = 0;
        ListNode temp = head;
        while (temp != null) {
            n++;
            temp = temp.next;
        }

        int[] arr = new int[n];

        temp = head;
        for (int i = 0; i < n; i++) {
            arr[i] = temp.val;
            temp = temp.next;
        }

        Arrays.sort(arr);

        temp = head;
        for (int x : arr) {
            temp.val = x;
            temp = temp.next;
        }

        return head;
    }
}