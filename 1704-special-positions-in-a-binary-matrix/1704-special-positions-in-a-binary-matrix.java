class Solution {
    int m,n;
    boolean isSpecial(int i,int j,int[][] mat)
    {
        if (mat[i][j]!=1)
            return false ;
        for(int col=0;col<n;col++)
        {
            if (col!=j && mat[i][col]==1)
            return false;
        }
        for(int row=0;row<m;row++)
        {
            if (row!=i && mat[row][j]==1)
            return false;
        }
        return true;
    }
    public int numSpecial(int[][] mat) {
        m=mat.length;
        n=mat[0].length;
        int c=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
            if (isSpecial(i,j,mat))
            c+=1;
            }
        }
        return c;
    }
    
}