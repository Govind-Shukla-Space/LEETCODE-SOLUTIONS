class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int idx=-1,k=matrix[0].length;
        for(int i=0;i<matrix.length;i++){
            if(target<=matrix[i][k-1])
            {
                idx=i;
                break;
            }
        }
        if(idx==-1)
        return false;
        int l=0,h=k-1;
        while(l<=h){
            int mid=(int)(l+(h-l)/2);
            if(matrix[idx][mid]==target)
            return true;
            if(target<matrix[idx][mid])
            h=mid-1;
            else
            l=mid+1;
        }
        return false;
    }
}