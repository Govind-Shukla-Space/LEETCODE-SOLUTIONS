class Solution1 {//tle
    int fun(int i,int nums[],boolean flag){
        if (i>=nums.length){
            return 0;
        }
        int without=fun(i+1,nums,flag);
        int with=0;
        with=fun(i+1,nums,!flag)+(flag==true?nums[i]:(-1)*nums[i]);
        return Math.max(with,without);
    }
    public long maxAlternatingSum(int[] nums) {
        return fun(0,nums,true);
    }
}

class Solution {
    long fun(int i,int nums[],int flag,Long dp[][]){
        if (i>=nums.length){
            return 0;
        }
        if(dp[i][flag]!=null)
            return dp[i][flag];
        long without=fun(i+1,nums,flag,dp);
        long with=0;
        with=fun(i+1,nums,1-flag,dp)+(flag!=0?nums[i]:(-1)*nums[i]);
        return dp[i][flag]=Math.max(with,without);
    }
    public long maxAlternatingSum(int[] nums) {
        Long dp[][]=new Long[nums.length+1][2];
        return fun(0,nums,1,dp);
    }
}