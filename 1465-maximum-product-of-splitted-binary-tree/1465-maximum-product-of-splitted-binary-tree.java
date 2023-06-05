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
    ArrayList<Long> arr=new ArrayList<Long>();
    long change(TreeNode root){
        if(root==null)
        return 0;
        long l=change(root.left);
        long r=change(root.right);
        arr.add(l+r+root.val);
        return l+r+root.val;
    }
    public int maxProduct(TreeNode root) {
        change(root);
        long max=Long.MIN_VALUE;
        long a=arr.get(arr.size()-1);
        for(int i=0;i<arr.size();i++){
            max=Math.max(max,arr.get(i)*(a-arr.get(i)));
        }
        return (int)(max% (Math.pow(10,9)+7));

    }
}