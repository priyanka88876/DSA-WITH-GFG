class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        for(int num : a)
        {
            al.add(num);
        }
        for(int num : b)
        {
            al.add(num);
        }
        
       Collections.sort(al);
       return al.get(k - 1);
    }
}