//Back-end complete function Template for Java

class Solution {
    public static void freqSorted(int arr[]) {
        // Your Code Here
        HashMap<Integer,Integer> map = new HashMap<>();
        for ( int i : arr ) {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for ( int num : map.keySet() ) {
            System.out.println(num+" "+map.get(num));
        }

    }
}