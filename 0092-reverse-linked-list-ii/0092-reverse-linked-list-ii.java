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
    public ListNode rev(ListNode head,ListNode head2) {
        ListNode p=head2,n=null,curr=head;
        while(curr!=head2){
            n=curr.next;
            curr.next=p;
            p=curr;
            curr=n;
        }
        return p;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int c=0;
        if(left==right)
        return head;
        ListNode t1=head,t3=head,t2=t3;
        while(t1!=null && c!=left-1){
            t1=t1.next;
            c+=1;
        }
        ListNode q=t1;
        while(t1!=null && c!=right){
            t1=t1.next;
            c+=1;
        }
        ListNode w=t1;
        ListNode e=rev(q,w);
        if(left==1)
        return e;
        c=0;
        System.out.println(t3.val);
        while (t3!=null){
            System.out.println(t3.val);
            if(t3.next==q){
                t3.next=e;
                break;
            }
            
            t3=t3.next;
        }
        // if(t3!=null)
        // t3.next=e;
        // while(e.next!=null){
        //     e=e.next;
        // }
        // // if(t3!=null)
        // e.next =w;
        return t2;
    }
}