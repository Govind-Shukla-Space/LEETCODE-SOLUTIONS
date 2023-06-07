def add(s,l):
    s1=""
    for i in range(l):
        s1+='0'
    return s1+s
class Solution:
    def minFlips(self, a: int, b: int, c: int) -> int:
        s1=bin(a).replace("0b", "")
        s2=bin(b).replace("0b", "")
        s3=bin(c).replace("0b", "")
        l=max(len(s1),len(s2),len(s3))
        c1=0
        s1=add(s1,l-len(s1))
        s2=add(s2,l-len(s2))
        s3=add(s3,l-len(s3))
        lo=[]
        lz=[]
        for i in range(len(s3)):
            if s3[i]=='1':
                lo.append(i)
            if s3[i]=='0':
                lz.append(i)
        for i in lo:
            if s1[i]=='0' and s2[i]=='0':
                c1+=1
        for j in lz:
            if s1[j]=='1' and s2[j]=='1':
                c1+=2
            elif s1[j]=='1' or s2[j]=='1':
                c1+=1
        return c1
