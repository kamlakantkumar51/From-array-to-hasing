public class doublylist {

    class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }
    }

    Node head;
    Node tail;
    int size;

    // addFirst
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // print
    public void print() {
        Node temp = head;
        //System.out.print("null <-> ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //remove
    public int removeFirst(){
        if(head == null){
            System.out.println("Doublyll is epty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;

        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;

    }

    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;

        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        doublylist dll = new doublylist();

        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.print();
        dll.reverse();
        dll.print();
        // System.out.println("Size = " + dll.size);

        // dll.removeFirst();
        // System.out.println(dll.size);
        // dll.print();
    }
}
