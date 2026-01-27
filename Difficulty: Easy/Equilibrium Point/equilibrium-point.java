class Solution {
    public static int findEquilibrium(int arr[]) {
        // code here
                int sum = 0;
        int leftsum = 0;
        for(int i= 0;i<arr.length;i++) {
            sum += arr[i];
        }
        for(int i = 0;i<arr.length;i++) {
            sum-= arr[i];
            if(leftsum == sum ) {
                return i;
            }
            leftsum += arr[i];
        }
        return -1;

    }
}
