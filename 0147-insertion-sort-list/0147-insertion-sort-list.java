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
        ListNode t1=head.next,t2=null;
        ListNode sort=head;
        sort.next=null;
        while(t1!=null){
            t2=t1.next;
            if(t1.val<=sort.val){
                t1.next=sort;
                sort=t1;
            }
            else{
                ListNode pre=sort;
                while(pre.next!=null && t1.val>pre.next.val){
                    pre=pre.next;
                }
                t1.next=pre.next;
                pre.next=t1;
            }
            t1=t2;
        }
        return sort;
    }
}