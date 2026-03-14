// User function Template for Java
class Solution {
    public static void square(int s) {
        // Complete the code given below
                if(s == 1)
            System.out.println("*");
        else
        {
            System.out.println("* ".repeat(s));
            for(int i=0; i<s-2; i++)
                System.out.println("*" + "  ".repeat(s-2) + " *");
            System.out.println("* ".repeat(s));
        }
    }
}
