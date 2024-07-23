class Solution:
    def frequencySort(self, nums: List[int]) -> List[int]:
        d={}
        for i in nums:
            if i in d:
                d[i]+=1
            else:
                d[i]=1
        d1 = sorted(d.items(), key=lambda x: (x[1], -x[0]))
        print(d1)
        l=[]
        for i,j in d1:
            l.extend([i]*j)
        return l