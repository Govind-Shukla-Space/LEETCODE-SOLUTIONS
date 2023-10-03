class Solution {
    static class Pair{
        int x,y;
        public Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    int n1,m;
    void levelOrder(int i,int j,int newColor,int [][]image){
        int oldColor=image[i][j];
        image[i][j]=newColor;
        Queue<Pair> q=new LinkedList<Pair>();
        q.add(new Pair(i,j));
        while(!q.isEmpty()){
            Pair n=q.poll();
            int x=n.x;
            int y=n.y;
            if(x-1>=0 &&image[x-1][y]==oldColor){
                image[x-1][y]=newColor;
                q.add(new Pair(x-1,y));
            }
            if(y-1>=0 &&image[x][y-1]==oldColor){
                image[x][y-1]=newColor;
                q.add(new Pair(x,y-1));
            }
            if(x+1<=m-1 &&image[x+1][y]==oldColor){
                image[x+1][y]=newColor;
                q.add(new Pair(x+1,y));
            }
            if(y+1<=n1-1 && image[x][y+1]==oldColor){
                image[x][y+1]=newColor;
                q.add(new Pair(x,y+1));
            }
        }   

    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        m=image.length;n1=image[0].length;
        if(image[sr][sc]==newColor)
        return image;
        levelOrder(sr,sc,newColor,image);
        return image;
    }
}