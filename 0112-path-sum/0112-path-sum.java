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
    ArrayList<Integer> arr=new ArrayList<Integer>();
    void gennum(TreeNode root,int curr){
        if(root.left==null && root.right==null){
            curr+=root.val;
            arr.add(curr);
            return;
        }
        curr+=root.val;
        if(root.left!=null)
        gennum(root.left,curr);
        if(root.right!=null)
        gennum(root.right,curr);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)
        {
            return false;
        }
        gennum(root,0);
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)==targetSum)
            return true;
            // System.out.print(arr.get(i)+" ");
        }
        return false;
    }
}