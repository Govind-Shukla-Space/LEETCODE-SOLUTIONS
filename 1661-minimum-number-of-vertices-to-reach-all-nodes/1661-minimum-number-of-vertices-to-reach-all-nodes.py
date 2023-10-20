class Solution:
    def findSmallestSetOfVertices(self, n: int, edges: List[List[int]]) -> List[int]:
        l=set()
        for i in edges:
            l.add(i[1])
        l1=[]
        for i in range(n):
            if i not in l:
                l1.append(i)
        return l1