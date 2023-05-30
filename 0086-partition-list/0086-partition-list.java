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
    public ListNode partition(ListNode head, int x) {
        ListNode t=head,t2;
        ListNode t1=new ListNode(-200);
        t2=t1;
        
        while(t!=null){
            if(t.val<x){
            t1.next=new ListNode(t.val);
            t1=t1.next;
            t.val=-200;
            }
            t=t.next;
        }
        int f=0;
        t=head;
        while(t!=null){
            if(t.val!=-200)
                {
            t1.next=new ListNode(t.val);
            t1=t1.next;}
            
            t=t.next;
        }
        return t2.next;
    }
}