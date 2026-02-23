// User function Template for Java

class Solution {
    public static int getMaxVal(int arr[], int k) {
        // Your code here
                int n = arr.length;
       PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
       for(int i=0;i<n;i++){
           pq.add(arr[i]);
       }
       int sum = 0;
       for(int i=0;i<k;i++){
           int res = pq.remove();
           sum +=res;
       }
       return sum;

    }
}