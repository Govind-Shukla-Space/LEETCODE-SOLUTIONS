class Solution {
    public int uniquePaths(int M, int N) {
        int arr[][]=new int[M][N];
        for(int i=0;i<M;i++){
            arr[i][N-1]=1;
        }
        for(int i=0;i<N;i++){
            arr[M-1][i]=1;
        }
        
        for(int i=M-2;i>=0;i--){
            for(int j=N-2;j>=0;j--){
                arr[i][j]=arr[i][j+1]+arr[i+1][j];
            }
        }
        return arr[0][0];
    }
}