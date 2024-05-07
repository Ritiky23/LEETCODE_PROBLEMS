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
    public ListNode doubleIt(ListNode head) {
        // Calculate the sum of values in the original linked list
        ListNode curr = head;
        List<Integer> digits = new ArrayList<>();

        while (curr != null) {
            digits.add(curr.val);
            curr = curr.next;
        }

        // Double the sum represented by the digits (using custom BigInt handling)
        List<Integer> resultDigits = new ArrayList<>();
        int carry = 0;

        for (int i = digits.size() - 1; i >= 0; i--) {
            int doubledDigit = digits.get(i) * 2 + carry;
            resultDigits.add(0, doubledDigit % 10);
            carry = doubledDigit / 10;
        }

        // Append any remaining carry as new digits
        while (carry > 0) {
            resultDigits.add(0, carry % 10);
            carry /= 10;
        }

        // Create the resultant linked list from the digits
        ListNode dummy = new ListNode(); // Dummy head node
        ListNode tail = dummy;

        for (int digit : resultDigits) {
            tail.next = new ListNode(digit);
            tail = tail.next;
        }

        return dummy.next; // Return the head of the resultant linked list
    }
}
