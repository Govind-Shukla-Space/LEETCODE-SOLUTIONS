class Solution {
    public int minMoves(int[] nums, int k) {
        int one=0;
        for(int i=0;i<nums.length;i++)
        if(nums[i]==1)
        one+=1;
        System.out.println();
        int k1=0;
        int pos[]=new int[one];
        for(int i=0;i<nums.length;i++)
        if(nums[i]==1)
        pos[k1++]=i;
        int possum[]=new int[one];
        possum[0]=pos[0];
        for(int i=1;i<pos.length;i++)
        possum[i]=pos[i]+possum[i-1];
        int a=0,b=k-1,lex=0;
        int max=Integer.MAX_VALUE;
        while(b<pos.length){
            int res=0;
            int mid=(int)((a+b)/2);
            int rd=mid-a;
            int rsum=(possum[b]-possum[mid]);
            int lsum=(mid==0?0:possum[mid-1])-(a==0?0:possum[a-1]);
            if(k%2==0)
            lsum+=pos[mid];
            int range=rd*(rd+1);
            if(k%2==0)
            range+=(rd+1);
            res=rsum-lsum-range;
            // System.out.println(rsum+" "+lsum+" "+" "+range+" "+res);
            max=Math.min(max,res);
            a+=1;
            b+=1;
        }
        // System.out.println(max);
        return (int)max;
    }
}