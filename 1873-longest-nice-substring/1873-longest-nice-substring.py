class Solution:
    def longestNiceSubstring(self, s: str) -> str:
        q=""
        l=[]
        ma=0
        for i in range(len(s)):
            for j in range(i,len(s)):
                l.append(s[i:j+1])
        for k in l:
            c=0
            if k!="":
                for i in k:
                    if i in k and i.swapcase() in k:
                        c+=1
                if c==len(k):
                    if c>ma:
                        ma=c
                        q=k
                        # print(k)
        return q