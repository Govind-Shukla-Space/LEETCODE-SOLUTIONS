class Solution {
    public void moveZeroes(int[] nums) {
        int z=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
            z+=1;
        }
        System.out.println(z);
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)
            nums[k++]=nums[i];
        }
        while(z!=0){
            nums[k++]=0;
            z-=1;
        }
        
    }
}