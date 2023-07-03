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
    TreeNode p;
    void bst(TreeNode root,int val){
        if(root==null)
        return;
        if(root.val==val)
        {
            p=root;
            return ;
        }
        bst(root.left,val);
        bst(root.right,val);
    }
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null)
        return null;
        bst(root,val);
        return p;
    }
}
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null)
        return root;
        if(root.val==val)
        return root;
        if(root.val>val)
        return searchBST(root.left,val);
        if(root.val<val)
        return searchBST(root.right,val);
        return null;
    }
}