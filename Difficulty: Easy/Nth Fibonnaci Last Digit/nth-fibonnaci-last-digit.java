// User function Template for Java

class Solution {
    static int fib(int N) {
        // code here
          int f = 0; 
        int g = 1;
        int i =2 ,n2= -1;
        if (N == 0 || N == 1)
        {
            return N;
        }

        while(i <= N)
        {
            n2 = (f + g) %10 ;
            f = g;
            g = n2;
            
            
            i++;
        }
        int n3 = n2 ;
        
        return n3 %10;
    
        
    }
}