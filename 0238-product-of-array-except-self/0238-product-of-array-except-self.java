class Solution1 {//tle
    public int[] productExceptSelf(int[] nums) {
        int ans[]=new int[nums.length];
        int k=0;
        for(int i=0;i<nums.length;i++){
            int p=1;
            for(int j=0;j<nums.length;j++){
                if(i!=j)
                p*=nums[j];
            }
            ans[k++]=p;
        }
        return ans;
    }
}
class Solution2 {
    public int[] productExceptSelf(int[] nums) {
        int ans[]=new int[nums.length];
        int suff[]=new int [nums.length];
        int pre[]=new int[nums.length];
        pre[0]=1;
        suff[nums.length-1]=1;
        for(int i=1;i<nums.length;i++){
            pre[i]=pre[i-1]*nums[i-1];
        }
        for(int i=nums.length-2;i>=0;i--){
            suff[i]=suff[i+1]*nums[i+1];
        }
        for(int i=0;i<nums.length;i++)
        ans[i]=pre[i]*suff[i];
        return ans;
    }
}
class Solution{
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        Arrays.fill(ans,1);
        int p=1;
        for(int i=0;i<n;i++){
            ans[i]*=p;
            p*=nums[i];
        }
        p=1;
        for(int i=n-1;i>=0;i--){
            ans[i]*=p;
            p*=nums[i];
        }
        return ans;
    }
}