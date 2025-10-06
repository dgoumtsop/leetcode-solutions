// Definition for singly-linked list.

public class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { 
        this.val = val; 
    }
    ListNode(int val, ListNode next) { 
        this.val = val; 
        this.next = next; 
    }
}

// Problem: Merge Two Sorted Lists
// Approach: Two-pointer merging approach
// iteratively comparing their nodes and linking 
// the smaller one to the result list using a dummy head pointer.
// Time Complexity: O(n + m)
// Space Complexity: O(1)
 
 public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode curr = dummy;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                curr.next = list1;
                list1 =list1.next;
            } else{
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }
        if(list1 != null){
            curr.next = list1;
        } else {
            curr.next = list2;
        }
        return dummy.next;    
    }
