class Solution1 {
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
class Solution{
    String fun(String s,int a,int b){
        while((a>=0&&b<s.length())&&(s.charAt(a)==s.charAt(b))){
            a-=1;
            b+=1;
        }
        return s.substring(a+1,b);
    }
    public String longestPalindrome(String s) {
        if(s.length()<=1)
        return s;
        String max=s.substring(0,1);
        for(int i=0;i<s.length()-1;i++)
        {
            String odd=fun(s,i,i);
            String even=fun(s,i,i+1);
            
            if(odd.length()>max.length()){
                max=odd;
            }
            if(even.length()>max.length())
            max=even;
        }
        return max;
    }
}