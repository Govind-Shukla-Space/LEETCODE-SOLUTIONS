// O(n^3)
class Solution1 {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++)
                sum+=nums[k];
                max=Math.max(max,sum);
            }
        }
        return max;
    }
}
// O(n^2)
class Solution2 {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                max=Math.max(max,sum);
            }
        }
        return max;
    }
}
// O(n^2)time O(n)space
class Solution3 {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int ps[]=new int[n];
        ps[0]=nums[0];
        for(int i=1;i<n;i++){
            ps[i]=ps[i-1]+nums[i];
        }
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                int sum=(i==0)?ps[j]:(ps[j]-ps[i-1]);
                max=Math.max(max,sum);
            }
        }
        return max;
    }
}
// O(n) ,O(1)
class Solution4 {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int ps=0,low=0;
        // ps[0]=nums[0];
        for(int i=0;i<n;i++){
            ps+=nums[i];
            max=Math.max(max,ps-low);
            if (ps<low)
            low=ps;
        }
        return max;
    }
}
class Solution5 {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int ps=0;
        for(int i=0;i<n;i++){
            ps+=nums[i];
            max=Math.max(max,ps);
            if (ps<0)
            ps=0;
        }
        return max;
    }
}
class Solution6 {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int ps=0;
        for(int i=0;i<n;i++){
            ps+=nums[i];
            max=Math.max(max,ps);
            if (ps<0)
            ps=0;
        }
        return max;
    }
}
// Divide and Conquer
class Solution {
    int f1(int i,int j,int nums[]){
        if(i==j)
        return nums[i];
        int mid=(i+j)/2;
        int left=f1(i,mid,nums);
        int right=f1(mid+1,j,nums);
        int ans=Math.max(left,right);
        return Math.max(ans,f2(i,mid,j,nums));
    }
    int f2(int i,int mid,int j,int nums[]){
        int suf=nums[mid];
        int sum=nums[mid];
        for(int k=mid-1;k>=i;k--){
            sum+=nums[k];
            suf=Math.max(sum,suf);
        }
        int pref=nums[mid+1];
        sum=nums[mid+1];
        for(int k=mid+2;k<=j;k++){
            sum+=nums[k];
            pref=Math.max(sum,pref);
        }
        return suf+pref;
    }
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        return f1(0,n-1,nums);
    }
}
