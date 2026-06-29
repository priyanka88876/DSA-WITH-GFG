class Solution {
    // Function to partition the array around the range such
    // that array is divided into three parts.
    public void threeWayPartition(int arr[], int a, int b) {
        // code here
         ArrayList<Integer> ar = new ArrayList<>();
        for (int i : arr) if ( i < a) ar.add(i);
        for (int i : arr) if (i >= a && i <= b) ar.add(i);
        for (int i : arr) if(i>b) ar.add(i);
        
        for (int j = 0; j < ar.size(); j++){
            arr[j] = ar.get(j);
        }
    }
}

