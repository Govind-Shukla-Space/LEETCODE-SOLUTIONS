class Solution {
    public boolean isSubsequence(String s, String t) {
        int c=0,a=0,b=0,k=0;
        // while
        for(int i=0;i<s.length();i++){
            for(int j=k;j<t.length();j++){
                if(s.charAt(i)==t.charAt(j))
                {
                    c+=1;
                    k=j+1;
                    break;
                }
            }
        }
        return s.length()==c;
    }
}