// User function Template for Java

class Solution {
    public static String TieBreak(String arr[]) {
        // Your code here
          Map<String, Integer> map = new HashMap<>();
        for(String name : arr){
            map.put(name, map.getOrDefault(name, 0) + 1);
        }
        String winner = "";
        int max = 0;
        
        for(String name: map.keySet()){
            int votes = map.get(name);
            if(votes > max || (votes == max && name.compareTo(winner) < 0)){
                winner = name;
                max = votes;
            }
        }
        return winner;
    
        
    }
}