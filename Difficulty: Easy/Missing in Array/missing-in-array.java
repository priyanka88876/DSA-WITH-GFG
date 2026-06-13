class Solution {
    int missingNum(int arr[]) {
        // code here
          int n = arr.length,xor = 0;
        for(int a : arr) xor ^= a;
        for(int i=1; i<=n+1; i++) xor^=i;
        return xor;
    }
}

