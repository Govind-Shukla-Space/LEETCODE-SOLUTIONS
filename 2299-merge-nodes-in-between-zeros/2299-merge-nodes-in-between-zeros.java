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
    public ListNode mergeNodes(ListNode head) {
        ListNode t1=head.next,t2=new ListNode(-1),t3=t2;
        int sum=0;
        while(t1!=null){
            if(t1.val==0){
                t2.next=new ListNode(sum);
                t2=t2.next;
                sum=0;
            }
            else{
                sum+=t1.val;
            }
            t1=t1.next;
        }
        return t3.next;
    }
}