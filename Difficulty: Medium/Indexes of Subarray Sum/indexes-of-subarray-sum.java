
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
         ArrayList<Integer> result = new ArrayList<Integer>();
        int sum = 0;
        int l = 0;
        for(int r=0;r<arr.length;r++){
            sum += arr[r];
            while(sum>target && l<=r){
                sum -= arr[l];
                l++;
            }
            if(sum == target){
                result.add(l+1);
                result.add(r+1);
                return result;
            }
        }
        result.add(-1);
        return result;
        
   
    }
}
