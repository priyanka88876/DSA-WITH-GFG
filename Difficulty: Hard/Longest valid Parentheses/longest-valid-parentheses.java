class Solution {
    static int maxLength(String s) {
        // code here
         int res = 0;
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == '(') {
                st.push(i);
            } else {
                if (!st.isEmpty()) {
                    st.pop();
                }
                
                if (!st.isEmpty()) {
                    res = Math.max(res, i - st.peek());
                } else {
                    st.push(i);
                }
                
            }
        }
        return res;
     
    }
}