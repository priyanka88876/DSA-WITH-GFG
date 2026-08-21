class Solution {
  public:
    int setBit(int n) {
        // code here
        int result=1;
        while((result&n)!=0){
            result=result<<1;

        }
        n=(n|result);
        return n;

    }
};