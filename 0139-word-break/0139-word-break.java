class Solution1 {
    boolean fun(int i,String s,HashSet<String> set){
        if(i>=s.length())
            return true;
        for(int j=i;j<s.length();j++){
            String sub=s.substring(i,j+1);
            // System.out.println(sub);
            if(set.contains(sub)&&fun(j+1,s,set))
                return true;
        }
        return false;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set=new HashSet<String>();
        for(String w:wordDict)
            set.add(w);
        return fun(0,s,set);
    }
}

class Solution {
    boolean fun(int i,String s,HashSet<String> set,HashMap<Integer,Boolean> map){
        if(i>=s.length())
            return true;
        if(map.containsKey(i))
            return map.get(i);
        for(int j=i;j<s.length();j++){
            String sub=s.substring(i,j+1);
            // System.out.println(sub);
            if(set.contains(sub)&&fun(j+1,s,set,map)){
                map.put(i,true);
                return true;
            }
        }
        map.put(i,false);
        return false;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set=new HashSet<String>();
        HashMap<Integer,Boolean> map=new HashMap<Integer,Boolean>();
        for(String w:wordDict)
            set.add(w);
        return fun(0,s,set,map);
    }
}