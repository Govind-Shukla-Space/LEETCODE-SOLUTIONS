class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        d={}
        for i in nums:
            if i in d:
                d[i]+=1
            else:
                d[i]=1
        c1=0
        c2=0
        num=list(set(nums))
        num.sort()
        l=[]
        for i in num:
            if d[i]>=2:
                l.append(i)
                l.append(i)
            if d[i]==1:
                l.append(i)
        for i in range(len(l)):
            nums[i]=l[i]
        return len(l)