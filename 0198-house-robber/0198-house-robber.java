class Solution {
    int fun(int i,int arr[],HashMap<Integer,Integer> map){
        if(map.containsKey(i))
        return map.get(i);
        if(i>arr.length)
        return 0;
        int without=fun(i+1,arr,map);
        int with=0;
        if(i<arr.length)
        with=fun(i+2,arr,map)+arr[i];
        map.put(i,Math.max(with,without));
        return map.get(i);
    }
    public int rob(int[] nums) {
        return fun(0,nums,new HashMap<>());
    }
}