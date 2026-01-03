// User function Template for Java

class Solution {
    static int isFactorial(int N) {
        // code here
        int i = 1;
        int fact = 1;
        while(fact < N){
            i++;
            fact = fact*i;
        }
        if(fact ==N){
            return 1;
        }
        else {
            return 0;
        }
    }
}