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
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode t=head;
        ListNode p=t;
        if(t.next!=null) p=t.next;
        t.next=null;
        while(p!=null){
            ListNode q=p;
            p=p.next;
            q.next=t;
            t=q;
    }
    return t;
        
    }
}
