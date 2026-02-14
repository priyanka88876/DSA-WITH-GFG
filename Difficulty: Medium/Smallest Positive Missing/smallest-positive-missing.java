class Solution {
    public int missingNumber(int[] arr) {
        // code here
        Set<Integer> set = new HashSet<>();
        for(int i: arr){
            if(i<=0) continue;
            
            set.add(i);
        }
        int i=1;
        while(true){
            if(!set.contains(i)) return i;
            i++;
        }
    }
}
