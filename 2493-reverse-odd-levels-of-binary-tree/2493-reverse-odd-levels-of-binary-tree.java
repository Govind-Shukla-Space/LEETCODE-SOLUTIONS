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
    public TreeNode reverseOddLevels(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(root);
        int f=0;
        while(!q.isEmpty()){
            int size=q.size();
            ArrayList<TreeNode> arr=new ArrayList<TreeNode>();
            for(int i=0;i<size;i++){
                TreeNode t=q.poll();
                arr.add(t);
                if(t.left!=null)
                q.add(t.left);
                if(t.right!=null)
                q.add(t.right);
            }
            if(f%2!=0){
                int a=0,b=size-1;
                while(a<=b){
                    int r=arr.get(a).val;
                    arr.get(a).val=arr.get(b).val;
                    arr.get(b).val=r;
                    a+=1;
                    b-=1;
                }
            }
            f+=1;
        }
        return root;
    }
}