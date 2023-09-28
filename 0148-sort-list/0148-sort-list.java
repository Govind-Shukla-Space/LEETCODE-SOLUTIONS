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
    public ListNode sortList(ListNode head) {
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
class Solution {
    ListNode itermerge(ListNode l1,ListNode l2){
        if(l1==null)
        return l2;
        if(l2==null)
        return l1;
        ListNode dm=new ListNode();
        ListNode pre=dm,c1=l1,c2=l2;
        while(c1!=null&&c2!=null){
            if(c1.val<=c2.val){
                pre.next=c1;
                c1=c1.next;
            }
            else{
                pre.next=c2;
                c2=c2.next;
            }
            pre=pre.next;
        }
        if(c1==null)
        pre.next=c2;
        else
        pre.next=c1;
        return dm.next;
    }
    ListNode recurmerge(ListNode l1,ListNode l2){
        if(l1==null)
        return l2;
        if(l2==null)
        return l1;
        ListNode res=null;
        if(l1.val<=l2.val){
            res=l1;
            res.next=recurmerge(l1.next,l2);
        }
        else{
             res=l2;
            res.next=recurmerge(l1,l2.next);
        }
        return res;
    }
    ListNode getmiddle(ListNode head){
        ListNode s=head,f=head;
        while(f.next!=null&&f.next.next!=null){
            s=s.next;
            f=f.next.next;
        }
        ListNode ter=s.next;
        s.next=null;
        return ter;
    }
    ListNode mergesort(ListNode head){
        if(head==null || head.next==null)
        return head;
        ListNode hah=getmiddle(head);
        ListNode left=mergesort(head);
        ListNode right=mergesort(hah);
        return recurmerge(left,right);
    }
    public ListNode sortList(ListNode head) {
        // System.out.println(getmiddle(head));
        return mergesort(head);
    }
}