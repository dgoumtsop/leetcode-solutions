// Problem: Reverse LinkedList
// Approach: Two pointers Approach
// curr and prev pointer, store the next and reverse the link 
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            ListNode temp = curr.next; 
            curr.next = prev;          
            prev = curr;              
            curr = temp;            
        }
        return prev; // new head
    }
}
