class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long l=chalk.length;
        long sum=0;
        for(int i=0;i<l;i++)
            sum+=chalk[i];
        long r=k%sum;
        for(int i=0;i<l;i++){
            if(r<chalk[i])
                return i;
            r-=chalk[i];
        }
        return -1;
    }
}