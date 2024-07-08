class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}
class Solution {
    public int findTheWinner(int n, int k) {
        Node head = new Node(1);
        Node cHead = head;
        for(int i=2;i<=n;i++) {
            Node ne = new Node(i);
            cHead.next = ne;
            cHead = cHead.next;
        }
        cHead.next = head;
        Node prev = cHead;
        Node l = head;

        while(l.next!=l) {
            int t = k-1;
            while(t>0) {
                prev=l;
                l=l.next;
                t--;
            }
            l=l.next;
            
            prev.next = l;
        }

        return l.val;
    }
}
