class Solution {
    public boolean canReach(int[] arr, int start) {
        if(arr[start]==0)
        return true;
        int n=arr.length;
        Queue<Integer> q=new LinkedList<Integer>();
        q.add(start);
        int vis[]=new int[n];
        vis[start]=1;
        while(!q.isEmpty()){
            int t=q.poll();
            if(arr[t]==0)
            return true;
            if(t+arr[t]<n&&vis[t+arr[t]]!=1){
            q.add(t+arr[t]);
            vis[t+arr[t]]=1;}
            if(t-arr[t]>=0&&vis[t-arr[t]]!=1){
            q.add(t-arr[t]);
            vis[t-arr[t]]=1;}
        }
        return false;
    }
}