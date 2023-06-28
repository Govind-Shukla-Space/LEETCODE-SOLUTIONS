def fun(arr):
    l=[]
    l.append(1)
    a=0
    b=0
    k=2
    s=0
    while b<len(arr):
        s+=arr[b]
        if b-a+1==k:
            l.append(s)
            s-=arr[a]
            a+=1
        b+=1
    l.append(1)
    return l
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        l=[]
        l.append([1])
        if numRows==1:
            return l
        l.append([1,1])
        if numRows==2:
            return l
        for i in range(2,numRows):
            l.append(fun(l[i-1]))
        return l