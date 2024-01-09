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
    ArrayList<Integer> arr=new ArrayList<Integer>();
    ArrayList<Integer> arr1=new ArrayList<Integer>();
    void fun(TreeNode root){
        if(root.left==null && root.right==null){
            arr.add(root.val);
            return;
        }
        if(root.left!=null)
        fun(root.left);
        if(root.right!=null)
        fun(root.right);
    }
    void fun1(TreeNode root1){
        if(root1.left==null && root1.right==null){
            arr1.add(root1.val);
            return;
        }
        if(root1.left!=null)
        fun1(root1.left);
        if(root1.right!=null)
        fun1(root1.right);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        fun(root1);
        fun1(root2);
        if(arr1.size()!=arr.size())
        return false;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)!=arr1.get(i))
            return false;
        }
        return true;
        
    }
}