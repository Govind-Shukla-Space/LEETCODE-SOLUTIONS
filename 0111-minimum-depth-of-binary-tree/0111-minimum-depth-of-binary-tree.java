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
    ArrayList <Integer> arr=new ArrayList<Integer>();
    int max=Integer.MAX_VALUE;
    void depth(TreeNode root,int c){
        if(root.left==null && root.right==null){
            c+=1;
            // arr.add(c);
            max=Math.min(max,c);
        }
        c+=1;
        if(root.left!=null)
        depth(root.left,c);
        if(root.right!=null)
        depth(root.right,c);
    }
    public int minDepth(TreeNode root) {
        if(root==null)
        return 0;
        depth(root,0);
        // int m=Integer.MAX_VALUE;
        // for(int i=0;i<arr.size();i++){
        //     if(arr.get(i)<m)
        //     m=arr.get(i);
        // }
        return max;
    }
}