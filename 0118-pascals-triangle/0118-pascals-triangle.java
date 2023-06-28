class Solution {
    List<Integer> fun(List<Integer> arr){
        List<Integer> arr1=new ArrayList<Integer>();
        int a=0,b=0,k=2,s=0;
        while(b<arr.size()){
            s+=arr.get(b);
            if(b-a+1==k){
                arr1.add(s);
                s-=arr.get(a);
                a+=1;
            }
            b+=1;
        }
        arr1.add(0,1);
        arr1.add(1);
        return arr1;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr=new ArrayList<List<Integer>>();
        ArrayList<Integer> arr1=new ArrayList<Integer>();
        arr1.add(1);
        arr.add(new ArrayList<>(arr1));
        if(numRows==1){
            return arr;
        }
        arr1.add(1);
        arr.add(new ArrayList<>(arr1));
        if(numRows==2){
            return arr;
        }
        for(int i=2;i<numRows;i++){
            
            arr.add(new ArrayList<>(fun(arr.get(i-1))));
        }
        return arr;
    }
}