class Solution {
    boolean fun(int i,int j,int arr[][]){
        int r=0,c=0;
        for(int col=0;col<arr[0].length;col++){
            if(arr[i][j]==1&&arr[i][col]==1)
            r++;
        }
        for(int row=0;row<arr.length;row++){
            if(arr[i][j]==1&&arr[row][j]==1)
            c++;
        }
        // System.out.println(r+" "+c);
        if(r==1 && c==1)
        return true;
        else
        return false;
    }
    public int numSpecial(int[][] mat) {
        int c=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if (fun(i,j,mat))
                c+=1;
            }
        }
        return c;
    }
}