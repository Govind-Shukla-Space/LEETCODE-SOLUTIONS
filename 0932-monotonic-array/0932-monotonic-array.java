class Solution {
    boolean inc(int nums[]){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1])
            return false;
        }
        return true;
    }
    boolean dec(int nums[]){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1])
            return false;
        }
        return true;
    }
    public boolean isMonotonic(int[] nums) {
        int f=0;
        if(nums.length==1)
        return true;
        if(nums[0]<nums[1]){
            return inc(nums);
        }
        else if(nums[0]>nums[1]){
            return dec(nums);
        }
        else{
            return inc(nums)||dec(nums);
        }
    }
}