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
    
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                arr[i][j]=-1;
        int r1=0,r2=m-1,c1=0,c2=n-1;
        while(head!=null){
            for(int i=c1;i<=c2&&head!=null;i++){
                arr[r1][i]=head.val;
                head=head.next;
                // System.out.println(arr[r1][i]+" ");
            }
            r1++;
            for(int i=r1;i<=r2&&head!=null;i++){
                arr[i][c2]=head.val;
                head=head.next;
            }
            c2--;
            for(int i=c2;i>=c1&&head!=null;i--){
                arr[r2][i]=head.val;
                head=head.next;
            }
            r2--;
            for(int i=r2;i>=r1&&head!=null;i--){
                arr[i][c1]=head.val;
                head=head.next;
            }
            c1++;
            // fun(arr);
            // System.out.println();
        }
        return arr;
    }
}