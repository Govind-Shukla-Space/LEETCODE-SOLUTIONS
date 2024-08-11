class Solution1 {//tle
    boolean fun(int s,ArrayList<ArrayList<Integer>> arr,int d,HashSet<Integer> vis){
        if(s==d)
            return true;
        vis.add(s);
        for(int i:arr.get(s)){
            if(!vis.contains(i))
             if(fun(i,arr,d,vis))
                 return true;
        }
        vis.remove(s);
        return false;
    }
    boolean r=false;
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(edges.length==0)
            return source==destination;
        ArrayList<ArrayList<Integer>> arr= new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<n;i++){
            arr.add(new ArrayList<Integer>());
        }
        for(int i[]:edges){
            arr.get(i[0]).add(i[1]);
            arr.get(i[1]).add(i[0]);
        }
        HashSet<Integer> vis = new HashSet<Integer>();
        return fun(source,arr,destination,vis);
        // return r;    
    }
}

class Solution{
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(edges.length==0)
            return source==destination;
        ArrayList<ArrayList<Integer>> arr= new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<n;i++){
            arr.add(new ArrayList<Integer>());
        }
        for(int i[]:edges){
            arr.get(i[0]).add(i[1]);
            arr.get(i[1]).add(i[0]);
        }
        HashSet<Integer> vis = new HashSet<Integer>();
        Queue<Integer> q=new LinkedList<Integer>();
        q.add(source);
        vis.add(source);
        while(!q.isEmpty()){
            int t=q.poll();
            if(t==destination)
                return true;
            for(int i:arr.get(t)){
                if(!vis.contains(i)){
                    vis.add(i);
                    q.add(i);
                }
            }
        }
        return false;
    }
}