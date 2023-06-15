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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(root);
        int r=0,c=1;
        int max=Integer.MIN_VALUE;
        while(!q.isEmpty()){
            int s1=q.size();
            int s=0;

            for(int i=0;i<s1;i++){
                TreeNode t=q.poll();
                s+=t.val;
                if(t.left!=null)
                q.add(t.left);
                if(t.right!=null)
                q.add(t.right);
            }
            if(s>max){
                max=s;
                r=c;
            }
            c+=1;
        }
        return r;
    }
}