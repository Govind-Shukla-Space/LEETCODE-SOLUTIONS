class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int a=0;
        if(ruleKey.compareTo("color")==0)
        a=1;
        else if(ruleKey.compareTo("name")==0)
        a=2;
        int c=0;
        for(int i=0;i<items.size();i++){
            if(items.get(i).get(a).compareTo(ruleValue)==0)
            c+=1;
        }
        return c;
    }
}