class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int sum=0;
        for(int a:rolls)
            sum+=a;
        int ts=((rolls.length+n)*mean -sum);
        int rem=ts%n;
        int d=ts/n;
        // System.out.println(ts+" "+rem+" "+d);
        if(6*n<ts||ts<n)
            return new int[0];
        int ans[]=new int[n];
        for(int i=0;i<n;i++)
            ans[i]=d;
        for(int i=1;i<=rem;i++)
            ans[i]+=1;
        return ans;
    }
}