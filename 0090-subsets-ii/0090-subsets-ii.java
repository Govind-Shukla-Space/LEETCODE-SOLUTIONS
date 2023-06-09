class Solution {
    List<List<Integer>> alsol=new ArrayList<List<Integer>>();
    
    void search(int nums[],int n,ArrayList<Integer> arr){
        if(n==0){
            if(!alsol.contains(arr))
            alsol.add(new ArrayList<>(arr));
        }
        
        else{
            // int k=0;
            search(nums,n-1,arr);
            arr.add(nums[n-1]);
            search(nums,n-1,arr);
            arr.remove(arr.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> arr=new ArrayList<Integer>();
        search(nums,nums.length,arr);
        return alsol;
    }
}