import java.util.*;

public class Solution {
    public static void solve() {
        // Your Code Here
         
    
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        scn.close();
        
        if(a > 100)
            System.out.println("Big");
        else if(a < 10)
            System.out.println("Small");
        else
            System.out.println("Number");
 
    }
}