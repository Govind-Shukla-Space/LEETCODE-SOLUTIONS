class Solution {
    void merge(int arr[], int l, int m, int r)
        {
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int [n1];
        int R[] = new int [n2];
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
        }
        void sort(int arr[], int l, int r)
        {
            if (l < r)
            {
                int m = (l+r)/2;
                sort(arr, l, m);
                sort(arr , m+1, r);
                merge(arr, l, m, r);
            }
       }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int arr[]=new int[m+n];
        int k=0,t;
        for(int i=0;i<m;i++){
            arr[k]=nums1[i];
            k+=1;
        }
        for(int i=0;i<n;i++){
            arr[k]=nums2[i];
            k+=1;
        }

        Solution ob=new Solution();
        ob.sort(arr,0,k-1);
        int i=(int)k/2,q;
        double q1;
        if(k%2==0){
            
            q1=(arr[i]+arr[i-1])/2.0;
            return q1;
        }
        else{
            q=arr[i];
            return q;

        }
    }
}