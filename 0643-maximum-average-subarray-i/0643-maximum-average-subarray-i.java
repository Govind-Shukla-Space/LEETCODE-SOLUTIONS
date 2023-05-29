class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int a=0,b=k;
        double avg,max,sum=0;
        for(int i=0;i<k;i++)
        sum+=nums[i];
        max=sum;
        while(b<nums.length){
            sum-=nums[a];
            sum+=nums[b];
            if(sum>max)
            max=sum;
            a+=1;
            b+=1;
        } 
        return max/k;
    }
}