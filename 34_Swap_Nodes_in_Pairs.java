34.Swap Nodes in Pairs

solution:-
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode temp = head.next;
        swapper(head);
        return temp;
    }
    void swapper(ListNode head)
    {
        if(head == null || head.next == null) return;
        ListNode temp = head.next;
        head.next = head.next.next;
        temp.next = head;
        ListNode temp2 = null;
        if(head.next != null)
         temp2 = head.next.next;
        swapper(head.next);
        if(temp2 != null)
        head.next = temp2;
        
    }
}