class Solution1 {
    public int[] searchRange(int[] nums, int target) {
        int a[]=new int[2];
        
        int k=0,f=0,g=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target)
            {
                f=1;
                a[k]=i;
                k++;
                break;
            }
        }
        int w=-2;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                g=1;
                w=i;
            }
        }
        if(w!=-2){
            a[k]=w;
        }
        if(f==1 || g==1)
        return a;
        a[0]=-1;
        a[1]=-1;
        return a;
    }
}
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int arr[]=new int[2];
        int l=0,h=n-1;
        int first=-1,last=-1;
        int mid=0;
        while(l<=h){
            mid=(int)(l+(h-l)/2);
            if(nums[mid]==target&&(mid==0||nums[mid-1]!=target)){
                first=mid;
                break;
            }
            if(target<=nums[mid])
            h=mid-1;
            else
            l=mid+1;
        }
        if(first==-1){
            arr[0]=first;
            arr[1]=last;
            return arr;
        }
        
        l=first;
        h=n-1;
        while(l<=h){
            mid=(int)(l+(h-l)/2);
            if(nums[mid]==target &&(mid==n-1||nums[mid+1]!=target)){
                last=mid;
                break;
            }
            if(target<nums[mid])
            h=mid-1;
            else
            l=mid+1;
        }
        // if(last==-1)
        arr[0]=first;
        arr[1]=last;
        return arr;
    }
}