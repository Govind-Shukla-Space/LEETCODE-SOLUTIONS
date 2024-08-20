class Solution {
    int fun(int i,int j,int piles[],int a,int b,int k){
        if(i>j)
            return 0;
        if(k%2==0){
            if(piles[i]>=piles[j])
                return fun(i+1,j,piles,a+piles[i],b,k+1);
            else
                return fun(i,j-1,piles,a+piles[j],b,k+1);
        }
        else{
                if(piles[i]>=piles[j])
                    return fun(i+1,j,piles,a,b+piles[i],k+1);
                else
                    return fun(i,j-1,piles,a,b+piles[j],k+1);
        }
    }
    public boolean stoneGame(int[] piles) {
        int a=0,b=0;
        fun(0,piles.length-1,piles,a,b,0);
        return a>=b;
    }
}