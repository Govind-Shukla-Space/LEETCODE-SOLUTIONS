class Solution {
    int a[]=new int[2];
    int[] f1(int i,int j,int[] nums,int tar){
        if(j==i){
            a[0]=-1;
            a[1]=-1;
            return a;
        }
        if(nums[i]+nums[j]==tar){
            a[0]=i+1;
            a[1]=j+1;
            return a;
        }
        if (nums[i]+nums[j]>tar)
        return f1(i,j-1,nums,tar);
        return f1(i+1,j,nums,tar);
    }
    public int[] twoSum(int[] numbers, int target) {
        return f1(0,numbers.length-1,numbers,target);
    }
}