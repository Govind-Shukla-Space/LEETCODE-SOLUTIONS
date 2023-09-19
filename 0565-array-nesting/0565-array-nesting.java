class Solution {
    public int arrayNesting(int[] nums) {
        int c=0,ma=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==-1)
            continue;
            int k,k1=nums[i];
            c=1;
            while(k1!=i){
                k=nums[k1];
                nums[k1]=-1;
                k1=k;
                
                c++;
            }
            ma=Math.max(ma,c);
        }
        return ma;
    }
}