class Solution1 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat[0].length*mat.length!=r*c)
        return mat;
        int arr[][]=new int[r][c];
        
        int q=0,w=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                System.out.println(w);
                
                if(w==c){
                    w=0;
                    q+=1;
                }
                if(q!=r)
                arr[q][w++]=mat[i][j];
            }
        }

        return arr;
    }
}
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat[0].length*mat.length!=r*c)
        return mat;
        int arr[]=new int[r*c];
        int k=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++)
            arr[k++]=mat[i][j];
        }
        int b[][]=new int[r][c];
        k=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                b[i][j]=arr[k++];
            }
        }
        return b;
    }
}