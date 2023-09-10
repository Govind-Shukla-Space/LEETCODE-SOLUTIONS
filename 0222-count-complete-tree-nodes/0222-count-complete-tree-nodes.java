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
    int c=0;
    void fun(TreeNode root){
        if(root==null)
        return ;
        fun(root.left);
        c+=1;
        fun(root.right);
    }
    public int countNodes(TreeNode root) {
        fun(root);
        return c;
    }
}