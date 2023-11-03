// O(n2^n)
class Solution1 {
    void allsub(int i,String t,String s,String sub,ArrayList<String> arr){
        if(i>=t.length())
        {
            arr.add(sub);
            return;
        }
        else{
            allsub(i+1,t,s,sub,arr);
            sub+=t.charAt(i);
            allsub(i+1,t,s,sub,arr);
            sub.substring(0,sub.length());
        }
    }
    boolean valid(String s, String sub){
        return sub.compareTo(s)==0;
    }
    public boolean isSubsequence(String s, String t) {
        ArrayList<String> arr=new ArrayList<String>();
        allsub(0,t,s,"",arr);
        for(String sub:arr){
            if(valid(s,sub))
            return true;
        }
        return false;
    }
}
class Solution2 {
    boolean res=false;
    void allsub(int i,String t,String s,String sub){
        if(i>=t.length())
        {
            if(sub.compareTo(s)==0)
            res=true;
            return;
        }
        else{
            allsub(i+1,t,s,sub);
            sub+=t.charAt(i);
            allsub(i+1,t,s,sub);
            sub.substring(0,sub.length());
        }
    }
    public boolean isSubsequence(String s, String t) {
        allsub(0,t,s,"");
        return res;
    }
}
//backtracking optimimze to length of s only
class Solution3 {
    boolean res=false;
    void allsub(int i,String t,String s,String sub){
        if(i>=t.length())
        {
            if(sub.compareTo(s)==0)
            res=true;
            return;
        }
        else{
            if(sub.length()<=s.length()){
            allsub(i+1,t,s,sub);
            sub+=t.charAt(i);
            allsub(i+1,t,s,sub);
            sub.substring(0,sub.length());}
        }
    }
    public boolean isSubsequence(String s, String t) {
        allsub(0,t,s,"");
        return res;
    }
}
class Solution4 {
    int n,k;
    boolean allsub(int i,int j,String t,String s){
        if(i==n)
        return false;
        if(j==k)
        return true;
        else{
            if(t.charAt(i)!=s.charAt(j))
            return allsub(i+1,j,t,s);
            else
            return allsub(i+1,j,t,s)||allsub(i+1,j+1,t,s);
        }
    }
    public boolean isSubsequence(String s, String t) {
        n=t.length()-1;
        k=s.length()-1;
        return allsub(0,0,t,s);
    }
}
class Solution23 {
    int n,k;
    boolean tlb[][];
    boolean solved[][];
    boolean allsub(int i,int j,String t,String s){
        if(solved[i][j])
        return tlb[i][j];
        solved[i][j]=true;
        if(i==n)
        return tlb[i][j]=false;
        if(j==k)
        return tlb[i][j]=true;
        else{
            if(t.charAt(i)!=s.charAt(j))
            return tlb[i][j]=allsub(i+1,j,t,s);
            else
            return tlb[i][j]=allsub(i+1,j,t,s)||allsub(i+1,j+1,t,s);
        }
    }
    public boolean isSubsequence(String s, String t) {
        n=t.length();
        k=s.length();
        tlb=new boolean[n+1][k+1];
        solved=new boolean[n+1][k+1];
        for(int i=0;i<solved.length;i++){
            for(int j=0;j<solved[0].length;j++)
            solved[i][j]=false;
        }
        // for(int i=0;i<=k;i++)
        // tlb[n][i]=false;
        // for(int i=0;i<=n;i++)
        // tlb[i][k]=false;
        // for(int i=n-1;i>=0;i++){
        //     for(int j=0;j<=k;j++){

        //         tlb[i][j]=tlb(i+1,j)||tlb(i+1,j+1);
        //     }
        // }
        return allsub(0,0,t,s);
    }
}

class Solution {
    int n,k;
    // boolean tlb[][];
    int solved[][];
    int allsub(int i,int j,String t,String s){
        if(solved[i][j]!=-1)
        return solved[i][j];
        // solved[i][j]=true;
        if(i==n){
            if(j==k)
            return solved[i][j]=1;
            return solved[i][j]=0;
        }
        if(j==k)
        return solved[i][j]=1;
        else{
            if(t.charAt(i)!=s.charAt(j))
            return solved[i][j]=allsub(i+1,j,t,s);
            else
            return solved[i][j]=allsub(i+1,j+1,t,s);
        }
    }
    public boolean isSubsequence(String s, String t) {
        n=t.length();
        k=s.length();
        // tlb=new boolean[n+1][k+1];
        solved=new int[n+1][k+1];
        for(int i=0;i<solved.length;i++){
            for(int j=0;j<solved[0].length;j++)
            solved[i][j]=-1;
        }
        return allsub(0,0,t,s)==1?true:false;
    }
}