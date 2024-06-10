class Solution {
    public int heightChecker(int[] heights) {
        int arr[]=new int[heights.length];
        for(int i=0;i<heights.length;i++)
            arr[i]=heights[i];
        Arrays.sort(arr);
        int c=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=arr[i])
                c+=1;
        }
        return c;
    }
}