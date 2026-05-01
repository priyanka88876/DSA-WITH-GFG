/*
class Node
{
    int data;
    Node next;
}
*/

class Solution {
    public static void removeLoop(Node head) {
        // code here
          Node fast = head;
        Node slow = head;
        
        // this node would point to the previous node of the slow.
        Node prev = null;
        
        
        // keep updating until you get the loop or the list finishes
        while(fast != null && fast.next != null){
            // updating the fast by two places
            fast = fast.next.next;
            
            // updating the prev pointer as the prev node of slow pointer
            
            prev = slow;
            
            // updating the slow pointer by one move.
            slow = slow.next;
            
            
            // if fast and slow becomes equal, that means, you got the loop
            if(fast == slow){ 
                Node start = head;
                
                // keep moving by one place until start and slow does not become equal
                while(start != slow){
                    prev = slow;
                    slow = slow.next;
                    start = start.next;
                }
                
                // at the moment they become equal, then make the next pointer of prev of slow as null.
                prev.next = null;
            }
        }
        
       
    }
}