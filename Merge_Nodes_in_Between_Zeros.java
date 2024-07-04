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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp=head.next;
        int sum=0;
        ListNode prev=head;
        while(temp!=null)
        {
            if(temp.val==0)
            {
                prev.val=sum;
                if(temp.next==null)
                {
                    prev.next=null;
                }
                else
                {
   prev.next=temp;
                prev=temp;
                sum=0;
                }
             

            }
            else
            {
                sum=sum+temp.val;
            }
            temp=temp.next;
        }
        prev.next=null;
        return head;
    }
}
