
package baglilisteımpl;

public class Node {
    int data;
    Node next;
    Node prev;
    
    public Node(int d){
        data=d;
        next=null;
        prev=null;
    }

    @Override
    public String toString() {
        return "["+ data +"," + next + "]";
    }
    
}
