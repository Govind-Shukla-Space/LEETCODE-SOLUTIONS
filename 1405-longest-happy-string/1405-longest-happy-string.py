class Solution:
    def longestDiverseString(self, a: int, b: int, c: int) -> str:
        a1=0
        b1=0
        c1=0
        n=a+b+c
        s=""
        for i in range(n):
            if(a>=b and a>=c and a1!=2)or(b1==2 and a>0) or (c1==2 and a>0):
                s+='a'
                a-=1
                a1+=1
                b1=0
                c1=0
            elif (b>=a and b>=c and b1!=2)or(c1==2 and b>0) or (a1==2 and b>0):
                s+='b'
                b-=1
                b1+=1
                a1=0
                c1=0
            elif(c>=a and c>=b and c1!=2)or(a1==2 and c>0) or (b1==2 and c>0):
                s+='c'
                c-=1
                c1+=1
                a1=0
                b1=0
        return s