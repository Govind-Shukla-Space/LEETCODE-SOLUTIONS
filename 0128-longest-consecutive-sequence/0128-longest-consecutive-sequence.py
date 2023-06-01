class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        nums_set=set(nums)
        nums=list(nums_set)
        max_len=0
        for i in range(len(nums)):
            if nums[i]-1 in nums_set:
                continue
            tmp=nums[i]
            curr_len=1
            while tmp+1 in nums_set:
                tmp+=1
                curr_len+=1
            max_len=max(max_len,curr_len)
        return max_len
        
            