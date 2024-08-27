class Solution {
    int fun(int i,int j,String s1,String s2,Integer dp[][]){
        if(i<0)
            return j+1;
        if(j<0)
            return i+1;
        if(dp[i][j]!=null)
            return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j))
            return dp[i][j]=fun(i-1,j-1,s1,s2,dp);
        int ins=fun(i,j-1,s1,s2,dp)+1;
        int del=fun(i-1,j,s1,s2,dp)+1;
        int rep=fun(i-1,j-1,s1,s2,dp)+1;
        return dp[i][j]=Math.min(ins,Math.min(del,rep));
    }
    public int minDistance(String word1, String word2) {
        Integer dp[][]=new Integer[word1.length()][word2.length()];
        return fun(word1.length()-1,word2.length()-1,word1,word2,dp);
    }
}