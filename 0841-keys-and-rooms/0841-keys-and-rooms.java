class Solution {
    void fun(int i,List<List<Integer>> rooms,HashSet<Integer> vis) {
        vis.add(i);
        for(int a: rooms.get(i)){
            if(!vis.contains(a))
                fun(a,rooms,vis);
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        HashSet<Integer> vis=new HashSet<Integer>();
        fun(0,rooms,vis);
        return vis.size()==rooms.size();
    }
}