/* The structure of linked list is the following
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    // Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) {
        // Your code here
         if(head == null || head.next == null) return head;
        
        HashSet<Integer> st = new LinkedHashSet<>();
        Node curr = head;
        Node prev = head;
        Node begin = null;
        
        while(curr != null) {
            if(!st.contains(curr.data)) {
                prev.data = curr.data;
                begin = prev;
                prev = prev.next;
                st.add(curr.data);
            }
            curr = curr.next;
        }
        
        begin.next = null;
        return head;
    }
 


    
}