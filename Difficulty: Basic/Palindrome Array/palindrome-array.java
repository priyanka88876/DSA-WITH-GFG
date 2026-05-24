class Solution {
    public static boolean isPalindrome(int[] arr) {
        // code here
           int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // If elements at both ends don't match, it's not a palindrome
            if (arr[left] != arr[right]) {
                return false;
            }
            // Move pointers towards the center
            left++;
            right--;
        }
        
        return true;
 
    }
}
