// User function Template for Java
class Solution {
    public static int LCM(int a, int b) {

        // write your code here
          int p = a, q = b;
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return (p * q) / a;
    

        // return LCM of a and b
    }
}