class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.length()==0)
        return 0;
        boolean s11=false;
        int s1=0;
        int a=0;
        if(s.charAt(0)=='-'||s.charAt(0)=='+'){
            if(s.charAt(0)=='-')
                s11=true;
            a+=1;
        }
        for(int i=a;i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                int d=s.charAt(i)-'0';
                if (s1>(Integer.MAX_VALUE/10)||(s1==(Integer.MAX_VALUE/10))&& d>7){
                    if(s11)
                    return Integer.MIN_VALUE;
                    else
                    return Integer.MAX_VALUE;
                }
                s1=(s1*10)+d;
            }
            else
            break;
        }
        System.out.println(s1);
        if (s11)                      
        return s1*-1;
        else
        return s1;
    }
}