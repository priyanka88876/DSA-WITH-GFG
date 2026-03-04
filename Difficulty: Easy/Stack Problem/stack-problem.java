// User function Template for Java

class Solution{
    static Stack<Integer> deleteMid(int n, Stack<Integer> st)
    {
        //code here 
        deleteMiddle(st,0,n);
        return st;
    }
     static void deleteMiddle(Stack<Integer> st, int current, int size) {
        if (current == size / 2) {
            st.pop();
            return;
        }
        int top = st.pop();
        deleteMiddle(st, current + 1, size);
        st.push(top);
       
    }
}