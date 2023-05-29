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
    ArrayList<Integer> ar1=new ArrayList<Integer>();
    ArrayList<Integer> ar2=new ArrayList<Integer>();
    ArrayList<Integer> ar3=new ArrayList<Integer>();
    void fun(TreeNode root,int f){
        if(root==null)
        return ;
        fun(root.left,f);
        if(f==0)
        ar1.add(root.val);
        else
        ar2.add(root.val);
        fun(root.right,f);
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        fun(root1,0);
        fun(root2,1);
        int i=0,j=0;
        // Collections.sort(ar);
        for(int p=0;p<ar2.size();p++)
        System.out.println(ar2.get(p));
        while(i<ar1.size()&&j<ar2.size()){
            if(ar1.get(i)<=ar2.get(j))
            ar3.add(ar1.get(i++));
            else if(ar1.get(i)>ar2.get(j))
            ar3.add(ar2.get(j++));
        }
        while(i<ar1.size())
        ar3.add(ar1.get(i++));
        while(j<ar2.size())
        ar3.add(ar2.get(j++));
        return ar3;
    }
}