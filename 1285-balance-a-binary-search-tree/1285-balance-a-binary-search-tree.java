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
    ArrayList <Integer> arr=new ArrayList<Integer>();
    
    TreeNode fun(int ar[],int l,int r){
        if (l>r)
        return null;
        if(l==r)
        return new TreeNode(ar[l]);
        int i=(int)(l+r)/2;
        TreeNode cur=new TreeNode(ar[i]);
        cur.left=fun(ar,l,i-1);
        cur.right=fun(ar,i+1,r);
        return cur;
    }
    void create(TreeNode root){
        if(root==null)
        return;
        create(root.left);
        arr.add(root.val);
        create(root.right);
    } 
    public TreeNode balanceBST(TreeNode root) {
        create(root);
        int asd[]=new int[arr.size()];
    
        for(int i=0;i<arr.size();i++)
        asd[i]=arr.get(i);
        return fun(asd,0,arr.size()-1);
    }
}