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
    // TreeNode q;
    TreeNode fun(TreeNode root){
        if(root==null)
        return null;
        int l=dfs(root.left);
        int r=dfs(root.right);
        if(l==r)
        return root;
        else if(l>r)
        return fun(root.left);
        else
        return fun(root.right);
    }
    int dfs(TreeNode root)
    {
        if(root==null)
        return 0;
        return 1+Math.max(dfs(root.left),dfs(root.right));
    }
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        return fun(root);
        // return q;
    }
}