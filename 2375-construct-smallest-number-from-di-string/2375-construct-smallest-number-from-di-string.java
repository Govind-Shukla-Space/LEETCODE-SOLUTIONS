class Solution {
    void fun(int i,String s,String p,int vis[]){
        if(i>=p.length()){
            if (res.compareTo(s) >0)
                res = s;
            return;
        }
        if(i==-1){
            for(int j=1;j<=9;j++){
                if(vis[j]==0){
                    vis[j]=1;
                    s+=(char)(j+'0');
                    fun(i+1,s,p,vis);
                    s=s.substring(0,s.length()-1);
                    vis[j]=0;
                }
            }
        }
        else{
            int t=s.charAt(s.length()-1)-'0';
            if(p.charAt(i)=='D'){
                
                for(int j=t-1;j>=1;j--){
                    if(vis[j]==0){
                        vis[j]=1;
                        s+=(char)(j+'0');
                        fun(i+1,s,p,vis);
                        s=s.substring(0,s.length()-1);
                        vis[j]=0;
                    }
                }
            }
            else{
                
                for(int j=t+1;j<=9;j++){
                    if(vis[j]==0){
                        vis[j]=1;
                        s+=(char)(j+'0');
                        fun(i+1,s,p,vis);
                        s=s.substring(0,s.length()-1);
                        vis[j]=0;
                    }
                }
            }
        }
    }
    String res="987654321";
    public String smallestNumber(String pattern) {
        int vis[]=new int[10];
        fun(-1,"",pattern,vis);
        return res;
    }
}