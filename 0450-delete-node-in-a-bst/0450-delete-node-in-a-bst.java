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
class Solution1 {
    // O(height)
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)
        return root;
        else if(key<root.val){
        root.left=deleteNode(root.left,key);
        return root;
        }
        else if(key>root.val){
        root.right=deleteNode(root.right,key);
        return root;
        }
        else if(root.left==null){
            return root.right;
        }
        else if(root.right==null){
        return root.left;
        }
        else{
            TreeNode q=root.left;
            while(q.right!=null)
            q=q.right;
            root.val=q.val;
            root.left=deleteNode(root.left,q.val);
            return root;
        }
    }
}
class Solution{
    TreeNode f1(TreeNode root,int key){
        if(root==null)
        return root;
        else if(key<root.val){
        root.left=f1(root.left,key);
        return root;}
        else if (key>root.val){
        root.right=f1(root.right,key);
        return root;}
        else if(root.left==null)
        return root.right;
        else if(root.right==null)
        return root.left;
        else{
            TreeNode t=root.right;
            while(t.left!=null)
            t=t.left;
            root.val=t.val;
            root.right=f1(root.right,t.val);
            return root;
        }
        // return root;
    }
    public TreeNode deleteNode(TreeNode root,int key){
        if(root==null)
        return root;
        return f1(root,key);

    }
}