
class node {

    node prev;
    int data;
    node next;

    //node constructor
    node(int value) {

        //previous pointer set to null
        prev = null;
        //value os assigned to data
        data = value;
        //next pointer set to null
        next = null;
    }
}

class DoublyLinkedList4{

    //declaring and empty doubly linked list
    static node head = null;
    static node tail = null;

    static void insertAtPosition(int data, int position)
    {
        node temp = new node(data);
        if (position == 1){
            insertAtBeginning(data);
        }
        else {
            node current = head;
            int currentPosition = 1;
            while (current != null && currentPosition < position) {
                current = current.next;
                currentPosition++;
            }
            if (current == null) {
                insertAtEnd(data);
            } else {
                temp.next = current;
                temp.prev = current.prev;
                current.prev.next = temp;
                current.prev = temp;
            }
        }
    }

    static void deleteAtBeginning() {
        if (head == null) {
            return; // List is empty
        }
        if (head == tail) {
            head = null;
            tail = null; // List had one node
            return;
        }

        node temp = head;
        head = head.next;
        head.prev = null;
        temp.next = null; 
    }

       static void deleteAtEnd() {
        if (tail == null) {
            return; // List is empty
        }
        if (head == tail) {
            head = null;
            tail = null; // List had one node
            return;
        }

        node temp = tail;
        tail = tail.prev;
        tail.next = null;
        temp.prev = null; 
    }

    

    static void insertAtBeginning(int data) {
        node temp = new node(data);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
    }

    static void insertAtEnd(int data) {
        node temp = new node(data);
        if (tail == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
    }

    static void display(node head) {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //Driver code
    public static void main(String[] args) {

        insertAtEnd(1);
        insertAtEnd(2);
        insertAtEnd(3);
        insertAtEnd(4);
        insertAtEnd(5);

        System.out.println("After insertion at tail:");
        display(head);

        System.out.println("After insertion at head:");
        insertAtBeginning(0);
        display(head);

        insertAtPosition(6,2);
        System.out.println("After insertion at position 2:");
        display(head);

        deleteAtBeginning();
        System.out.println("After deletion at head:");
        display(head);

        deleteAtEnd();  
        System.out.println("After deletion at tail:");
        display(head);
    }
}
