"""
# Definition for a Node.
class Node:
    def __init__(self, x: int, next: 'Node' = None, random: 'Node' = None):
        self.val = int(x)
        self.next = next
        self.random = random
"""

class Solution:
    def copyRandomList(self, head: 'Optional[Node]') -> 'Optional[Node]':
        d1={}
        d2={}
        c=0
        temp=head
        head2=None
        temp2=Node(-1)
        head2=temp2
        t=head2
        while temp!=None:
            temp2=Node(temp.val)
            d2[c]=temp2
            t.next=temp2
            t=temp2
            d1[temp]=c
            c+=1
            temp=temp.next
        head2=head2.next
        t1=head
        t2=head2
        while t1!=None:
            if t1.random!=None:
                t2.random=d2[d1[t1.random]]
            t1=t1.next
            t2=t2.next      
        return head2