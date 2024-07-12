class Solution {
    int fun(String s, int x, int y,String q,String w) {
        int c=0;
        Stack<Character> stk=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(stk.isEmpty())
                stk.add(ch);
            else{
                if((stk.peek()+""+ch).compareTo(q)==0){
                    c+=x;
                    stk.pop();
                }
                else
                    stk.add(ch);
            }
        }
        String s1="";
        while(!stk.isEmpty())
            s1=stk.pop()+s1;
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(stk.isEmpty())
                stk.add(ch);
            else{
                if((stk.peek()+""+ch).compareTo(w)==0){
                    c+=y;
                    stk.pop();
                }
                else
                    stk.add(ch);
            }
        }
        return c;
    }
    public int maximumGain(String s, int x, int y) {
        if(x>=y)
        return fun(s,x,y,"ab","ba");
        else
            return fun(s,y,x,"ba","ab");
    }
}