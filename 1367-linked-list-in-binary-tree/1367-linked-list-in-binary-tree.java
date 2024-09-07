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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    boolean check(TreeNode root,ListNode head,ListNode t ){
        if(head==null)
            return true;
        if(root==null)
            return false;
        boolean flag=root.val==head.val;
        if(flag)
            return check(root.left,head.next,t)||check(root.right,head.next,t);
        else{
            head=t;
            return check(root.left,head,t)||check(root.right,head,t);
        }
    }
    public boolean isSubPath(ListNode head, TreeNode root) {
        if(root==null)
            return false;
        if(head==null)
            return true;
        return check(root,head,head)||isSubPath(head,root.left)||isSubPath(head,root.right);
    }
}