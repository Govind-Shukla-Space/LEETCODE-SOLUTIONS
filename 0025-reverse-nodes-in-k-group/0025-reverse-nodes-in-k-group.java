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
    int length(ListNode head){
        ListNode t=head;
        int c=0;
        while(t!=null){
            c++;
            t=t.next;
        }
        return c;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        int l=length(head),tk;
        ListNode oh=null,th=null,ot=null,tt=null,t=head,f=null;
        while (t!=null && l>=k){
            tk=k;
            tt=null;
            th=null;
            while (tk!=0){
                f=t.next;
                if (th==null){
                    t.next=null;
                    tt=t;
                }
                else
                {
                    t.next=th;
                }
                th=t;
                t=f;
                tk--;
            }
            if(oh==null){
                oh=th;
                ot=tt;
            }
            else{
                ot.next=th;
                ot=tt;
            }
            l-=k;
        }
        ot.next=f;
        return oh;
    }
}