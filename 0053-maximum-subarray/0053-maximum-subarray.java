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
class Solution {
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