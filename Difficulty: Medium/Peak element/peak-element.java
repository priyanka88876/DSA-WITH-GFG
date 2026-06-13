class Solution {
    public int peakElement(int[] arr) {
        // code here
         if(arr.length == 1)return 0;
        
        for (int i = 0 ; i < arr.length; i++){
            if(i == 0){
                if(arr[0]>arr[1])return i;
            }
            else if(i == arr.length - 1){
                if(arr[arr.length - 1]>arr[arr.length - 2])return i;
            }
            else{
                if(arr[i]>arr[i+1] && arr[i]>arr[i-1])return i;
                
            }
        }
        return 0;
     
    }
}