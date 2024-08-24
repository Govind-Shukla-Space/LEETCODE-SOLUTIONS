class Solution1 {
    int fun(int i,int stone[],boolean a,boolean b){
        if(i>=stone.length)
            return 0;
        int ans=(a)?Integer.MIN_VALUE:Integer.MAX_VALUE;
        int curr=0;
        for(int j=0;j<3&&(i+j<stone.length);j++){
            curr+=stone[i+j];
            if(a){
                ans=Math.max(ans,curr+fun(i+j+1,stone,false,true));           
            }
            else
                ans=Math.min(ans,fun(i+j+1,stone,true,false));           
        }
            return ans;
    }
    public String stoneGameIII(int[] stoneValue) {
        int ali=fun(0,stoneValue,true,false);
        int t=0;
        for(int i:stoneValue)
            t+=i;
        System.out.println(ali);
        return t-ali==ali?"Tie":(ali>t-ali)?"Alice":"Bob";
    }
}

class Solution {
    int fun(int i,int stone[],int a,int b,Integer dp[][][]){
        if(i>=stone.length)
            return 0;
        if(dp[i][a][b]!=null)
            return dp[i][a][b];
        int ans=(a==1)?Integer.MIN_VALUE:Integer.MAX_VALUE;
        int curr=0;
        for(int j=0;j<3&&(i+j<stone.length);j++){
            curr+=stone[i+j];
            if(a==1){
                ans=Math.max(ans,curr+fun(i+j+1,stone,0,1,dp));           
            }
            else
                ans=Math.min(ans,fun(i+j+1,stone,1,0,dp));           
        }
            return dp[i][a][b]=ans;
    }
    
    public String stoneGameIII(int[] stoneValue) {
        Integer dp[][][] = new Integer[stoneValue.length+1][2][2];
        int ali=fun(0,stoneValue,1,0,dp);
        int t=0;
        for(int i:stoneValue)
            t+=i;
        // System.out.println(ali);
        return t-ali==ali?"Tie":(ali>t-ali)?"Alice":"Bob";
    }
}