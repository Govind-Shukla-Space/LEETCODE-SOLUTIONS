class Solution {
    public int maxProfit(int[] prices) {
        int m=0,b=Integer.MAX_VALUE,s=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<b){
                b=prices[i];
                s=b;
            }
            if(prices[i]>s)
            s=prices[i];
            m=Math.max(m,s-b);
        }
        return m;
        // return 0;
    }
}