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
    int sum=0,v=0,c1=0,c=0;
    void fun(TreeNode root){
        if(root==null)
        return ;
        // c+=1;
        
        fun(root.left);
        c1+=root.val;
        c+=1;
        fun(root.right);
        // System.out.println(c);
        // return (int)c1/c;
    }
    public int averageOfSubtree(TreeNode root) {
        // int c=0;
        if(root==null)
        return v;
        fun(root);
        if((int)c1/c==root.val)
        v+=1;
        c1=0;
        c=0;
        averageOfSubtree(root.left);
        c1=0;
        c=0;
        averageOfSubtree(root.right);
        return v;
    }
}