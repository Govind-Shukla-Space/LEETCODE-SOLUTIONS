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
class Solution1{
    int s=0;
    void fun(TreeNode root){//reverse inorder
        if(root==null)
        return ;
        fun(root.right);
        root.val+=s;
        s=root.val;
        fun(root.left);
    }
    public TreeNode convertBST(TreeNode root) {
        if(root==null)
        return null;
        fun(root);
        return root;
    }
}
class Solution2 {
    public TreeNode convertBST(TreeNode root) {
        TreeNode node=root;
        Stack<TreeNode> stk=new Stack<TreeNode>();
        int s=0;
        while(!stk.isEmpty()|| node!=null ){
            // stk.push(node);
            while(node!=null)
            {
                stk.push(node);
                node =node.right;
                
            }
            
            node=stk.pop();
            s+=node.val;
            node.val=s;
            node=node.left;
        }
        return root;
    }
}
class Solution {
    TreeNode fun(TreeNode right,TreeNode curr){
        while(right.left!=null && right.left!=curr)
        right=right.left;
        return right;
    }
    public TreeNode convertBST(TreeNode root) {
        TreeNode node=root;
        int t=0;
        while(node!=null){
            if(node.right==null){
                t+=node.val;
                node.val=t;
                node=node.left;
            }
            else{
                TreeNode right=fun(node.right,node);
                if(right.left==null){
                    right.left=node;
                    node=node.right;
                }
                else{
                    right.left=null;
                    t+=node.val;
                    node.val=t;
                    node=node.left;
                }
            }
        }
        return root;
    }
}