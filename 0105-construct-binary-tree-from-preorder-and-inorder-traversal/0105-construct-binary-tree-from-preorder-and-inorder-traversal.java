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
    HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
    TreeNode f1(int pre[],int pi,int in[],int ii,int n){
        if(n==0)
        return null;
        TreeNode root=new TreeNode(pre[pi]);
        int idx=map.get(pre[pi]);
        int left=idx-ii;
        root.left=f1(pre,pi+1,in,ii,left);
        root.right=f1(pre,pi+1+left,in,ii+left+1,n-left-1);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++)
        map.put(inorder[i],i);
        return f1(preorder,0,inorder,0,preorder.length);
    }
}