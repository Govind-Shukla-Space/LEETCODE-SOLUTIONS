class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int l=coordinates.length;
        int y1=coordinates[0][1];
        int x1=coordinates[0][0];
        int y2=coordinates[1][1];
        int x2=coordinates[1][0];
        int y3,x3;
        for(int i=1;i<l;i++){
            x3=coordinates[i][0];
            y3=coordinates[i][1];
            if((x3-x1)*(y2-y1)!=(y3-y1)*(x2-x1))
            return false;
        }
        return true;
    }
}