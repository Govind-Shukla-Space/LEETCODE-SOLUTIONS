class Solution:
    def integerBreak(self, n: int) -> int:
        x=1
        if n==2:
            x=1
        elif n==3:
            x=2
        elif n==4:
            x=4
        else:
            # print(((3**(n//3))))
            a1=3**(n//3)
            a2=3*((n//3)-1)
            a3=3**((n//3)-1)
            print(a1,a2)

            y1=(n%3)
            y2=n-a2
            print(y1,y2)
            if n%3==0:
                y1=1
            x=max(a1*y1,a3*y2)
        return x