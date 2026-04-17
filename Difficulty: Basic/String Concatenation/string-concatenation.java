// User function Template for Java
class Solution {
    public static String concatenateStrings(ArrayList<String> arr) {
        // Your code here
        return arr.stream()
             .reduce((x,y)->{return x+y;})
             .get();
   
    }
}