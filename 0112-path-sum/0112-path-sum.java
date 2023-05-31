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
    int f=0;
    boolean b=false;
    void gennum(TreeNode root,int curr,int target){
        if(root.left==null && root.right==null){
            curr+=root.val;
            
            if(curr==target && f==0){
            b=true;
            f=1;}
            return;
        }
        curr+=root.val;
        if(root.left!=null)
        gennum(root.left,curr,target);
        if(root.right!=null)
        gennum(root.right,curr,target);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)
        {
            return false;
        }
        gennum(root,0,targetSum);

        return b;
    }
}