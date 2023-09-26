class Solution {
    int bin(int n){
        int s=0;
        while(n!=0){
            s+=n%2;
            n=n/2;
        }
        return s;
    }
    public int[] countBits(int n) {
        int arr[]=new int[n+1];
        for(int i=0;i<=n;i++){
            arr[i]=bin(i);
        }
        return arr;
    }
}