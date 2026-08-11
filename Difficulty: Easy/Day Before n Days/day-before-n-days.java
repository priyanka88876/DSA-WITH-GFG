class Solution {
    public int nthDay(int d, int n) {
        // code here
          int back = n % 7;
        int result = (d - back + 7) % 7;
        
        return result;
  
    }
}