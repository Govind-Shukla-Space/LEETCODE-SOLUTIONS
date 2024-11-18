class Solution:
    def decrypt(self, code: List[int], k: int) -> List[int]:
        l=[0]*len(code)
        if k==0:
            return l
        q=0
        while(q<len(code)):
            s=0
            if k>0:
                for i1 in range(k):
                    s+=code[(q+i1+1)%len(code)]
            else:
                for i1 in range(k*-1):
                    s+=code[(q-i1-1)%len(code)]
            l[q]=s
            q+=1
        return l