// User function Template for Java
class Solution {
    public static void triangleWall(int s) {

        // Write your code here
          for(int i=0;i<s;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
          }
 
    }
}