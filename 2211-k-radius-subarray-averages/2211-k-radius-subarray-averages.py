class Solution:
    def getAverages(self, nums: List[int], k: int) -> List[int]:
        n=len(nums)
        arr=[]
        if k>=n:
            for i in range(n):
                arr.append(-1)
            return arr
        for i in range(k):
            arr.append(-1)
        a=0
        b=0
        K=(2*k)+1
        s=0
        while b<n:
            s+=nums[b]
            if b-a+1==K:
                arr.append(s//K)
                s-=nums[a]
                a+=1
            b+=1
        
        for i in range(k):
            if len(arr)!=len(nums):
                arr.append(-1) 
            else:
                break
        return arr;
    