// User function Template for Java
class Solution {
    public static int countOnce(int arr[]) {
        // Your code here
         Set<Integer> unique = new HashSet<>();
        for (int num : arr) {
            unique.add(num);
        }
        return unique.size();

    }
}
