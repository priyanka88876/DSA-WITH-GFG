
class Solution {
    public int countOfElements(int x, List<Integer> arr) {
        // code here
          int count = 0;
        for(int arr1:arr){
            if(arr1<=x){
                count+=1;
            }
        }
        return count;

    }
}