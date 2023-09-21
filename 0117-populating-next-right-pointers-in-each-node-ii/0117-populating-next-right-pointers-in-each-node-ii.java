/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Queue<Node> q=new LinkedList<Node>();
        if(root==null)
        return null;
        q.add(root);
        while(!q.isEmpty()){
            int s=q.size();
            for(int i=0;i<s;i++){
                Node t=q.poll();
                // while(s!=0){
                    if(s==1){
                        t.next=null;
                    }
                    else{
                        t.next=q.peek();
                    }
                // }
                if(t.left!=null)
                q.add(t.left);
                if(t.right!=null)
                q.add(t.right);
                if(i==s-1)
                t.next=null;
            }
            
        }
        return root;
    }
}