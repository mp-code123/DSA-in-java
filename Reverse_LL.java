import java.util.*;

class Reverse_LL{
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next  = null;
        }
    }
        public void addFirst(int data){
            Node newNode = new Node(data);
            if (head == null){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        public void addLast(int data){
            Node newNode = new Node(data);
            if (head == null){
                head = newNode;
                return;
            }
            Node curr = head;
            while(curr.next != null){
                curr = curr.next;
            }
            newNode.next = curr.next;
            curr.next = newNode;
        }
        // reverse 
        public void reverse(){
            if(head == null || head.next == null){
                return;
            }
            Node prevNode = head;
            Node currNode = head.next;

            while(currNode != null){
                Node nextNode = currNode.next;
                currNode.next = prevNode;

                // update 
                prevNode = currNode;
                currNode = nextNode;
            }
            head.next = null;
            head = prevNode;
        }

        // printlist 
        public void printList(){
            Node curr = head;
            while(curr != null){
                System.out.print(curr.data + " -> ");
                curr = curr.next;
            }
            System.out.println("null");
        }

        public static void main(String args[]){
            Reverse_LL rev_ll = new Reverse_LL();
            rev_ll.addFirst(23);
            rev_ll.addFirst(34);
            rev_ll.addFirst(45);

            System.out.println("--Before Reverse--");
            rev_ll.printList();

            rev_ll.reverse();

            System.out.println("--After Reverse--");
            rev_ll.printList();
        }
}