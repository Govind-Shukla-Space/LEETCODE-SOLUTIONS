class Solution:
    def minimumCost(self, s: str) -> int:
        n=len(s)
        ans=0
        for i in range(n-1):
            if s[i]!=s[i+1]:
                if i+1<n-i-1:
                    ans+=i+1
                else:
                    ans+=n-i-1
        return ans