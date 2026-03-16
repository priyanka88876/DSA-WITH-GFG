class Solution {
    public int countDigits(int n) {
        // code here
    if(Math.abs(n)<10)
            return 1;
            return countDigits(n/10)+1;
        
    }
}
