class Solution {
    public int maxFrequency(int[] nums, int k) {
        int a=0,b=0,s=0;
        Arrays.sort(nums);
        while(b<nums.length){
            s+=nums[b];
            if((b-a+1)*nums[b]-s>k)
            s-=nums[a++];
            b+=1;
        }
        return b-a;
    }
}