import java.util.*;

public class Solution {
    public static void main(String args[]) {
        // Your Code Here
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       String res = "True";
        if(n <= 1) {
            res  = "False";        }
        for(int i = 2; i<n; i++){
            if(n%i==0){
             res = "False";
            }
    }
    
    System.out.println(res);

    }
}