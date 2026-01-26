class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
         ArrayList<Integer> al = new ArrayList<Integer>(); // to return not to use
        int n = arr.length;
        
        for(int i=0; i<arr.length; i++) {
            int idx = arr[i] % (n+1);
            if(arr[idx-1] > n) al.add(idx);
            else arr[idx-1] += n+1;
        }
        return al;
    }
}