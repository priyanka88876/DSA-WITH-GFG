class Solution {
    public ArrayList<Integer> topKFreq(int[] arr, int k) {
        // Code here
          HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }
        
        PriorityQueue<int[]> minHeap =
            new PriorityQueue<>((a,b) -> a[1] != b[1] ? a[1] - b[1] : a[0] - b[0]);
        for(HashMap.Entry<Integer, Integer> entry : freq.entrySet()){
            minHeap.add(new int[]{entry.getKey(), entry.getValue()});
            
            if(minHeap.size() > k){
                minHeap.poll();
            }
            
        }
        int[] temp = new int[k];
        for(int i = k-1; i>=0; i--){
             temp[i] = minHeap.poll()[0];
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        for(int x : temp){
            ans.add(x);
        }
        return ans;
  
    }
}
