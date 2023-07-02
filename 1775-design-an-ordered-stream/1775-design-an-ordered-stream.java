class OrderedStream {
    String str[];
    int i=0;
    public OrderedStream(int n) {
        str=new String[n];
    }
    
    public List<String> insert(int idKey, String value) {
        str[idKey-1]=value;
        List<String> arr=new ArrayList<String>();
        while(i<str.length && str[i]!=null){
            arr.add(str[i]);
            i+=1;
        }
        return arr;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */ 