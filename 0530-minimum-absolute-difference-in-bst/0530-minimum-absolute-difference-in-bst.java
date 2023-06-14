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
    double m=Double.MAX_VALUE ;
    TreeNode p=null;
    void pre(TreeNode root){
        if(root==null)
        return;
        pre(root.left);
        if(p!=null)
        m=Math.min(m,root.val-p.val);
        p=root;
        pre(root.right);
    }
    public int getMinimumDifference(TreeNode root) {
        pre(root);
        return (int)m;
    }
}