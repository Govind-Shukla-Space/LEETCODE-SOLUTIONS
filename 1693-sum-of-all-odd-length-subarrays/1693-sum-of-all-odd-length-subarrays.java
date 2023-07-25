class Solution {
    int s=0;
    void fun(int arr[],int k){
        int a=0,b=0,s1=0;
        while(b<arr.length){
            s1+=arr[b];
            if(b-a+1==k){
                s+=s1;
                s1-=arr[a];
                a+=1;
            }
            b+=1;
        }
        // System.out.println(s1);
    }
    public int sumOddLengthSubarrays(int[] arr) {
        int k=1;
        
        System.out.println(s);
        // fun(arr,k);
        while(k<=arr.length){
            fun(arr,k);
            
            k+=2;
        }
        return s;
    }
}