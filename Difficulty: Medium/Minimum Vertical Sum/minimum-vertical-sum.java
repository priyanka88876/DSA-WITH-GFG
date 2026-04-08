class Solution {
    public int minimum_vertical_sum(ArrayList<ArrayList<Integer>> arr, int n) {
        // code here
           int result=Integer.MAX_VALUE;
    int maxSize=0;
    //finding the max no. of columns.
    for (ArrayList innerList : arr) {
        maxSize = Math.max(maxSize, innerList.size());
    }
    //initialising the ArrayList with 0.
     ArrayList<Integer> ali = new ArrayList<>(Collections.nCopies(maxSize, 0));
    //finding the sum of the columns. 
    for(List<Integer> li:arr){
         int j=0;
        for(Integer i : li){
           
            ali.set(j,ali.get(j) +i);
            j++;
        }
    }
    //System.out.println(ali);
    for(Integer i: ali){
        if(i<result) 
        result=i;
    }
    return result;    
        
    }
}