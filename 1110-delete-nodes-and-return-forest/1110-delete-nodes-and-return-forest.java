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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> ans=new ArrayList<TreeNode>();
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        HashSet<Integer> set=new HashSet<Integer>();
        for(int a:to_delete)
            set.add(a);
        // ans.add(root);
        q.add(root);
        while(!q.isEmpty()){
            TreeNode t=q.poll();
            if(t.left!=null){
                q.add(t.left);
                if(set.contains(t.left.val)){
                    t.left=null;
                }
            }
            if(t.right!=null){
                q.add(t.right);
                if(set.contains(t.right.val))
                    t.right=null;
            }
            if(set.contains(t.val)){
                if(t.left!=null)
                    ans.add(t.left);
                if(t.right!=null)
                    ans.add(t.right);
            }   
        }
        if(!set.contains(root.val))
            ans.add(root);
        return ans;
    }
}