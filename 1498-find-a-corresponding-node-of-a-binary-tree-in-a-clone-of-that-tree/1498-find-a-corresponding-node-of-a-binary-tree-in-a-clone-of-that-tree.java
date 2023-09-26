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
    void search(final TreeNode or, final TreeNode cl, final TreeNode tar){
        if(or==null)
        return;
        if(or.val==tar.val){
            res=cl;
            return;
        }
        
        search(or.left,cl.left,tar);
        search(or.right,cl.right,tar);
    }
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        search(original,cloned,target);
        return res;
    }
}