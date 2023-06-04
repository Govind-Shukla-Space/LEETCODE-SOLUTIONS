class Solution {
    public int searchInsert(int[] nums, int target) {
        int a=0,b=nums.length-1,mid=0;
        if (nums[0]>target)
        return 0;
        if (target>nums[nums.length-1])
        return nums.length;
        while(a<=b){
            mid=a+(b-a)/2;
            if(nums[mid]==target)
            return mid;
            if(target<nums[mid])
            b=mid-1;
            else
            a=mid+1;
        }
        return a;
    }
}