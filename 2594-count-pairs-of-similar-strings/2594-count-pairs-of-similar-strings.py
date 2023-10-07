def fun(s,t):
    
    s2=list(set(t))
    print(s1,s2)
    
    
    if s1!=s2:
        return False
    return True
class Solution:
    def similarPairs(self, words: List[str]) -> int:
        c=0
        d=[]
        for i in words:
            i=list(set(i))
            i.sort()
            i="".join(i)
            
            # print(i)
            d.append(i)
        for i in range(len(d)-1):
            for j in range(i+1,len(d)):
                if d[i]==d[j]:
                    c+=1

        print(d)
        return c