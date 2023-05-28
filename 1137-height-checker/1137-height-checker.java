class Solution {
    public int heightChecker(int[] heights) {
        int m=heights[0];//finding maximum element
        for(int i=0;i<heights.length;i++)
        if (heights[i]>m)
        m=heights[i];
        int arr[]=new int[m+1];
        int exp[]=new int[heights.length];
        int k=0;
        for (int i=0;i<heights.length;i++)//storing frequency
        arr[heights[i]]+=1;
        for(int i=0;i<arr.length;i++){//creating sorted array 
            while(arr[i]!=0){
                exp[k++]=i;
                arr[i]-=1;

            }
        }
        int count=0;
        for(int i=0;i<exp.length;i++)
        {
            if(exp[i]!=heights[i])//height checking
            count+=1;
        }
        return count;
    }
}