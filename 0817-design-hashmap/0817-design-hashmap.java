class MyHashMap {
    HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
    public MyHashMap() {
        // MyHashMap()
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            map.put(key,value);
        }
        else
        map.put(key,value);
    }

    public int get(int key) {
     if(!map.containsKey(key))
     return -1;
     else
     return map.get(key);
    }
    
    public void remove(int key) {
        map.remove(key);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */