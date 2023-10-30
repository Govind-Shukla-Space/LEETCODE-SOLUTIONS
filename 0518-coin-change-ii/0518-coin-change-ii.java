class Solution1{    
    ArrayList<ArrayList<Integer>> arr=new ArrayList<ArrayList<Integer>>();
    void generate(int i,int amount,int coins[],ArrayList<Integer> sub){
        if (i>=coins.length){
            arr.add(new ArrayList<Integer>(sub));
            return ;
        }
        if(amount<0)
        return;
        else{
            generate(i+1,amount,coins,sub);
            sub.add(coins[i]);
            generate(i,amount-coins[i],coins,sub);
            sub.remove(sub.size()-1);
        }
    }
    boolean valid(ArrayList<Integer> sub,int amount){
        int s=0;
        for(int i=0;i<sub.size();i++)
            s+=sub.get(i);
        return s==amount;
    }
    public int change(int amount, int[] coins) {
        int count=0;
        generate(0,amount,coins,new ArrayList<>());
        // System.out.println(arr);
        for(int i=0;i<arr.size();i++){
            if(valid(arr.get(i),amount)){
                count+=1;
            }
        }
        return count;
    }
}

class Solution2{
    int count=0,amt;
    void generate(int i,int amount,int coins[],ArrayList<Integer> sub){
        if (i>=coins.length){
            System.out.println(sub);
            int s=0;
            for(int j=0;j<sub.size();j++)
                s+=sub.get(j);    
            if(s==amt)
            count+=1;
            return ;
        }
        if(amount<0)
        return;
        else{
            generate(i+1,amount,coins,sub);
            sub.add(coins[i]);
            generate(i,amount-coins[i],coins,sub);
            sub.remove(sub.size()-1);
        }
    }
    public int change(int amount, int[] coins) {
        amt=amount;
        generate(0,amount,coins,new ArrayList<>());
        return count;
    }
}

class Solution3{
    int generate(int i,int amount,int coins[]){
        if (i==coins.length){
            return 0;
        }
        if(amount<0)
            return 0;
        if(amount==0)
            return 1;
        else{
            int ans=generate(i+1,amount,coins);
            ans+=generate(i,amount-coins[i],coins);
            return ans;
        }
    }
    public int change(int amount, int[] coins) {
        return generate(0,amount,coins);
        // return count;
    }
}

class Solution{
    int generate(int i,int amount,int coins[],int tlb[][]){
        if(tlb[i][amount]!=Integer.MIN_VALUE)
        return tlb[i][amount];
        if (i==coins.length){
            return 0;
        }
        if(amount<0){
            return tlb[i][amount]=0;
        }
        if(amount==0){
            return tlb[i][amount]=1;
        }
        else{
            int ans=generate(i+1,amount,coins,tlb);
            if(amount>=coins[i])
            ans+=generate(i,amount-coins[i],coins,tlb);
            return tlb[i][amount]=ans;
        }
    }
    public int change(int amount, int[] coins) {
        int tlb[][] =new int[coins.length+1][amount+1];
        for(int i=0;i<tlb.length;i++)
            for(int j=0;j<tlb[0].length;j++)
                tlb[i][j]=Integer.MIN_VALUE;
        return generate(0,amount,coins,tlb);
        // return count;
    }
}