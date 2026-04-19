// User function Template for Java

class Solution {
    public static int max_toys(int arr[], int k) {
        // Your code here
 Arrays.sort(arr);
        int cnt=0;
        
        for(int i:arr){
            if (k>0 && k-i>=0){
                cnt++;
                k-=i;
            }
            else{
                break;
            }
        }
        return cnt;
   
    }
}