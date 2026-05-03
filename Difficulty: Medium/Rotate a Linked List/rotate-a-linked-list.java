/*
class Node {
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
   }
}
*/

class Solution {
    public Node rotate(Node head, int k) {
        // code here
        if (head==null) return head;
        Node curr=head;
        int l=0;
        while(curr!=null)
        {
            l+=1;
            curr=curr.next;
        }
        k=k%l;
        if(k==0) return head;
        curr=head;
        for(int i=1;i<k;i++)
        {
          curr=curr.next;  
        }
        Node newNode=curr.next;
        curr.next=null;
        Node temp=newNode;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=head;
        return newNode;
    }

}
    