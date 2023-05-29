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
    ArrayList<Integer> ar=new ArrayList<Integer>();
    void fun(TreeNode root){
        if(root==null)
        return ;
        fun(root.left);
        ar.add(root.val);
        fun(root.right);
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        fun(root1);
        fun(root2);
        Collections.sort(ar);
        return ar;
    }
}
