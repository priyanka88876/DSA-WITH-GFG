class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
          Stack<Integer> st = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {

            while(!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }

            if(st.isEmpty()) {
                res.add(i + 1);
            }
            else {
                res.add(i - st.peek());
            }

            st.push(i);
        }

        return res;
    }
}

