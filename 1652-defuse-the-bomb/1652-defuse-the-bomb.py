class Solution:
    def decrypt(self, code: List[int], k: int) -> List[int]:
        l=[0]*len(code)
        if k==0:
            return l
        s=0
        n=len(code)
        if k>0:
            for i in range(1,k+1):
                s+=code[i]
            i=0
            l[i]=s
            j=k
            i+=1
            while i<n:
                s=s-code[i]+code[(j+1)%n]
                l[i]=s
                i+=1
                j+=1
        else:
            k = -k 
            for i in range(k):
                s += code[(n - k + i) % n]
            i = 0
            l[i] = s
            j = n - k
            i += 1
            
            while i < n:
                s = s + code[(i - 1) % n] - code[(j) % n]
                l[i] = s
                i += 1
                j += 1
        return l