class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int a=0,b=0,t;
        while(b<nums.length){
            if(nums[b]%2==0){
                t=nums[b];
                nums[b]=nums[a];
                nums[a]=t;
                a+=1;
            }
            b+=1;
        }
        return nums;
    }
}