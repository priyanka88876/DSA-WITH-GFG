//Back-end complete function Template for Java
import java.util.*;

public class Solution {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =0;
        while(n!=0){
            int rem = n%10;
            count++;
            n= n/10;
        }
        System.out.print(count);
    
    }
}