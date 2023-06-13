class Solution {
    public int equalPairs(int[][] grid) {
        int n=grid.length;
        int c=0,count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                c=0;
                for(int k=0;k<n;k++){
                    if(grid[i][k]==grid[k][j])
                        c++;
                }
                if(c==n)
                    count++;    
            }
            
        }
        return count;
    }
}