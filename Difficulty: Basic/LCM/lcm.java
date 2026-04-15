// User function Template for Java
class Solution {
    public static int LCM(int a, int b) {

        // write your code here
         if(a < b)
        {
            int temp = a;
            a = b;
            b = temp;
        }
        
        int l = a;
        while(a % b != 0)
        {
            a = a + l;
        }
        
        return a;
    

        // return LCM of a and b
    }
}