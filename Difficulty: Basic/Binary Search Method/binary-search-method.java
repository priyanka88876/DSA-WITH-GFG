// User function Template for Java
class Solution {
    public static int binarySearchArray(int arr[], int k) {
        // Your code here
                int l =0;
        int h = arr.length-1;
        while(l<=h){
            int m = l + (h-l)/2;
            if(arr[m]== k){
                return m;
            }
            if(arr[m]< k){
             l = m +1;
            }
             else{
             h=m-1;
             }
        }
        return -1;
        
    }
}