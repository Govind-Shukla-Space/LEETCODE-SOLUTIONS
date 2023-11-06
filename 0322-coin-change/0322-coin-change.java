class Solution1 {//tle
    int mincoins=0;
    void search(int i,int coins[],int sum,int count,int amount){
        if(i==coins.length){
            if(sum==amount)
            mincoins=Math.min(mincoins,count);
        }
        else{
            search(i+1,coins,sum,count,amount);
            sum+=coins[i];
            count++;
            if(sum<=amount){
                search(i,coins,sum,count,amount);
            }
            else{}
        }
    }
    public int coinChange(int[] coins, int amount) {
        mincoins=Integer.MAX_VALUE;
        int count=0,comb=0;
        search(0,coins,comb,count,amount);
        if(mincoins==Integer.MAX_VALUE)
        return -1;
        return mincoins;
    }
}
class Solution2 {
    // int mincoins=0;
    int f1(int i,int a,int coins[]){
        if(i==coins.length){
            if(a==0)
            return 0;
            else
            return Integer.MAX_VALUE;
        }
        else{
            int ans=f1(i+1,a,coins);
            if(a>=coins[i]){
                int with=f1(i,a-coins[i],coins);
                if(with!=Integer.MAX_VALUE)
                ans=Math.min(ans,with+1);
            }
            return ans;
        }
    }
    public int coinChange(int[] coins, int amount) {
        int ans=f1(0,amount,coins);
        if(ans==Integer.MAX_VALUE)
        return -1;
        return ans;
    }
}
class Solution {
    
    // int mincoins=0;
    HashMap<Pair,Integer> map;
    int f1(int i,int a,int coins[]){
        if(map.containsKey(new Pair(i,a)))
        return map.get(new Pair(i,a));
        if(i==coins.length){
            if(a==0){
                map.put(new Pair(i,a),0);
                return 0;
            }
            else{
                map.put(new Pair(i,a),Integer.MAX_VALUE);
                return Integer.MAX_VALUE;
            }
        }
        else{
            int ans=f1(i+1,a,coins);
            if(a>=coins[i]){
                int with=f1(i,a-coins[i],coins);
                if(with!=Integer.MAX_VALUE)
                ans=Math.min(ans,with+1);
            }
            map.put(new Pair(i,a),ans);
            return ans;
        }
    }
    public int coinChange(int[] coins, int amount) {
        map=new HashMap<Pair,Integer>();
        int count=0,comb=0;
        int ans=f1(0,amount,coins);
        if(ans==Integer.MAX_VALUE)
        return -1;
        return ans;
    }
}