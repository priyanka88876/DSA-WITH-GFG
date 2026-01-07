class Solution {
    public static void reverseStack(Stack<Integer> st) {
        // code here
        if(st.isEmpty()){
             return;
        }
        int top =st.pop();
        reverseStack(st);
        pushAtBottom(st,top);
        
    }
    public static void pushAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()) {
            s.push(data);
            return;
        }
        int top =s.pop();
        pushAtBottom(s,data);
        s.push(top);
    
    }
}

