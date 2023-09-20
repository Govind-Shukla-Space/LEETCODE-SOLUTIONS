class Solution {
    public int divisorSubstrings(int num, int k) {
        int a=0,b=0,sum=0,c=0;
        String s=Integer.toString(num);
        // System.out.println(s);
        while (b<s.length()){
            sum=sum*10+s.charAt(b)-'0';
            // System.out.println(sum);
            if(b-a+1==k){
                int s1=sum;
                System.out.println(sum);
                if(s1!=0 &&num%s1==0)
                {c++;}
                sum-=(s.charAt(a)-'0')*Math.pow(10,k-1);
                a++;
            }
            b+=1;
        }
        
        return c;
    }
}