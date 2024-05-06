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
    public ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        ListNode next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public ListNode removeNodes(ListNode head) {
       ListNode Rhead=reverse(head);

       ListNode dummy=new ListNode(Rhead.val);
       ListNode ans=dummy;

       ListNode temp=Rhead;

       int max=Rhead.val;

       while(temp!=null){
        if(temp.val>=max){
            max=temp.val;
            ListNode newNode=new ListNode(max);
            ans.next=newNode;
            ans=ans.next;
        }
        temp=temp.next;
       }
       return reverse(dummy.next);
    }
}
