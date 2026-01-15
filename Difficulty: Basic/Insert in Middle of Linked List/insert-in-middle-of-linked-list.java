/*
Structure of node class is:
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    public Node insertInMiddle(Node head, int x) {
        // Code here
          Node temp=new Node(x);
        if(head==null)
          head=temp;
        else{
            Node r=head;
            int count=0;
            while(r!=null){
              r=r.next;
                count++;
            }
            Node v=head;
            int mid=(count+1)/2;
            while(--mid!=0){
            // System.out.println(mid);
                v=v.next;
            }
              temp.next=v.next;
              v.next=temp;
        }
        return head;
    
        }
}