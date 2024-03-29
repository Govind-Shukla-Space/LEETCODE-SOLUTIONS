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
    int fun(TreeNode root,int max,int min){
        if(root==null)
        return max-min;
        max=Math.max(root.val,max);
        min=Math.min(root.val,min);
        int left=fun(root.left,max,min);
        int right=fun(root.right,max,min);
        return Math.max(left,right);
    }
    public int maxAncestorDiff(TreeNode root) {
        return fun(root,-1,100001);
        
    }
}