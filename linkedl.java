import java.util.*;
public class linkedl {
    Node head;
    static class Node{
        int data;
        Node next;
        public Node(int d){
            data =d;
            next=null;
        }
    }
    void print(){
        Node n = head;

        while(n != null){
            System.out.print(n.data+" ");
            n = n.next;
        }

    }
  public static void main(String args[]){
    linkedl list = new linkedl();
    list.head = new Node(1);
   Node second = new Node(2);
    Node third = new Node(3);

    list.head.next = second;
    second.next = third;

list.print();
  }
}
