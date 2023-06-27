class Solution1 {//tle
    int f1(int i,int a,int[] coins){
        if(i==coins.length){
            if(a==0)
            return 1;
            else
            return 0;
        }
        else if (a<0)
        return 0;
        else{
            int ans=f1(i+1,a,coins);
            ans+=f1(i,a-coins[i],coins);
            return ans;
        }
    }
    public int change(int amount, int[] coins) {
        return f1(0,amount,coins);

    }
}
class Solution {
    int f1(int i,int a,int[] coins,int tab[][]){
        if(tab[i][a]!=Integer.MIN_VALUE)
        return tab[i][a];
        if(i==coins.length){
            if(a==0){
            return tab[i][a]=1;
            }
            else{
                return tab[i][a]=0;
            }
        }
        else{
            int ans=f1(i+1,a,coins,tab);
            if(a>=coins[i])
            ans+=f1(i,a-coins[i],coins,tab);
            return tab[i][a]=ans;
        }
    }
    public int change(int amount, int[] coins) {
        int tab[][]=new int[coins.length+1][amount+1];
        for(int i=0;i<tab.length;i++)
        for(int j=0;j<tab[0].length;j++)
        tab[i][j]=Integer.MIN_VALUE;
        return f1(0,amount,coins,tab);

    }
}