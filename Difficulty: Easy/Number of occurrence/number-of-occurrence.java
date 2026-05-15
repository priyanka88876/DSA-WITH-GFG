class Solution {
    int countFreq(int[] arr, int target) {
        // code here
         int count = 0;
        for (int x : arr){
            if (x == target) count++;
        }
        return count;
   
    }
}
