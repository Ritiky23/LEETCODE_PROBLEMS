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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode r = reverse(slow.next);
        slow.next = null;
        ListNode p = head;

        while(p != null && r != null) {
            ListNode pnextNode = p.next;
            ListNode rnextNode = r.next;

            p.next = r;
            r.next = pnextNode;
            p = pnextNode;
            r = rnextNode;
        }
    }

    public ListNode reverse(ListNode head) {
        ListNode prevNode = null;
        ListNode curNode = head;
        ListNode nextNode = head;

        while(curNode != null) {
            nextNode = nextNode.next;

            curNode.next = prevNode;
            prevNode = curNode;
            curNode = nextNode;
        }

        return prevNode;
    }
}
