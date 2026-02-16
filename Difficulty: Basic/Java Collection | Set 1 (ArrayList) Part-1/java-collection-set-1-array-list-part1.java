class Solution {
    ArrayList<Integer> solve(int N, ArrayList<Integer> A, int Q,
                             ArrayList<Integer> Query) {
        // code here
          ArrayList<Integer> ans = new ArrayList<>();
        if(Q==1){
            int p = Query.get(0);
            int r = Query.get(1);
            A.add(p,r);
            return A;
        }
        else{
            int p = Query.get(0);
            int lastIndex = A.lastIndexOf(p);
            ans.add(lastIndex);
        }
        return ans;
    
    }
}