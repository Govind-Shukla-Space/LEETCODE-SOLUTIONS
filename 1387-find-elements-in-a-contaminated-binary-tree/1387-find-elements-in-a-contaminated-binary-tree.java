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
class FindElements {
    TreeNode root;
    HashMap<Integer,Integer> map;
    void fun(TreeNode root){
        map=new HashMap<Integer,Integer>();
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        root.val=0;
        q.add(root);
        
        while(!q.isEmpty()){
            int s=q.size();
            for(int i=0;i<s;i++){
                TreeNode t=q.poll();
                if(!map.containsKey(t.val))
                map.put(t.val,1);
                else
                map.put(t.val,map.get(t.val)+1);
                if(t.left!=null){
                    t.left.val=(2*t.val)+1;
                    q.add(t.left);
                }
                if(t.right!=null){
                    t.right.val=(2*t.val)+2;
                    q.add(t.right);
                }
            }
        }
    }
    public FindElements(TreeNode root) {
        this.root=root;
        fun(this.root);
        
    }
    

    public boolean find(int target) {
        if(map.containsKey(target))
        return true;
        return false;
    }
    }


/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */