class Solution {
    int dir[][]={{0,1},{0,-1},{-1,0},{1,0}};
    void fun(int i,int j,int grid[][],int vis[][],int c){
        vis[i][j]=1;
        ma=Math.max(ma,c);
        // System.out.print(c);
        for(int a[]:dir){
            int i1=i+a[0];
            int j1=j+a[1];
            if(i1<=m-1&&i1>=0&&j1<=n-1&&j1>=0&&grid[i1][j1]!=0&&vis[i1][j1]==0){
                // System.out.print(c);
                fun(i1,j1,grid,vis,c+grid[i1][j1]);
            }
        }
        vis[i][j]=0;
    }
    int m,n,ma;
    public int getMaximumGold(int[][] grid) {
        m=grid.length;
        n=grid[0].length;
        ma=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]!=0){
                    int vis[][]=new int[m][n];
                    fun(i,j,grid,vis,grid[i][j]);
                }
            }
        }
        return ma;
    }
}