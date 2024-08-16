class Solution {
    public int minimumPushes(String word) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:word.toCharArray())
            map.put(c,map.getOrDefault(c,0)+1);
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(Character c:map.keySet()){
            pq.add(map.get(c));
        }
        int m=1,c=0,ans=0;
        while(pq.size()>0){
            int pop=pq.remove();
            if(c==8){
                c=0;
                m+=1;
            }
            ans+=pop*m;
            c+=1;
        }
        // System.out.println(pq);
        return ans;
    }
}