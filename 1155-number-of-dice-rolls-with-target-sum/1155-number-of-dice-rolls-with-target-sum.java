class Solution {
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
}