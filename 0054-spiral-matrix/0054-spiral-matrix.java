class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length,n=matrix[0].length;
        int r1=0,c1=0,r2=m-1,c2=n-1;
        ArrayList<Integer> arr=new ArrayList<Integer>();
        while(r1<=r2 && c1<=c2){
            for(int i=c1;i<=c2;i++){
                arr.add(matrix[r1][i]);
            }
            r1++;
            for(int j=r1;j<=r2;j++){
                arr.add(matrix[j][c2]);
            }
            c2--;
            if(r1<=r2)
            for(int i=c2;i>=c1;i--)
            {
                arr.add(matrix[r2][i]);
            }
            r2--;
            if(c1<=c2)
            for(int j=r2;j>=r1;j--)
            {arr.add(matrix[j][c1]);
            }
            c1++;
            
        }
        return arr;
    }
}