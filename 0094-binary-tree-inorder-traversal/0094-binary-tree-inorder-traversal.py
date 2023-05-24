# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

def getRightMost(leftnode,curr):
    while(leftnode.right!=None and leftnode.right!=curr):
           leftnode=leftnode.right
    return leftnode
class Solution:
    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        curr=root
        ans=[]
        while(curr!=None):
            leftnode=curr.left
            if(leftnode==None):
                ans.append(curr.val)
                curr=curr.right
            else:
                rightmost=getRightMost(leftnode,curr)
                if(rightmost.right==None):
                    rightmost.right=curr
                    curr=curr.left
                else:
                    rightmost.right=None
                    ans.append(curr.val)
                    curr=curr.right
        return ans