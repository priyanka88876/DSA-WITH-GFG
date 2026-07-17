class Solution {
    static String removeChars(String str1, String str2) {
        // code here
         String result=" ";
        for(char c : str1.toCharArray()){
            if(! str2.contains(String.valueOf(c))){
                result+=c;
            }
        }
        return result;
  
    }
}