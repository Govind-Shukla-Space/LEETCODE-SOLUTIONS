class Solution {
    int fun(String s,int f){
        int c=0;
        for(int i=0;i<s.length();i++){
            if(f==0){
            if (s.charAt(i)=='0')
            c+=1;
            }
            else{
                if(s.charAt(i)=='1')
                c+=1;
            }
        }
        return c;
    }
    public int maxScore(String s) {
        int max=Integer.MIN_VALUE,d;
        for(int i=1;i<s.length();i++){
        String s1=s.substring(0,i);
        String s2=s.substring(i);
        d=fun(s1,0)+fun(s2,1);
        if(d>max)
        max=d;
        }
        return max;
    }

}