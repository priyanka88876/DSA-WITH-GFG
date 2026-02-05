import java.util.*;

public class Solution {
    public static void main(String args[]) {
        // Your Code Here
                Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int base = 0 , current =1;
        if(n==0){
            System.out.println(0);
            return;
        }
        while(n-- >1){
            current = base + current;
            base = current - base;
        }
        System.out.println(current);
    }
}