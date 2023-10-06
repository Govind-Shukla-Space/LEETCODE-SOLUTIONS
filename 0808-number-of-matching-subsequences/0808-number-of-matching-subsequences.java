class Solution {
    boolean fun(String s,String t){
        int c=0,k=0,i=0,j=0;
        while(i<s.length()&&j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                c+=1;
                i+=1;
                // break;
            }
            j+=1;
        }
        return s.length()==c;
    }
    public int numMatchingSubseq(String s, String[] words) {
        int c=0;
        HashMap<String,Integer> map=new HashMap<String,Integer>();
        for(int i=0;i<words.length;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        for(String word:map.keySet()){
            if(fun(word,s))
            c+=map.get(word);
        }
        return c;
    }
}