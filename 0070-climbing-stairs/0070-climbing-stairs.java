class Solution1 {
    public int climbStairs(int n) {
        if(n==1)
        return 1;
        if(n==2)
        return 2;
        return climbStairs(n-1)+climbStairs(n-2);
    }//tle
}
class Solution2 {
    public int climbStairs(int n) {
        if(n==1)
        return 1;
        int arr[]=new int[n+1];
        arr[1]=1;
        arr[2]=2;
        for(int i=3;i<=n;i++)
        {
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
    }//O(n)
}

class Solution3 {//tle
    int count=0,n;
    void bt(int s){
        if(s==n)
        count++;
        else{
            bt(s+1);
            if(s+2<=n)
            bt(s+2);
        }
    }
    public int climbStairs(int n) {
        this.n=n;
        bt(0);
        return count;
    }
}
class Solution {
    public int climbStairs(int n) {
        if(n==1)
        return 1;
        if(n==2)
        return 2;
        int a=1,b=2,c=0;
        for(int i=0;i<n-2;i++)
        {
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
}