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
    
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer,TreeNode> map=new HashMap<>();
        HashSet<Integer> child =new HashSet<Integer>();
        for(int i=0;i<descriptions.length;i++){
            int r=descriptions[i][0];
            int c=descriptions[i][1];
            int p=descriptions[i][2];
            TreeNode pn=map.getOrDefault(r,new TreeNode(r));
            TreeNode cn=map.getOrDefault(c,new TreeNode(c));
            if(p==1)
                pn.left=cn;
            else
                pn.right=cn;
            map.put(r,pn);
            map.put(c,cn);
            child.add(c);
        }
            TreeNode root=null;
            for(int n:map.keySet()){
                if(!child.contains(n)){
                    root=map.get(n);
                    break;
                }
            }
        return root;
    }
}