class Solution {
    int fun(int n){
        int d,s=0;
        while(n!=0){
            d=n%10;
            s+=d;
            n=n/10;
        }
        return s;
    }
    public int differenceOfSum(int[] nums) {
        int a=0,b=0;
        for(int i=0;i<nums.length;i++){
            a+=nums[i];
            b+=fun(nums[i]);
        }
        return Math.abs(a-b);
    }

}