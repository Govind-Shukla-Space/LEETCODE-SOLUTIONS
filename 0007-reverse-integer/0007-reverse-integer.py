class Solution:
    def reverse(self, x: int) -> int:
        s=str(x)
        q=""
        if s[0]=='-':
            q=s[0]
            s=s[1:]
        s1=q+s[::-1]
        s1=int(s1)
        if (-2**31)<=s1 and s1<=(2**31-1):
            return s1
        return 0