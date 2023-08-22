class Solution:
    def convertToTitle(self, columnNumber: int) -> str:
        s="ABCDEFGHIJKLMNOPQRSTUVWXY"
        a=columnNumber
        s1=""
        while a>0:
            
            d=a%26
            a=a//26
            if d==0:
                a-=1
                s1='Z'+s1
            else:
                s1=s[d-1]+s1
        return s1