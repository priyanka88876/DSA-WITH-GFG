// User function Template for Java

class Solution {
    static String getLine(int a, int b, int c, int d) {
        // code he
         if(a!=c) {
            int x1=d-b, y1=a-c, t=b*(a-c)+a*(d-b);
            String s=String.valueOf(x1)+"x";
            if(y1>0) s+="+";
            s+=String.valueOf(y1)+"y"+"="+String.valueOf(t);
            return s;
        }
        else if(b!=d) {
            String s="x="+String.valueOf(a);
            return s;
        }
        else {
            return "0x+0y=0";
        }

    }
}