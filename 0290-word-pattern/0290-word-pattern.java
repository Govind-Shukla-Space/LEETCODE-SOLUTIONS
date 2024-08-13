class Solution {
    
    public boolean wordPattern(String pattern, String s) {
        
        HashMap<Character ,String> map =new HashMap<Character ,String>();
        HashSet<String> set= new HashSet<String>();
        String arr[]=s.split(" ");
        if(pattern.length()!=arr.length)
            return false;
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            if(map.containsKey(ch)){
                if(arr[i].compareTo(map.get(ch))==0){
                    continue;
                }
                else
                    return false;
            }
            else{
                if(set.contains(arr[i]))
                    return false;
                map.put(ch,arr[i]);
                set.add(arr[i]);
            }
        }
        return true;
    }
}