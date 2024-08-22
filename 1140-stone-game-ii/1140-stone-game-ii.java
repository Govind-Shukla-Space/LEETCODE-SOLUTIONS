class Solution {
    int fun(int i,int piles[],int m,int dp[][]){
        if(i>piles.length)
            return 0;
        if(dp[i][m]!=0)
            return dp[i][m];
        int curr=0;
        if(i+2*m>=piles.length){
            for(int j=i;j<piles.length;j++){
                curr+=piles[j];
            }
            return dp[i][m]=curr;
        }
        int ans=Integer.MIN_VALUE;
        
        for(int j=1;j<=2*m;j++){
            curr+=piles[i+j-1];
            ans=Math.max(ans,curr-fun(i+j,piles,Math.max(j,m),dp));
        }
            return dp[i][m]=ans;
    }
    public int stoneGameII(int[] piles) {
        int dp[][]=new int[piles.length+1][piles.length+1];
        int res=fun(0,piles,1,dp);
        int t=0;
        for (int i:piles)
            t+=i;
        return (t+res)/2;
    }
}