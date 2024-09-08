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
         int c=0;
         while(head!=null){
            c+=1;
            head=head.next;
        }
        return c;
    }
    public ListNode[] splitListToParts(ListNode head, int k) {
        int l=length(head);
        int a=l%k,b=(int)(l/k);
        int arr1[]=new int[k];
        System.out.println(l+" "+a+" "+b);
        for(int i=0;i<k;i++){
            if(k>=l){
                arr1[i]=0;
            }
            else{
            if(a>0){
                arr1[i]=1;
            }
            else
            arr1[i]=0;
            }
            a-=1;
        }
        for(int j=0;j<arr1.length;j++)
        System.out.println(arr1[j]);
        ListNode arr[]=new ListNode[k];
        ListNode t=head,t1=null;
        int u=0,p=0,o=0;
        if(b==0){
            for(int i=0;t!=null&&i<k;i++){
                t1=t.next;
                arr[i]=t;
                t.next=null;
                
                t=t1;
            }
        }
        for(int i=0;t!=null&&i<k;i++){
            arr[i]=t;
            for (int j=0;j<b+arr1[i];j++){
                t1=t;
                t=t.next;
            }
            if (t1!=null)
            t1.next=null;
        }
        return arr;
    }
}