class Solution {
    public int consecutiveNumbersSum(int n) {
        int c=0;
        int i=1;
        while((2*n)-(i*(i-1))>0){
            if (((n-(i*(i-1)/2))%i)==0)
            c+=1;
            i++;
        }
        return c;
    }
}