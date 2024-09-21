class Solution {
    
    public String longestCommonPrefix(String[] strs) {
        String s1="";
        int n=strs.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min=Math.min(min,strs[i].length());
        }
        for(int i=0;i<min;i++){
            int f=0;
            char ch=strs[0].charAt(i);
            for(int j=1;j<n;j++){
                if(ch!=strs[j].charAt(i)){
                    f=1;
                    break;
                }
            }
            if(f==1)
                break;
            s1+=ch;
        }
        return s1;
    }
}