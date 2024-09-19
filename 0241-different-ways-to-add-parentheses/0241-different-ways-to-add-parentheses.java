class Solution {
    int fun(int a,int b,char c){
        if(c=='+') return a+b;
        if(c=='*') return a*b;
        return a-b;
    }
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> arr=new ArrayList<Integer>();
        // if(expression.charAt(0)=='-')
        //     expression="0"+expression;
        if (expression.matches("\\d+")) {
            arr.add(Integer.parseInt(expression));
            return arr;
        }
        int n=expression.length();
        for(int i=0;i<n;i++){
            char ch=expression.charAt(i);
            if(ch=='+'||ch=='-'||ch=='*'){
                List<Integer> a= diffWaysToCompute(expression.substring(0,i));
                List<Integer> b= diffWaysToCompute(expression.substring(i+1,n));
                for(Integer i1:a){
                    for(Integer j:b){
                        arr.add(fun(i1,j,ch));
                    }
                }
            }
        }
        return arr;
    }
}