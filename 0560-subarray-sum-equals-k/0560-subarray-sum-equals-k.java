class Solution1 {
    public int subarraySum(int[] nums, int k) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            int s=0;
            for(int j=i;j<nums.length;j++){
                s+=nums[j];
                if(s==k)
                c+=1;
            }
        }
        return c;
    }
}
class Solution2 {
    public int subarraySum(int[] nums, int k) {
        int pre[]=new int[nums.length+1];
        pre[0]=0;
        // pre[0]=nums[0];
        int c=0;
        for(int i=1;i<=nums.length;i++)
        pre[i]=nums[i-1]+pre[i-1];
        for(int i=0;i<pre.length;i++)
        System.out.print(pre[i]+" ");
        for(int i=0;i<pre.length;i++){
            for(int j=i+1;j<pre.length;j++){
                // System.out.println(pre[j]+" "+pre[i]);
                if((pre[j]-pre[i])==k)
                c+=1;
            }
        }
        // if(c==0)
        return c;
        // return c+1;
    }
}
class Solution {
    public int subarraySum(int[] nums, int k) {
        int pre[]=new int[nums.length+1];
        pre[0]=0;
        // pre[1]=nums[0];
        int c=0;
        for(int i=1;i<=nums.length;i++)
        pre[i]=nums[i-1]+pre[i-1];
        for(int i=0;i<pre.length;i++)
        System.out.print(pre[i]+" ");
        HashMap<Integer,Integer> set=new HashMap<Integer,Integer>();
        int sum=0;
        set.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if (set.containsKey(sum-k))
            {
                c+=set.get(sum-k);
            }
                set.put(sum,set.getOrDefault(sum,0)+1);
            // }
            // else{
            //     set.put(sum,0);
            // }
            // for(int j=i+1;j<pre.length;j++){
            //     System.out.println(pre[j]+" "+pre[i]);
            //     if((pre[j]-pre[i])==k)
            //     c+=1;
            // }
        }
        // if(c==0)
        return c;
        // return c+1;
    }
}
