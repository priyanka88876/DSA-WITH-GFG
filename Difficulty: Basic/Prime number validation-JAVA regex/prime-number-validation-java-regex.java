

class Solution {
    public int isPrime(int N) {
        // code here
         for(int i=2;i<=Math.sqrt(N);i++){
            if (N%i==0){
                return 0;
            }
        }
           return N==1?0:1;


 
    }
}