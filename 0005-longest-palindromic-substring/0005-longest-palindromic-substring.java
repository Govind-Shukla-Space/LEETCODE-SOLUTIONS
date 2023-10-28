class Solution {
    boolean check(String s){
        int b=s.length()-1;
        int a=0;
        while(a<b){
            if(s.charAt(a)!=s.charAt(b))
            return false;
            a+=1;
            b-=1;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        if(s.length()<=1)
        return s;
        String s1=s.substring(0,1);
        int max=1;
        for(int i=0;i<s.length();i++){
            for(int j=i+max;j<=s.length();j++){
                if(j-i>max&&check(s.substring(i,j))){
                    max=j-i;
                    s1=s.substring(i,j);
                }
            }
        }
        return s1;
    }
}