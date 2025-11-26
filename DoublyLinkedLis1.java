
class node{
    node prev;
    int data;
    node next;

    //node constructor
    node(int value){

        //previous pointer set to null
        prev =null;
        //value os assigned to data
        data = value;
        //next pointer set to null
        next = null;   
    }
}

    class DoublyLinkedList1{

        //declaring and empty doubly linked list
        static node head = null;
        static node tail = null;

        static void insertAtEnd(int data)
        {
            node temp = new node(data);
            if(tail ==null){
                head = temp;
                tail = temp;
            }
            else{
                tail.next = temp;
                temp.prev = tail;
                tail = temp;
            }
        }

        static void display(node head)
        {
           node temp = head;
              while(temp != null){
                System.out.print(temp.data + " --> ");
                temp = temp.next;
              }
                System.out.println("null");
        }

        //Driver code
        public static void main(String[] args) {
            insertAtEnd(1);

            System.out.println("After insertion at tail:");
            display(head);
        }
    }