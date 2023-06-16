class Solution {
    int c=0;
    void search(int n,int p,boolean bool[]){
        if(p==n){
            c+=1;
        }
        else{
            for(int i=1;i<=n;i++){
                if(bool[i]==true &&(i%(p+1)==0|| (p+1)%i==0)){
                    bool[i]=false;
                    p++;
                    search(n,p,bool);
                    p--;
                    bool[i]=true;
                }
            }
        }
    }
    public int countArrangement(int n) {
        // List<Integer> sub=new ArrayList<Integer>();
        boolean bool[]=new boolean[n+1];
        for(int i=0;i<n+1;i++){
            bool[i]=true;
        }
        search(n,0,bool);
        return c;
    }
}