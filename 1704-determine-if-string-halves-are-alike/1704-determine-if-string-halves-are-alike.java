class Solution {
    boolean vowel(char s){
        char ch=Character.toLowerCase(s);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        return true;
        return false;
    }
    public boolean halvesAreAlike(String s) {
        int n=s.length();
        int a=0,b=(int)n/2,a1=0,b1=0;
        while(a<(int)n/2){
            char ch=s.charAt(a);
            if(vowel(ch))
            a1+=1;
            a+=1;
        }
        while(b<n){
            char ch=s.charAt(b);
            if(vowel(ch))
            b1+=1;
            b+=1;
        }
        if(a1==b1)
        return true;
        return false;
    }
}