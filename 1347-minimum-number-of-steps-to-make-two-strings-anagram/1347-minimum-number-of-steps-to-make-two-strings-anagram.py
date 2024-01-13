class Solution1:
    def minSteps(self, s: str, t: str) -> int:
        l=[0]*len(s)
        c=0
        for i in range(len(t)):
            f=0
            for j in range(len(s)):
                if l[j]==0 and s[j]==t[i]:
                    l[j]=1
                    f=1
                    break
            if f==0:
                c+=1
        return c
class Solution:
    def minSteps(self, s: str, t: str) -> int:
        d={}
        for i in s:
            if i in d:
                d[i]+=1
            else:
                d[i]=1
        d1={}
        for i in t:
            if i in d1:
                d1[i]+=1
            else:
                d1[i]=1
        c=0
        for i in d1:
            if i not in d:
                c+=d1[i]
            else:
                while( d[i]>0 and d1[i]>0):
                    d1[i]-=1
                    d[i]-=1
        c=0
        for i in d1:
            if d1[i]!=0:
                c+=d1[i]
        return c