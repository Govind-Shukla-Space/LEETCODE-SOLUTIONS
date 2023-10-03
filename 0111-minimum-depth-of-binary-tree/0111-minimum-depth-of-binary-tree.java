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
class Solution1 {
    int min=Integer.MAX_VALUE;
    void fun(TreeNode root,int c){
        if(root.left==null||root.right==null){
            c+=1;
            min=Math.min(c,min);
        }
        c+=1;
        if(root.left!=null)
        fun(root.left,c);
        if(root.right!=null)
        fun(root.right,c);
    }
    public int minDepth(TreeNode root) {
        fun(root,0);
        return min;
    }
}

class Solution{
    
    int fun(TreeNode root){
        if(root.left==null&&root.right==null){
            return 1;
        }
        int min=Integer.MAX_VALUE;
        if(root.left!=null){
            int l=fun(root.left)+1;
            min=Math.min(min,l);
        }
        if(root.right!=null){
            int r=fun(root.right)+1;
            min=Math.min(min,r);
        }
        return min;
    }
    public int minDepth(TreeNode root) {
        if(root==null)
        return 0;
        return fun(root);
    }
}