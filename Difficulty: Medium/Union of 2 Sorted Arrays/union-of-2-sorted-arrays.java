class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
         TreeSet<Integer> set= new TreeSet<>();
       
        for(int it:a)
        {
            set.add(it);
        }
        for(int x:b)
        {
            set.add(x);
        }
        return new ArrayList<>(set);
   
    }
}
