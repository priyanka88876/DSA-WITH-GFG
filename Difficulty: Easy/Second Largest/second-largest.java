class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
                int largestNumber = 0;
        int secondLargestNumber = 0;
        for(int i=0; i< arr.length; i++) {
            if(arr[i] > largestNumber) {
                secondLargestNumber = largestNumber;
                largestNumber = arr[i];
            }
            if(secondLargestNumber < arr[i] && arr[i] != largestNumber) {
                secondLargestNumber = arr[i];
            }
        }
        return secondLargestNumber;
    }
}