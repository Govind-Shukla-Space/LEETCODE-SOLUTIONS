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
    TreeNode getRightMost(TreeNode leftnode,TreeNode curr){
        while (leftnode.right!=null && leftnode.right!=curr)
            leftnode=leftnode.right;
        return leftnode;
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> arr=new ArrayList<Integer>();
        TreeNode curr=root;
        while(curr!=null){
            TreeNode leftnode=curr.left;
            if(leftnode==null){
                arr.add(curr.val);
                curr=curr.right;
            }
            else{
                TreeNode rightmost=getRightMost(leftnode,curr);
                if(rightmost.right==null){
                    rightmost.right=curr;
                    curr=curr.left;
                }
                else{
                    rightmost.right=null;
                    arr.add(curr.val);
                    curr=curr.right;
                }
            }
        }
        return arr;
    }
}