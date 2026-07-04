class Solution {
    String removeDuplicates(String s) {
         HashSet<Character> set = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();
        
        char character[] = s.toCharArray();
        
        for(int i =0 ;i<character.length;i++){
            set.add(character[i]);
        }
        
        for(char val:set){
            sb.append(val);
        }
        
        return sb.toString();

    }
}
