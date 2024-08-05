class Solution1 {
    int fun(int i,String s,boolean f){
        if(i>=s.length())
            return 0;
        int wi=Integer.MAX_VALUE,wo=Integer.MAX_VALUE;
        if(s.charAt(i)=='b'){
            wi=fun(i+1,s,true);
            wo=1+fun(i+1,s,f);
            return Math.min(wi,wo);
        }
        else {
            if(f==true)
                return 1+fun(i+1,s,f);
            else
                return fun(i+1,s,f);
        }
    }
    public int minimumDeletions(String s) {
        return fun(0,s,false);
    }
}

class Solution {
    int fun(int i,String s,int f,Integer [][]dp){
        if(i>=s.length())
            return dp[i][f]=0;
        if(dp[i][f]!=null)
            return dp[i][f];
        int wi=Integer.MAX_VALUE,wo=Integer.MAX_VALUE;
        if(s.charAt(i)=='b'){
            wi=fun(i+1,s,1,dp);
            wo=1+fun(i+1,s,f,dp);
            return dp[i][f]=Math.min(wi,wo);
        }
        else {
            if(f==1)
                return dp[i][f]=1+fun(i+1,s,f,dp);
            else
                return dp[i][f]=fun(i+1,s,f,dp);
        }
    }
    public int minimumDeletions(String s) {
        Integer dp[][]=new Integer[s.length()+1][2];
        return fun(0,s,0,dp);
    }
}