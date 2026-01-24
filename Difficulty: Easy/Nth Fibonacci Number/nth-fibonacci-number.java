class Solution {
    public int nthFibonacci(int n) {
        // code here
        if(n ==0 || n ==1){
            return n;
        }
        int prev = nthFibonacci(n-1);
        int prevprev = nthFibonacci(n-2);
        return prev+prevprev;
        
        
    }
}