class Solution {
    public List<String> winner(List<String> arr) {
        // code here
          
        HashMap <String,Integer> hm = new HashMap<>();
        for(String s : arr)
        {
            hm.put(s, hm.getOrDefault(s,0) + 1);
        }
        int max = Integer.MIN_VALUE;
        String maxKey = null;
        for(Map.Entry<String,Integer> entry : hm.entrySet())
        {
            int value = entry.getValue();
            String key = entry.getKey();

            if (value > max ||
               (value == max && key.compareTo(maxKey) < 0)) {

                max = value;
                maxKey = key;
            }
        }
        List <String> result = new ArrayList<>();
        result.add(maxKey);
        result.add(String.valueOf(max)); 
        return result;
   
    }
}
