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
        for(int i=1;i<possum.length;i++){
        possum[i]=pos[i]+possum[i-1];
        }
        int a=0,b=k-1;
        int min=Integer.MAX_VALUE;
        while(b<pos.length){
            int res=0,lsum,rsum;
            int mid=(int)((a+b)/2);
            int rd=mid-a;
            if(k%2!=0){
                // rsum=(possum[b]-possum[mid]);
                // lsum=(mid==0?0:possum[mid-1])-(a==0?0:possum[a-1])-rd*(rd+1);
                // res=rsum-lsum;
                res=(possum[b]-possum[mid])-((mid==0?0:possum[mid-1])-(a==0?0:possum[a-1]))-rd*(rd+1);
                // max=Math.min(max,res);
            }
            else{
                // rsum=(possum[b]-possum[mid]);
                // lsum=(mid==0?0:possum[mid-1])-(a==0?0:possum[a-1])-possum[mid]-rd*(rd+1)-(rd+1);
                // res=rsum-lsum;
                // max=Math.min(max,res);
                res=(possum[b]-possum[mid])-((mid==0?0:possum[mid-1])-(a==0?0:possum[a-1]))-pos[mid]-rd*(rd+1)-(rd+1);
            }
            min=Math.min(min,res);
            a+=1;
            b+=1;
        }
        // System.out.println(max);
        return (int)min;
    }
}