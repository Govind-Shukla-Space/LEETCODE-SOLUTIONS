class Solution {
    int fun(String s1[],String s2[]){
        int a1=Integer.parseInt(s1[0]);
        // a1=a1>=12?a1-12:a1;
        int a2=Integer.parseInt(s1[1]);
        int t1=(a1*60)+a2;
        int b1=Integer.parseInt(s2[0]);
        // b1=b1>=12?b1-12:b1;
        int b2=Integer.parseInt(s2[1]);
        int t2=(b1*60)+b2;
        System.out.println(a1+" "+a2+" "+b1+" "+b2);
        return Math.min(Math.abs(t2-t1),1440-Math.abs(t2-t1));
    }
    public int findMinDifference(List<String> timePoints) {
        
        int n=timePoints.size();
        Collections.sort(timePoints);
        int mi=fun(timePoints.get(0).split(":",2),timePoints.get(n-1).split(":",2));
        for(int i=0;i<n-1;i++){
            mi=Math.min(mi,fun(timePoints.get(i).split(":",2),timePoints.get(i+1).split(":",2)));
        }
        return mi;
    }
}