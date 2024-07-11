class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stk=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(')
                stk.add(ch);
            else if(ch!=')')
                stk.add(ch);
            else{
                String s1="";
                while(stk.peek()!='('){
                    s1+=stk.pop();
                }
                stk.pop();
                for(int j=0;j<s1.length();j++){
                    stk.add(s1.charAt(j));
                }
            }
        }
        String s1="";
        while(stk.size()>0)
            s1=stk.pop()+s1;
        return s1;
    }
}