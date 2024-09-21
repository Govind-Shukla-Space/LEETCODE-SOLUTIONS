import java.math.BigInteger;
class Solution {
    String fun(String a,String b){
        if(b=="")
            return a;
        // long a1=Long.parseLong(a);
        // long b1=Long.parseLong(b);
        BigInteger a1 = new BigInteger(a);  
        BigInteger b1 = new BigInteger(b);
        if(a1.compareTo(b1)==1)
            return a;
        return b;
    }
    public String largestNumber(int[] nums) {
        int n=nums.length;
        String s[]=new String[n];
        for(int i=0;i<n;i++)
            s[i]=Integer.toString(nums[i]);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                String q=fun(s[i]+s[j],s[j]+s[i]);
                if(q.equals(s[j]+s[i])){
                    String t=s[i];
                    s[i]=s[j];
                    s[j]=t;
                }
            }
        }
        if(s[0].equals("0"))
            return "0";
        String ans="";
        for(int i=0;i<n;i++)
            ans+=s[i];
        
        return ans;
    }
}