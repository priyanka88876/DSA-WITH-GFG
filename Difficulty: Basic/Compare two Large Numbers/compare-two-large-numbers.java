// User function Template for Java
class Solution {
    int check(String a, String b) {
        // your code here
        double sum1 = Double.parseDouble(a);
                double sum2 = Double.parseDouble(b);

        if(sum1 < sum2){
            return 1;
        }
           else if(sum1 > sum2){
                return 2;
            }
            else{
                return 3;
            }
        
    }
}