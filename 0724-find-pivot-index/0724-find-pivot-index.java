class Solution {
    public int pivotIndex(int[] arr) {
        int n=arr.length;
        int a[]=new int[n];
        int b[]=new int[n];
        a[0]=arr[0];
        b[n-1]=arr[n-1];
        for(int i=1;i<arr.length;i++)
        a[i]=a[i-1]+arr[i];
        for (int j=n-2;j>=0;j--) 
        b[j]=b[j+1]+arr[j];
        // for(int i=n-1;i>0;i--)
        // System.out.println(b[i]);
        for(int i=0;i<arr.length;i++){
            if(a[i]-b[i]==0)
            return i;
        }
        
        return -1;
    }
}