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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode uni=list1;
        ListNode t1=null;
        ListNode t2=list2;
        int i=0;
        while(uni.next!=null){
            if(i==a-1){
                t1=uni;
                uni=uni.next;
                t1.next=t2;
            }
            if(i==b){
                break;
            }
            i++;
            uni=uni.next;
        }
        System.out.println(uni.val+" "+i);
        while(t2.next!=null){
            t2=t2.next;
        }
        t2.next=uni;
        return list1;
    }
}
