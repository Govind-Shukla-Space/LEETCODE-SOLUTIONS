class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int a=0,b=letters.length-1;
        if (letters[a]>target || target>=letters[b])
        return letters[0];
        while(a<=b){
            int mid=a+(b-a)/2;
            if(letters[mid]>target)
            b=mid-1;
            else
            a=mid+1;
        }
        
        return letters[a];
    }
}