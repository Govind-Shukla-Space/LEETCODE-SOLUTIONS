def fun(dic,s,d):
    if s in dic:
        dic[s].append(d)
    else:
        dic[s]=[d]
class Solution:
    def validPath(self, n: int, edges: List[List[int]], source: int, destination: int) -> bool:
        if n==1:
            return True
        d={}
        for i in edges:
            fun(d,i[0],i[1])
            fun(d,i[1],i[0])
        # edges.sort()
        print(d)
        q=[]
        s=set()
        s.add(source)
        q.append(source)
        while len(q)>0:
            t=q.pop(0)
            if destination in d[t]:
                return True
            for i in d[t]:
                if i not in s:
                    q.append(i)
                    s.add(i)
        return False