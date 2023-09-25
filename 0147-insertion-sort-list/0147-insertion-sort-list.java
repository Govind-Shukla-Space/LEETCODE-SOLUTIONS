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
    public ListNode insertionSortList(ListNode head) {
        if(head==null||head.next==null)
        return head;
        ListNode t1=head.next,next=null;
        ListNode t2=null,sort=head;
        head.next=null;
        while (t1!=null){
            t2=t1.next;
            if(t1.val<=sort.val){
                t1.next=sort;
                sort=t1;
            }
            else{
                next=sort;
                while(next.next!=null&& next.next.val<t1.val)
                    next=next.next;
                t1.next=next.next;
                next.next=t1;
            }
            t1=t2;
        }
        return sort;
    }
}