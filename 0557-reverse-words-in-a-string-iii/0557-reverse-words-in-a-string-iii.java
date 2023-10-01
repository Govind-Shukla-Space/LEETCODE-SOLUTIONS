class Solution {
    String fun(String s){
        String s1="";
        for (int i=s.length()-1;i>=0;i--){
            s1+=s.charAt(i);
        }
        return s1;
    }
    public String reverseWords(String s) {
        String s1="",s2="";
        s+=" ";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=32)
            s2+=s.charAt(i);
            else{
                s1+=fun(s2);
                s1+=" ";
                s2="";
            }
        }
        return s1.trim();
    }
}