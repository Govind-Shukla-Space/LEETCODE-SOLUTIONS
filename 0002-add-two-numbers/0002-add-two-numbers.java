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
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t=new ListNode(-1);
        ListNode t1=t;
        int c=0,x,s;
        while (l1!=null && l2!=null){
            x=c+l1.val+l2.val;
            s=x%10;
            c=x/10;
            t.next=new ListNode(s);
            t=t.next;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            if(c!=0){
                x=c+l1.val;
                c=0;
                }
            else{
                x=l1.val;
                }
                s=x%10;
                c=x/10;
                t.next=new ListNode(s);
                t=t.next;
                l1=l1.next;
    }
    while(l2!=null){
            if(c!=0){
                x=c+l2.val;
                c=0;
                }
            else{
                x=l2.val;
                }
                s=x%10;
                c=x/10;
                t.next=new ListNode(s);
                t=t.next;
                l2=l2.next;
    }
    if(c!=0)
    t.next=new ListNode(c);
    return t1.next;
}
}