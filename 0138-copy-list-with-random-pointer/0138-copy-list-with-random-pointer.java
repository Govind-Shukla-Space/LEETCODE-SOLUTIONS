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

class Solution1 {
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

class Solution {
    Node copy(Node head){
        Node t1=head;
        while (t1!=null){
            
            Node w=t1.next;
            Node q=new Node(t1.val);
            t1.next=q;
            q.next=w;
            t1=w;
        }
        return head;
    }
    void random(Node head){
        Node t1=head;
        while(t1!=null){
            if(t1.random!=null)
            t1.next.random=t1.random.next;
            t1=t1.next.next;
        }
    }
    Node finall(Node head){
        Node t1=head,t3=new Node(-1),t2=t3;
        // while(t2!=null && t2.next!=null){
        while(t1!=null){    
            // System.out.print(" "+t2.val+" ");
            Node f=t1.next.next;
            Node c=t1.next;
            t3.next=c;
            t3=c;
            t1.next=f;
            t1=f;
            // t2.next=t2.next.next;
            // t2=t2.next;
        }
        return t2.next;
    }
        void print(Node head){
        Node t=head;
        while(t!=null){
            System.out.println(t.val);
            t=t.next;
        }
    }

    public Node copyRandomList(Node head) {
        // Node t=head;
        Node t2=copy(head);
        // print(t);
        random(t2);
        print(t2);
        return finall(t2);
        // print(t.next);
        // return t.next;
    }
}