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
    TreeNode fun(TreeNode root){
        if(root==null)
        return null;
        root.left=fun(root.left);
        root.right=fun(root.right);
        if(root.left==null&& root.right==null&&root.val==0)
        return null;
        return root;
    }
    public TreeNode pruneTree(TreeNode root) {
        return fun(root);
        
    }
}