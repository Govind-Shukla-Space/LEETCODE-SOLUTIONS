class Solution1 {
    public int maxSubArray(int[] nums) {
        int c1=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            c1+=1;
        }
        if(c1==nums.length)
        {
            int z=nums[0];
            for(int i=0;i<c1;i++)
            {
                if(nums[i]>z)
                z=nums[i];
            }
            return z;
        }
        int c=0,max=0;
        for(int i=0;i<nums.length;i++){
            c=c+nums[i];
            if(c>max){
                max=c;
            }
            if (c<0)
            c=0;
        }
        return max;
        
        // return -1;
    }
}
class Solution {
    int k=0,tm=0,pm=Integer.MIN_VALUE;
    int max(int i,int nums[]){
        if(i<nums.length-1)
        k=max(i+1,nums);
        if(tm+nums[i]<0)
        {
            tm=0;
            pm=Math.max(pm,nums[i]);
        }
        else{
            tm+=nums[i];
            pm=Math.max(pm,tm);
        }
        return tm;
    }
    public int maxSubArray(int[] nums) {
        int c=max(0,nums);
        return pm;
    }
}