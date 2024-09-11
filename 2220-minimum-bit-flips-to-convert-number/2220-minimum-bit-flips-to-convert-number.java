class Solution {
    String fun(String s1,int n){
        String z="0";
        for(int i=0;i<n;i++)
            s1=z+s1;
        return s1;
    }
    public int minBitFlips(int start, int goal) {
        String s1=Integer.toBinaryString(start);
        String s2=Integer.toBinaryString(goal);
        int l1=s1.length();
        int l2=s2.length();
        if(l1!=l2){
            if(l1>l2){
                s2=fun(s2,l1-l2);
            }
            else
                s1=fun(s1,l2-l1);
        }
        int ma=Math.max(l1,l2);
        // System.out.println(s1+" "+s2);
        int c=0;
        for(int i=0;i<ma;i++){
            if(s1.charAt(i)!=s2.charAt(i))
                c+=1;
        }
        return c;
    }
}