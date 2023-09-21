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
class Solution1 {
    public ListNode reverseList(ListNode head) {
        ListNode curr=head,pre=null,next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;
        }
        return pre;
    }
}
class Solution {
    ListNode reverse(ListNode head){
        if(head==null||head.next==null)
        return head;
        ListNode h=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return h;
    }
    public ListNode reverseList(ListNode head) {
        return reverse(head);
    }
}
