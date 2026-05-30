class Solution {
    public static ArrayList<Integer> prevSmaller(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int n=arr.length;
        Stack<Integer> s = new Stack<>();
        s.push(-1);
        for (int i = 0; i < n; i++) ans.add(-1);
        for(int i=0;i<n;i++){
            while(s.size()>0 && s.peek()>=arr[i]){
                s.pop();
                // System.out.print(arr[i]+" ");
            }
            if(s.size()>0){
                ans.set(i,s.peek());
            }
            s.push(arr[i]);
        }
        return ans;
    }
}