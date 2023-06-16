class Solution {
    void search(int nums[],List<Integer> sub,List<List<Integer>> all,boolean bool[]){
        if(sub.size()==nums.length)
        all.add(new ArrayList<>(sub));
        else{
            for(int i=0;i<nums.length;i++){
                if(bool[i]){
                    bool[i]=false;
                    sub.add(nums[i]);
                    search(nums,sub,all,bool);
                    sub.remove(sub.size()-1);
                    bool[i]=true;
                }
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> sub=new ArrayList<Integer>();
        List<List<Integer>> all=new ArrayList<List<Integer>>();
        boolean bool[]=new boolean[nums.length];
        for(int i=0;i<nums.length;i++)
        bool[i]=true;
        search(nums,sub,all,bool);
        return all;
    }
}