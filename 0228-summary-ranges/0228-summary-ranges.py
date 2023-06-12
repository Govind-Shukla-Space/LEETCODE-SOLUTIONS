class Solution:
    def summaryRanges(self, nums: List[int]) -> List[str]:
        a=0
        b=0
        # if len(nums)==0:
        #     return []
        l=[]
        while a<len(nums):
            while b<len(nums)-1 and nums[b]==nums[b+1]-1:
                b+=1
            if a==b:
                l.append(str(nums[a]))
            else:
                l.append(str(nums[a])+"->"+str(nums[b]))
            b+=1
            a=b
        
        return l