class Solution {
    int fun(int i,int arr[],int k,int dp[]){
        if (i>=arr.length)
        return 0;
        if (dp[i]!=0)
        return dp[i];
        int last=Math.min(arr.length,i+k);
        int curr=0,ans=0;
        for(int j=i;j<last;j++){   
            curr=Math.max(arr[j],curr);
            ans=Math.max(ans,curr*(j-i+1)+fun(j+1,arr,k,dp));
        }
        return dp[i]=ans;
    }
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int dp[]=new int[arr.length+1];
        return fun(0,arr,k,dp);
    }
}