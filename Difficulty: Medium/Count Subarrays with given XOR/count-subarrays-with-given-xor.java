class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
          HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);
        int xor = 0;
        int count = 0;

        for(int j=0; j<arr.length; j++){
            xor ^= arr[j];
            if(map.containsKey(xor ^ k)) {
                count += map.get(xor ^ k);
            }
            map.put(xor, map.getOrDefault(xor, 0) + 1);
        }
        return count;
    
    }
}