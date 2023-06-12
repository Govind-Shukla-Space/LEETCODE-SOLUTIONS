class Solution {
    List<List<Integer>> arr= new ArrayList<List<Integer>>();
    void fun(int cad[],int n,int tar,ArrayList<Integer> par){
        if(tar==0)
        arr.add(new ArrayList<>(par));
        else if(n==0){

        }
        else{
            fun(cad,n-1,tar,par);
            if(tar>=cad[n-1]){
                par.add(cad[n-1]);
                fun(cad,n,tar-cad[n-1],par);
                par.remove(par.size()-1);
            }
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<Integer> sub=new ArrayList<Integer>();
        fun(candidates,candidates.length,target,sub);
        return arr;
    }
}