class Solution {
    public static int fibonacci(int n) {
        // Write your code here to calculate
        // to calculate the nth fibonacci number
         int a = 0, b = 1, c;
        
        while(n > 0)
        {
            c = a+b;
            a = b;
            b = c;
            
            n--;
        }
        
        return a;

    }
}
