class Solution1 {
    int fun(int i,int n,int k,int t){
        if(i==n){
            if(t==0) return 1;
            return 0;
        }
        if(t<0)
            return 0;
        int s=0;
        for(int j=1;j<=k;j++)
            s=(s+fun(i+1,n,k,t-j))%(int)(1e9+7);
        return s;
    }
    public int numRollsToTarget(int n, int k, int target) {
        return fun(0,n,k,target);
    }
}
class Solution2 {
    int fun(int i,int n,int k,int t,HashMap<Pair<Integer,Integer>,Integer> map){
        if(i==n){
            if(t==0) return 1;
            return 0;
        }
        if(map.containsKey(new Pair<>(i,t)))
           return map.get(new Pair<>(i,t));
        if(t<0)
            return 0;
        int s=0;
        for(int j=1;j<=k;j++)
            s=(s+fun(i+1,n,k,t-j,map))%(int)(1e9+7);
        map.put(new Pair<>(i,t),s);
        return s;
    }
    public int numRollsToTarget(int n, int k, int target) {
        HashMap<Pair<Integer,Integer>,Integer> map=new HashMap<Pair<Integer,Integer>,Integer>();
        return fun(0,n,k,target,map);
    }
} //memo -> hashMap
class Solution3 {
    int fun(int i,int n,int k,int t,Integer dp[][]){
        if(i==n){
            if(t==0) return 1;
            return 0;
        }
        if(t<0)
            return 0;
        if(dp[i][t]!=null)
            return dp[i][t];
        int s=0;
        for(int j=1;j<=k;j++)
            s=(s+fun(i+1,n,k,t-j,dp))%(int)(1e9+7);
        return dp[i][t]=s;
    }
    public int numRollsToTarget(int n, int k, int target) {
        Integer dp[][]=new Integer[n+1][target+1];
        return fun(0,n,k,target,dp);
    }
} //memo -> array
class Solution {
 public int numRollsToTarget(int n, int k, int target) {
        int dp[][]=new int[n+1][target+1];
        dp[0][0]=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=target;j++){
                int ans=0;
                for(int f=1;f<=k;f++){
                    if(j-f>=0)
                        ans=(ans+dp[i-1][j-f])%(int)(1e9+7);
                }
                
                dp[i][j]=ans;
            }
        }
     
     return dp[n][target];
    }
}