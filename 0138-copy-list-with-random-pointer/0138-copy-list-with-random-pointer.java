/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node dummy=new Node(-1);
        Node pre=dummy;
        Node ptr=head;
        HashMap<Node,Node> map=new HashMap<Node,Node>();
        while(ptr!=null){
            pre.next=new Node(ptr.val);
            map.put(ptr,pre.next);
            ptr=ptr.next;
            pre=pre.next;
        }
        Node t1=dummy.next;
        ptr=head;
        while(t1!=null){
            t1.random=map.get(ptr.random);
            ptr=ptr.next;
            t1=t1.next;
        }
        return dummy.next;
    }
}