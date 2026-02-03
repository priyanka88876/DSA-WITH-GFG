class Solution {
    static void printTillN(int N) {
        // code here
                fun(N);
    }
    public static void fun(int N){
        if(N==0){
            return;
        }
        fun(N-1);
        System.out.print(N+" ");
      

    }
}