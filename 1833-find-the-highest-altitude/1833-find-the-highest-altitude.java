class Solution {
    public int largestAltitude(int[] gain) {
        int c=0,s=0;
        for(int i=0;i<gain.length;i++){
            s+=gain[i];
            c=Math.max(c,s);
        }
        return c;
    }
}