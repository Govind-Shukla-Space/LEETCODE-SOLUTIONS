class Solution {
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> grp=new ArrayList<ArrayList<Integer>>();
        int n=isConnected.length;
        for(int i=0;i<n;i++){
            grp.add(new ArrayList<Integer>());
        }
        int vis[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++){
            Queue<Integer> q=new LinkedList<Integer>();
            
            if(vis[i]==0){
                c+=1;
                vis[i]=1;
                q.add(i);
                while(!q.isEmpty()){
                    int t=q.poll();
                    for(int j=0;j<n;j++){
                        if(isConnected[t][j]==1&&vis[j]==0){
                            vis[j]=1;
                            q.add(j);
                        }
                    }
                }
            }
        }
        return c;
    }
} 