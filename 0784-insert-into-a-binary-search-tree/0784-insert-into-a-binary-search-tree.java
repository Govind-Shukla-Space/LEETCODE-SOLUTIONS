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
    TreeNode fun(TreeNode root,int key){
        if(root==null)
        return new TreeNode(key);
        if (key<root.val)
        root.left=fun(root.left, key);
        else if (key>root.val)
        root.right=fun(root.right, key);
        return root;
        
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null)
        return new TreeNode(val);
        return fun(root,val);
        // return root;
    }
}