class Solution {
    int f1(int nums[],int l,int h,int tar){
        while(l<=h){
            int mid=(int)(l+h)/2;
            if(nums[mid]==tar)
            return mid;
            if(tar<nums[mid])
            h=mid-1;
            else
            l=mid+1;
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        return f1(nums,0,nums.length-1,target);
    }
}
