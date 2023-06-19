class Solution1 {
    //TLE
    boolean jump(int pos,int nums[]){
        if(pos==nums.length-1)
        return true;
        int n=nums.length;
        int far=Math.min(n-1,pos+nums[pos]);
        for(int next=pos+1;next<=far;next++){
            if(jump(next,nums)==true)
            return true;
        }
        return false;
    }
    public boolean canJump(int[] nums) {
        return jump(0,nums);
    }
}
class Solution2 {
    //dp
    boolean jump(int pos,int nums[],int dp[]){
        if(pos==nums.length-1){
            return true;
        }
        dp[pos]=1;
        // return true;
        int n=nums.length;
        int far=Math.min(n-1,pos+nums[pos]);
        for(int next=pos+1;next<=far;next++){
            if(dp[next]==1){
                continue;
            }
            if(jump(next,nums,dp))
            return true;

        }
        return false;
    }
    public boolean canJump(int[] nums) {
        int dp[]=new int[nums.length];
        for(int i=0;i<dp.length;i++)
        dp[i]=-1;
        return jump(0,nums,dp);
    }
}
class Solution {
    //pure dp
    boolean jump(int nums[],boolean dp[]){
        // return true;
        int n=nums.length;
        dp[n-1]=true;
        
        for(int i=n-2;i>=0;i--){
            int far=Math.min(n-1,i+nums[i]);
            for(int j=i+1;j<=far;j++){
                if (dp[j]==true)
                {
                    dp[i]=true;
                    break;
                }
            }
            if(dp[i]!=true)
            dp[i]=false;
        }
        return dp[0];
    }
    public boolean canJump(int[] nums) {
        if(nums.length==1)
        return true;
        boolean dp[]=new boolean[nums.length];
        for(int i=0;i<dp.length;i++)
        dp[i]=false;
        return jump(nums,dp);
    }
}