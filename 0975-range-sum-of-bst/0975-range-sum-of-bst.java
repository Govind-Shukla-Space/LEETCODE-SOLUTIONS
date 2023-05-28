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
    public int rangeSumBST(TreeNode root, int low, int high) {
        Queue<TreeNode> q=new LinkedList<>();
        int s=0;
        q.add(root);
        while(!q.isEmpty()){
            TreeNode t=q.poll();
            if(t.val>=low && t.val<=high)
            s+=t.val;
            if(t.left!=null)
            q.add(t.left);
            if(t.right!=null)
            q.add(t.right);
        }
        return s;
    }
}