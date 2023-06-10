class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int v:nums){
            if (!(map.containsKey(v)))
            map.put(v,1);
            else
            return true;
        }
        return false;
    }
}