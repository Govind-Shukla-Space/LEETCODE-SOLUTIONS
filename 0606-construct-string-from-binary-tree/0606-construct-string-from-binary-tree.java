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
    String s="";
    void fun(TreeNode root){
        if(root.left==null&&root.right==null)
        {
            s+=root.val;
            return;
        }
        s+=root.val;
        // System.out.println(s);
        // s+=(char)root.val;
        if(root.left!=null)
        {s+="(";
        fun(root.left);
        s+=")";}
        if(root.left==null&&root.right!=null){s+="()";}
        if(root.right!=null)
        {s+="(";
        fun(root.right);
        s+=")";}
    }
    public String tree2str(TreeNode root) {
        fun(root);
        
        return s;
    }
}