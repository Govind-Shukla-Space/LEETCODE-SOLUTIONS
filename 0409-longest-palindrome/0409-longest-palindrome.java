class Solution {
    HashMap<Character,Integer> map;
    char getOdd(HashMap<Character,Integer> map){
        char c='@';
        int max=Integer.MIN_VALUE;
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()%2!=0&&entry.getValue()>max){
                c=entry.getKey();
                max=entry.getValue();
            }
        }
        return c;
    }
    public int longestPalindrome(String s) {
        map=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        char c=getOdd(map);
        int s1=0;
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()%2==0)
            s1+=entry.getValue();
            else if(c!='@'){
                if(entry.getKey()==c)
                s1+=entry.getValue();
                else
                s1+=(entry.getValue()/2)*2;
            }
        }
        System.out.println(map);
        return s1;
    }
}