class Solution {
    public int[] decode(int[] encoded, int first) {
        int r[]=new int[encoded.length+1];
        r[0]=first;
        for(int i=1;i<r.length;i++)
        r[i]=r[i-1]^encoded[i-1];
        return r;
    }
}