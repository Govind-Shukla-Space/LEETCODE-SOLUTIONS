class Solution {
    ArrayList<char[]> create(){
        ArrayList<char[]> p1=new ArrayList<char[]>();
        p1.add(new char[]{'*'});
        p1.add(new char[]{'*'});
        p1.add(new char[]{'a', 'b', 'c'});
        p1.add(new char[]{'d', 'e', 'f'});
        p1.add(new char[]{'g', 'h', 'i'});
        p1.add(new char[]{'j', 'k', 'l'});
        p1.add(new char[]{'m', 'n', 'o'});
        p1.add(new char[]{'p', 'q', 'r', 's'});
        p1.add(new char[]{'t', 'u', 'v'});
        p1.add(new char[]{'w', 'x', 'y', 'z'});
        return p1;
    }
    void fun(int i,char s[],List<String> ans,String sub){
        if(i>=s.length){
            ans.add(sub);
            return ;
        }
        for(char c:phone.get(Integer.parseInt(""+s[i]))){
            sub+=c;
            fun(i+1,s,ans,sub);
            sub=sub.substring(0,sub.length()-1);
        }
    }
    ArrayList<char []> phone;
    public List<String> letterCombinations(String digits) {
        phone=create();
        
        List<String> ans=new ArrayList<String>();
        if(digits.length()==0)
            return ans;
        char s[]=digits.toCharArray();
        fun(0,s,ans,"");
        return ans;
    }
}