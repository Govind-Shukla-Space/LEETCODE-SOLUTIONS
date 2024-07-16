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
    boolean fun(TreeNode root,int r){
        if(root==null)
            return true;
        if(root.val!=r)
            return false;
        return fun(root.left,r)&&fun(root.right,r);
    }
    public boolean isUnivalTree(TreeNode root) {
        int r=root.val;
        return fun(root,r);
    }
}