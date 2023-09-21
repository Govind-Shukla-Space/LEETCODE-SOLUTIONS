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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> arr=new ArrayList<List<Integer>>();
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        if(root==null)
        return arr;
        q.add(root);
        while(!q.isEmpty()){
            
            int s=q.size();
            List<Integer> ar=new ArrayList<Integer>();
            for(int i=0;i<s;i++){
                TreeNode t=q.poll();
                ar.add(t.val);
                if(t.left!=null)
                q.add(t.left);
                if(t.right!=null)
                q.add(t.right);
            }
            arr.add(0,ar);
        }
        return arr;
    }
}