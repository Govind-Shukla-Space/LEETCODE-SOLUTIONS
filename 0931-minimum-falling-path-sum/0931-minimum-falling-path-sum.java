class Solution {
    
    public int minFallingPathSum(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=m-2;i>=0;i--){
            for(int j=0;j<n;j++){
                if(j==0){
                    if(j+1<n)
                        matrix[i][j]=Math.min(matrix[i+1][j],matrix[i+1][j+1])+matrix[i][j];
                    else
                        matrix[i][j]=matrix[i][j];
                }
                else if(j==n-1){
                    matrix[i][j]=Math.min(matrix[i+1][j],matrix[i+1][j-1])+matrix[i][j];
                }
                else
                    matrix[i][j]=Math.min(matrix[i+1][j-1],Math.min(matrix[i+1][j],matrix[i+1][j+1]))+matrix[i][j];
            }
        }
        int ma=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            ma=Math.min(matrix[0][i],ma);
        }
        return ma;
    }
}