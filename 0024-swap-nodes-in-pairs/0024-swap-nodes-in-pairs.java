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
    public ListNode swapPairs(ListNode head) {
        ListNode c,f1,sc;
        ListNode t1=new ListNode(-1);
        t1.next=head;
        c=t1;
        while(c.next!=null && c.next.next!=null){
            f1=c.next;
            sc=c.next.next;
            f1.next=sc.next;
            c.next=sc;
            c.next.next=f1;
            c=c.next.next;
        }
        
        return t1.next;
    }
}