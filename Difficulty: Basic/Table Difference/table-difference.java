import java.util.*;

public class Solution {
    public static void main(String args[]) {
        // Your Code Here
         Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        for(int i =1; i<=10; i++){
            int difference = (n1*i) - (n2*i);
            System.out.print(difference + " ");
        }
       
    }
}