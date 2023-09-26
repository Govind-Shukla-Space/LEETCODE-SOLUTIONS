/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode res=null;
    TreeNode search(final TreeNode or, final TreeNode cl, final TreeNode tar){
        if(or==null||cl==null)
        return null;
        if(or.val==tar.val){
            return cl;
        }
        TreeNode left=search(or.left,cl.left,tar);
        if(left!=null)
        return left;
        return search(or.right,cl.right,tar);
    }
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        return search(original,cloned,target);
    }
}