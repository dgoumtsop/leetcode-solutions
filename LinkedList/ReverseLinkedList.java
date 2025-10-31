// 

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            ListNode temp = curr.next; // store next
            curr.next = prev;          // reverse link
            prev = curr;               // move prev forward
            curr = temp;               // move curr forward
        }
        return prev; // new head
    }
}
