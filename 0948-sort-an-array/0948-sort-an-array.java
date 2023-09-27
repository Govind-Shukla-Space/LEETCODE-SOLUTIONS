class Solution {
    void mergeSort(int arr[],int f,int l,int n){
        if(f<l){
            int mid=f+(l-f)/2;
            mergeSort(arr,f,mid,n);
            mergeSort(arr,mid+1,l,n);
            merge(arr,f,mid,l,n);
        }
    }
    void merge(int arr[],int f,int p,int l,int n){
        int i=f,j=p+1,k=0;
        int ar[]=new int[n];
        while(i<=p&&j<=l){
            if(arr[i]>=arr[j]){
                ar[k]=arr[j];
                j+=1;
            }
            else{
                ar[k]=arr[i];
                i+=1;
            }
            k+=1;
        }
        while(i<=p){
            ar[k++]=arr[i];
            i++;
        }
        while(j<=l){
            ar[k++]=arr[j];
            j++;
        }
        int o=0;
        for(int i1=f;i1<=l;i1++){
            arr[i1]=ar[o++];
        }
    }
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1,nums.length);
        return nums;   
    }
}