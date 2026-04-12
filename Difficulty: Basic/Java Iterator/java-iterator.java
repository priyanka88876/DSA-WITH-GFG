

class Solution {
    static ArrayList<Integer> javaIterator(int n, int k, int[] arr) {
        // code here
         ArrayList<Integer>list=new ArrayList<>();
        for(int num:arr){
            if(num>=k)list.add(num);
        }
        Collections.sort(list);
        return list;
    }
 };