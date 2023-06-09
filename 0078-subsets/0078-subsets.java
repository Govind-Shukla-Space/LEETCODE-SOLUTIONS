class Solution {
    List<List<Integer>> arr= new ArrayList<List<Integer>>();
    void dfs(int nums[],int n,ArrayList<Integer> sub){
        if (n==0)
        arr.add(new ArrayList<>(sub));
        else{
            dfs(nums,n-1,sub);
            sub.add(nums[n-1]);
            dfs(nums,n-1,sub);
            sub.remove(sub.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        //  Arrays.sort(nums);
         ArrayList<Integer> sub=new ArrayList<Integer>();
         dfs(nums,nums.length,sub);
         return arr;
    }
}