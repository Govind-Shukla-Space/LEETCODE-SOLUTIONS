class Solution {
    int fun(int i,int j,String s1,String s2,int dp[][]){
        if(i<0)
            return j+1;
        if(j<0)
            return i+1;
        if(dp[i][j]!=-1)
            return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j))
            return dp[i][j]=fun(i-1,j-1,s1,s2,dp);
        int ins=fun(i,j-1,s1,s2,dp)+1;
        int del=fun(i-1,j,s1,s2,dp)+1;
        int rep=fun(i-1,j-1,s1,s2,dp)+1;
        return dp[i][j]=Math.min(ins,Math.min(del,rep));
    }
    public int minDistance(String word1, String word2) {
        int dp[][]=new int[word1.length()+1][word2.length()+1];
        
        // for(int i=0;i<dp.length;i++){
        //     for(int j=0;j<dp.length;j++)
        //         dp[i][j]=-1;
        // }
        // return fun(word1.length()-1,word2.length()-1,word1,word2,dp);
        for(int j=1;j<dp[0].length;j++)
            dp[0][j]=j;
        for(int i=1;i<dp.length;i++)
            dp[i][0]=i;
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1];
                else{
                    dp[i][j]=Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]))+1;
                }
            }
        }
        return dp[word1.length()][word2.length()];
    }
}