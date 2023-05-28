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
    int findidx(int nums[],int l,int r){
        int idx=l;
        for(int i=l;i<=r;i++){
            if(nums[i]>nums[idx])
            idx=i;
        }
        return idx;
    }
    TreeNode fun(int nums[],int l,int r){
        if(l>r)
        return null;
        if(l==r)
        return new TreeNode(nums[l]);
        int idx=findidx(nums,l,r);
        TreeNode curr=new TreeNode(nums[idx]);
        curr.left=fun(nums,l,idx-1);
        curr.right=fun(nums,idx+1,r);
        return curr;
    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return fun(nums,0,nums.length-1);

    }
}