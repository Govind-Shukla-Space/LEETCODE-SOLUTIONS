class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> r=new ArrayList<Integer>();
        ArrayList<Integer> c=new ArrayList<Integer>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    r.add(i);
                    c.add(j);
                }
            }
        }
        for(int i=0;i<r.size();i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[r.get(i)][j]=0;
            }
        }
        for(int i=0;i<c.size();i++){
            for(int j=0;j<matrix.length;j++){
                matrix[j][c.get(i)]=0;
            }
        }
    }
}