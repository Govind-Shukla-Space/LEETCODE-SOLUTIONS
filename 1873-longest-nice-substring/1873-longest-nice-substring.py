def fun(s,n,sub,q,ma):
    if n==0:
        s1=set(sub)
        c=0
        for i in sub:
            if i in sub and i.swapcase() in sub:
                c+=1
        if c==len(sub):
            if len(sub)>ma:
                ma=len(sub)
                q=sub
                print(sub)
    else:
        fun(s,n-1,sub,q,ma)
        sub.append(s[n-1])
        fun(s,n-1,sub,q,ma)
        sub.pop(len(sub)-1)
class Solution:
    def longestNiceSubstring(self, s: str) -> str:
        q=""
        # fun(s,len(s),[],q,0)
        l=[]
        ma=0
        for i in range(len(s)):
            for j in range(i,len(s)):
                l.append(s[i:j+1])
        # print(l)
        for k in l:
            c=0
            if k!="":
                # print(k)
                for i in k:
                    if i in k and i.swapcase() in k:
                        c+=1
                if c==len(k):
                    if c>ma:
                        ma=c
                        q=k
                        # print(k)
        return q