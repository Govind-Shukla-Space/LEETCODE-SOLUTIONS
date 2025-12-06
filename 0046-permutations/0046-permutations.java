class Solution {
    public void backtrack(int []nums,boolean []bool,List<Integer> temp,List<List<Integer>> result){
        if(temp.size()== nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int j=0;j<nums.length;j++){
            if( !bool[j]){
                bool[j]=true;
                temp.add(nums[j]);
                backtrack(nums,bool,temp,result);
                temp.remove(temp.size()-1);
                bool[j]=false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result= new ArrayList<List<Integer>>();
        List<Integer> temp=new ArrayList<Integer>();
        boolean bool[]=new boolean[nums.length];
        backtrack(nums,bool,temp,result);
        return result;
    }
}