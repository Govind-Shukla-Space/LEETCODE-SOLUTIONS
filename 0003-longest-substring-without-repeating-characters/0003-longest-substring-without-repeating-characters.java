class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        HashSet<Character> set=new HashSet<>();
        int a=0,b=0;
        while(b<s.length()){

            if (!set.contains(s.charAt(b))){
                set.add(s.charAt(b));
                max=Math.max(max,b-a+1);
            }
            else{
                while(s.charAt(a)!=s.charAt(b)){
                    set.remove(s.charAt(a));
                    a++;
                }
                set.remove(s.charAt(a));
                a++;
                set.add(s.charAt(b));
            }
            b++;
        }
        
        return max;
    }
}