class Solution {
    public int[] decompressRLElist(int[] nums) {
        int n=0;
        for(int i=0;i<nums.length;i+=2)
        n+=nums[i];
        int r[]=new int[n];

        int k=0;
        for(int i=0;i<nums.length;i+=2){
            for(int j=0;j<nums[i];j++)
            r[k++]=nums[i+1];
        }
        return r;
    }
}