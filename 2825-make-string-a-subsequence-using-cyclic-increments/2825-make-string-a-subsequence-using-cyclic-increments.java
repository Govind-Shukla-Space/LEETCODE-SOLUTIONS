class Solution {
    boolean fun(int i,int j,String s1,String s2){
        if(j>=s2.length()) 
            return true;
        if(i>=s1.length())
            return false;
        if(s1.charAt(i)==s2.charAt(j)||s2.charAt(j)-s1.charAt(i)==1||(s1.charAt(i)=='z'&&s2.charAt(j)=='a'))
            return fun(i+1,j+1,s1,s2);
        return fun(i+1,j,s1,s2);
    }
    public boolean canMakeSubsequence(String str1, String str2) {
        return fun(0,0,str1,str2);
    }
}