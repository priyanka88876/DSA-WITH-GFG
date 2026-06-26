class Solution {
    public void binSort(int[] arr) {
        // code here
           int first=0;
        int last=arr.length-1;
        
        while(first < last){
            if(arr[first] > arr[last]){
                
                int temp=arr[first];
                arr[first]=arr[last];
                arr[last]=temp;
            }
            if(arr[first]==0){
                first++;
            }else{
            
                last--;
 
            }
        }
  
    }
};
