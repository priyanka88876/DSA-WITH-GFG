/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
                ArrayList<Integer> list = new ArrayList<>();
        Node temp = head;
        while(temp!=null){
            list.add(temp.data);
            temp = temp.next;
        }
        Collections.sort(list);
        Node finalList = new Node(list.get(0));
        Node merged = finalList;
        for(int i=1;i<list.size();i++) {
            Node current = new Node(list.get(i));
            finalList.next = current;
            finalList = finalList.next;
        }
        return merged;

    }
}