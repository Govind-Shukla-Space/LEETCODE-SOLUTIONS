class Solution {
    public int[][] generateMatrix(int n) {
        int r1=0,r2=n-1,c1=0,c2=n-1,k=1;
        int arr[][]=new int[n][n];
        while (r2>=r1 &&c2>=c1){
            for(int i=c1;i<=c2;i++)
            arr[r1][i]=k++;
            r1++;
            for(int i=r1;i<=r2;i++)
            arr[i][c2]=k++;
            c2--;
            if(r1<=r2){
                for(int i=c2;i>=c1;i--)
                arr[r2][i]=k++;
                r2--;
            }
            if(c1<=c2){
                for(int i=r2;i>=r1;i--)
                arr[i][c1]=k++;
                c1++;
            }
        }
        return arr;
    }
}