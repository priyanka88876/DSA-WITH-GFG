class Solution {
    public static int findPattern(String s, String p) {
        // code here
           int n = s.length();
        int m = p.length();
        
        // Edge case: pattern empty hai
        if (m == 0) return 0;
        
        // Edge case: pattern string se bada hai
        if (m > n) return -1;
        
        // Check har possible starting position
        for (int i = 0; i <= n - m; i++) {
            int j;
            
            // Check if pattern matches starting at position i
            for (j = 0; j < m; j++) {
                if (s.charAt(i + j) != p.charAt(j)) {
                    break; // Mismatch found
                }
            }
            
            // Agar poora pattern match ho gaya
            if (j == m) {
                return i; // First occurrence ka index
            }
        }
        
        return -1; // Pattern not found
    
    }
}
