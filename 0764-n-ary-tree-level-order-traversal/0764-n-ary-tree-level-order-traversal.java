/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> arr=new ArrayList<List<Integer>>();
        if(root==null)
        return arr;
        Queue<Node> q=new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty()){
            int s=q.size();
            List<Integer> ar=new ArrayList<Integer>();
            for(int i=0;i<s;i++){
                Node t=q.poll();
                
                for(int j=0;j<t.children.size();j++){
                    if(t.children.get(j)!=null)
                        q.add(t.children.get(j));
                }
                ar.add(t.val);
            }
            arr.add(ar);
        }
        return arr;
    }
}