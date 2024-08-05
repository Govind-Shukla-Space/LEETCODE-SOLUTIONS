class Solution {
    public String kthDistinct(String[] arr, int k) {
         HashMap<String,Integer> map=new HashMap<String,Integer>();
        for(String a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        for(int i =0;i<arr.length;i++){
            if(map.get(arr[i])==1){
                if(k==1)
                    return arr[i];
                else
                    k-=1;
            }
        }
        return "";
    }
}