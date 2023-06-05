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
    public ListNode insertionSortList(ListNode head) {
        if(head==null || head.next==null)
        return head;
        ListNode r=insertionSortList(head.next);
        if(head.val<=r.val){
            head.next=r;
            return head;
        }
        ListNode prev=r;
        while(prev.next!=null && prev.next.val<head.val){
            prev=prev.next;
        }
        head.next=prev.next;
        prev.next=head;
        return r;
    }
}

//top-down
class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head==null || head.next==null)
        return head;
        ListNode lastnode=head.next;
        ListNode sortedArray=head;
        head.next=null;
        while(lastnode!=null){
            //sortedArray is f(n-1)
            //lastnode is nth node
            //insert lastnode in the sortedArray
            ListNode nextnode=lastnode.next;
            if(lastnode.val<=sortedArray.val){
                lastnode.next=sortedArray;
                sortedArray=lastnode;
            }
            else{
                ListNode prev=sortedArray;
                while(prev.next!=null && prev.next.val<lastnode.val){
                    prev=prev.next;
                }
                lastnode.next=prev.next;
                prev.next=lastnode;
            }
            lastnode=nextnode;
        }
        return sortedArray;
    }
}
