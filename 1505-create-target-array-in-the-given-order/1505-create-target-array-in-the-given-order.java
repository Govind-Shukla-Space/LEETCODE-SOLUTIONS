class Solution {
    
    public int[] createTargetArray(int[] nums, int[] index) {
        int arr1[]=new int[nums.length];
        for(int i=0;i<arr1.length;i++)
        arr1[i]=-1;
        for(int j=0;j<nums.length;j++){
            if(arr1[index[j]]==-1)
            arr1[index[j]]=nums[j];
            else{
                for(int i=arr1.length-2;i>=index[j];i--)
                arr1[i+1]=arr1[i];
                arr1[index[j]]=nums[j];
                }
        }
        return arr1;
    }
}