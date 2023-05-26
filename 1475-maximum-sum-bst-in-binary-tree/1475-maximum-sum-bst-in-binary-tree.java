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
// class Solution1 {
//     int s=0;
//     boolean check(TreeNode root,long mi,long ma){
//         if(root==null)
//         return true;
//         if(root.left==null || root.right==null)
//         return false;
//         else
//         return check(root.left,mi,root.val)&(root.right,root.val,ma);
//     }
//     int sum(TreeNode root){
//         if(root==null)
//         return 0;
//         sum(root.left);
//         s+=rooot.val;
//         sum(root.right);
//         return s;
//     }
//     public int maxSumBST(TreeNode root) {
        
//     }
// }
class Solution {
    static class Info{
        int sum,max,min;
        Info(int x,int y,int z){
            sum=x;
            max=y;
            min=z;
        }
    }
    int ans=0,min,s,max;
    Info helper(TreeNode root){
        if (root==null)
        return new Info(0,Integer.MIN_VALUE,Integer.MAX_VALUE);
        Info left=helper(root.left);
        Info right=helper(root.right);
        if(left.max<root.val && root.val<right.min){
         s=left.sum+right.sum+root.val;
         max=Math.max(root.val,right.max);
         min=Math.min(root.val,left.min);
         ans=Math.max(s,ans);
         return new Info(s,max,min);
        }
        else
        return new Info(Math.max(left.sum,right.sum),Integer.MAX_VALUE,Integer.MIN_VALUE);
    }
    public int maxSumBST(TreeNode root) {
     helper(root);
     return ans;
    }
}