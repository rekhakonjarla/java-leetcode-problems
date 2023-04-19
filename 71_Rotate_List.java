71.Rotate List

solution:-

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
    public ListNode rotateRight(ListNode head, int k) {
        if (k==0 || head==null) return head;
        int count = 1;
        ListNode temp = head;
        while (temp.next!=null) {
            count++;
            temp = temp.next;
        }
        if (k>count) k = k%count;
        if (k==count) return head;
        k = count-k-1;
        temp.next = head;
        temp = head;
        while (k>0) {
            k--;
            temp = temp.next;
        }
        head = temp.next;
        temp.next = null;
        return head;
    }
}