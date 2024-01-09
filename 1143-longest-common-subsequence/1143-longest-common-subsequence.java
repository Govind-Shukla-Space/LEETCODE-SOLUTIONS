class Solution1 {//from starting
    int solve(String s1,String s2,int i,int j,int n1,int n2){
        if(i>=n1||j>=n2)
        return 0;
        if(s1.charAt(i)==s2.charAt(j))
        return 1+solve(s1,s2,i+1,j+1,n1,n2);
        else
        return Math.max(solve(s1,s2,i,j+1,n1,n2),solve(s1,s2,i+1,j,n1,n2));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n1=text1.length();
        int n2=text2.length();
        return solve(text1,text2,0,0,n1,n2);
    }
}
class Solution2 {//same as 1st but asking at index i what is number of sequence till i
    int solve(String s1,String s2,int i,int j){
        if(i<0||j<0)
        return 0;
        if(s1.charAt(i)==s2.charAt(j))
        return 1+solve(s1,s2,i-1,j-1);
        else
        return Math.max(solve(s1,s2,i,j-1),solve(s1,s2,i-1,j));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n1=text1.length();
        int n2=text2.length();
        return solve(text1,text2,n1-1,n2-1);
    }
}
class Solution3 {//using hashmap -->tle
    HashMap<Pair,Integer> map;
    int solve(String s1,String s2,int i,int j){
        if(i<0||j<0){
            map.put(new Pair(i,j),0);
            return 0;
        }
        if(map.containsKey(new Pair(i,j)))
        return map.get(new Pair(i,j));
        
        if(s1.charAt(i)==s2.charAt(j)){
            map.put(new Pair(i,j),1+solve(s1,s2,i-1,j-1));
            return map.get(new Pair(i,j));
        }
        else{
            map.put(new Pair(i,j),Math.max(solve(s1,s2,i,j-1),solve(s1,s2,i-1,j)));
            return map.get(new Pair(i,j));
        }
    }
    public int longestCommonSubsequence(String text1, String text2) {
        map=new HashMap<Pair,Integer>();
        int n1=text1.length();
        int n2=text2.length();
        return solve(text1,text2,n1-1,n2-1);
    }
}
class Solution4 {//using dp
    int solve(String s1,String s2,int i,int j,int arr[][]){
        // System.out.println(i+" "+j);
        if(i<0||j<0){
            return 0;
        }
        if(arr[i][j]!=-1)
        return arr[i][j];
        if(s1.charAt(i)==s2.charAt(j)){
            arr[i][j]=1+solve(s1,s2,i-1,j-1,arr);
            return arr[i][j];
        }
        else{
            arr[i][j]=Math.max(solve(s1,s2,i,j-1,arr),solve(s1,s2,i-1,j,arr));
            return arr[i][j];
        }
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n1=text1.length();
        int n2=text2.length();
        int arr[][]=new int[n1+1][n2+1];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++)
            arr[i][j]=-1;
        }
        return solve(text1,text2,n1-1,n2-1,arr);
    }
}
class Solution5 {//using tlb from start
    public int longestCommonSubsequence(String text1, String text2) {
        int n1=text1.length();
        int n2=text2.length();
        int arr[][]=new int[n1+1][n2+1];
        for(int i=0;i<arr.length;i++)
            arr[i][0]=0;
        for(int i=0;i<arr[0].length;i++)
            arr[0][i]=0;
        for(int i=1;i<arr.length;i++){
            for(int j=1;j<arr[0].length;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1))
                    arr[i][j]=1+arr[i-1][j-1];
                else
                    arr[i][j]=Math.max(arr[i-1][j],arr[i][j-1]);
            }
        }
        return arr[n1][n2];
    }
}
class Solution {//using tlb end
    public int longestCommonSubsequence(String text1, String text2) {
        int n1=text1.length();
        int n2=text2.length();
        int arr[][]=new int[n1+1][n2+1];
        for(int i=0;i<arr.length;i++)
            arr[i][n2]=0;
        for(int i=0;i<arr[0].length;i++)
            arr[n1][i]=0;
        for(int i=n1-1;i>=0;i--){
            for(int j=n2-1;j>=0;j--){
                if(text1.charAt(i)==text2.charAt(j))
                    arr[i][j]=1+arr[i+1][j+1];
                else
                    arr[i][j]=Math.max(arr[i+1][j],arr[i][j+1]);
            }
        }
        return arr[0][0];
    }
}