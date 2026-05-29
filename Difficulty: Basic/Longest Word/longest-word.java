class Solution {
    public String longest(List<String> arr) {
        // code here
         String max = arr.get(0);
        
        for(String i : arr){
            
            if(i.length() > max.length()){
                
                max = i;
            }
        }
        
        return max;
    
    }
}
