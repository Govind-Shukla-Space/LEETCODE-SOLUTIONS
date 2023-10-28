class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        sum+=nums[i];
        if(sum%2!=0)return false;
         sum=sum/2;
        boolean arr[]=new boolean[sum+1];
        arr[0]=true;
        for(int i=0;i<nums.length;i++){
            for(int j=sum;j>0;j--){
                if(j>=nums[i])
                arr[j]=arr[j]||arr[j-nums[i]];
            }
        }
        return arr[sum];
    }
}