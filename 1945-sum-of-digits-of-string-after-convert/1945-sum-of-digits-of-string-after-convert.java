class Solution {
    int sum(String s1){
        int i=0,s=0;
        char ch;
        // System.out.println("sdfghjk");
        while(i<s1.length()){
            ch=s1.charAt(i);
            s+=Character.getNumericValue(ch);
            // System.out.println(s);
            i+=1;            
        }
        // System.out.println(s);
        return s;
    }
    public int getLucky(String s, int k) {
        int n=s.length();
        String s1="";
        
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            s1+=Integer.toString(ch-96);
        }
        
        int q=0;
        while(k!=0){ 
            
            q=sum(s1);
            s1=Integer.toString(q);
            k-=1;
        }
        return q;
    }
}