class Solution {
    void mult(int m,int n,int indices[],int mat[][])
    {
        for(int k=0;k<n;k++)
        {
            mat[indices[0]][k]+=1;
        }
        for(int l=0;l<m;l++)
        {
            mat[l][indices[1]]+=1;
        }
    }
    public int oddCells(int m, int n, int[][] indices) {
        int[][] mat = new int[m][n];
        int c=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j]=0;
            }
        }
        for(int i=0;i<indices.length;i++)
        {
            mult(m,n,indices[i],mat);
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if (mat[i][j]%2!=0)
                c+=1;
            }

        }
         return c;
    }
          
        
}