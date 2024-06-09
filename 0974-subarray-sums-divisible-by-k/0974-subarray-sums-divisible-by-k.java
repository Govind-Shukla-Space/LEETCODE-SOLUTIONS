class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int c=0,sum=0;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        map.put(0,1);
        for(int a:nums){
            sum+=a;
            int r=((sum%k)+k)%k;
            if(map.containsKey(r)){
                c+=map.get(r);
                map.put(r,map.get(r)+1);
            }
            else
                map.put(r,1);
        }
        return c;
    }
}