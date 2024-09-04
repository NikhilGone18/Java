public class Linkedlist {
    public static class Node{
            int data;
            Node next;
            public Node(int data){
                this.data = data;
                this.next = null;
            }
    }
    public static Node head;
    public static Node tail;
    
    public void addFirst(int data){
        //create a new node
        Node newNode = new Node(data);
        //new node head = next
        newNode.next = head;
        //head = new node
        
    }
    public static void main(String args[]){
          Linkedlist ll = new Linkedlist();
          
        
 
    }
}
