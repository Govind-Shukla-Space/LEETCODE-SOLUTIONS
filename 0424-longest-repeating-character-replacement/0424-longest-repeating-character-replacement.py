class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        a=0
        b=0
        d={}
        ma=0
        while b<len(s):
            if s[b] in d:
                d[s[b]]+=1
            else:
                d[s[b]]=1
            dm=max(d.values())
            c=b-a+1
            if c-dm>k:
                d[s[a]]-=1
                a+=1
            else:
                ma=max(ma,c)
            b+=1
        return ma