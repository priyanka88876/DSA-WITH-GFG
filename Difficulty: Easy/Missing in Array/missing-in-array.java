class Solution {
    int missingNum(int arr[]) {
        // code here
           int len = arr.length;
        long n = len + 1;
        
        long sum = 0;
        for(int i = 0 ; i< len ; i++){
            sum = sum + arr[i];
        }
        
        long sn = (n*(n+1))/2;
        
        long mn = sn - sum;
        
        return (int)mn;
    }
}