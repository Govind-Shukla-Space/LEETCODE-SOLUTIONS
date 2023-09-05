# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        curr=head
        t=curr
        pre=None
        nex=None
        while curr!=None:
            nex=curr.next
            curr.next=pre
            pre=curr
            curr=nex
        return pre
