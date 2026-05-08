class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
         if(arr.length == 0) return new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        int j=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[j]){
                j++;
                arr[j]=arr[i];
            }
        }
        for(int x=0;x<j+1;x++) res.add(arr[x]);
        return res;
 
    }
}
