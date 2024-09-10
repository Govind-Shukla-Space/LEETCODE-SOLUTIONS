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
    int gdivisor(int a,int b){
        if(b==0)
        return a;
        return gdivisor(b,a%b);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode t1=head;
        while(t1!=null&&t1.next!=null){
            ListNode a=new ListNode(gdivisor(t1.val,t1.next.val));
            ListNode b=t1.next;
            t1.next=a;
            a.next=b;
            t1=t1.next.next;
        }
        return head;
    }
}