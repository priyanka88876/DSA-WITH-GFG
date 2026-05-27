class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        // Your code here
          PriorityQueue<Integer>pq=new PriorityQueue<>(); // min-heap
        for (int num : arr){
            pq.add(num);
            if (pq.size()>k){
                pq.poll(); // remove smallest
            }
        }

        // Now pq contains k largest elements, but not sorted
        ArrayList<Integer>res=new ArrayList<>(pq);
        res.sort(Collections.reverseOrder()); // sort in decreasing order
        return res;

   
    }
}
