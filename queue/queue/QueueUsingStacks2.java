// //implementation of queues using arrays
// public class main{
//     static class queue{
//         static int arr[];
//         static int size;
//         static int rear;
//         queue(int n){
//             arr = new int[n];
//             size = n;
//             rear = -1;
//         }
//         public static boolean isEmpty(){
//             return rear == -1;
//         }
//         //add
//         public static void add(int data){
//             if(rear == size-1){
//                 System.out.println("queue is full");
//                 return ;
//             }
//             rear = rear+1;
//             arr[rear] = data;
//         }

//         //remove
//         public static int remove(){
//             if(isEmpty()){
//                 System.out.println("empty queue");
//                 return -1;
//             }
//             int front = arr[0];
//             for(int i=0;i<rear;i++){
//                 arr[i] = arr[i+1];
//             }
//             rear = rear-1;
//             return front;
//         }
//         //peek
//         public static int peek(){
//             if(isEmpty()){
//             System.out.println("empty queue");
//             return -1;
//             }
//             return arr[0];
//         }
//     }
//     public static void main(String args[]){
//         queue q = new queue(5);
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         while(!q.isEmpty()){
//             System.out.println(q.peek()); 
//             q.remove();
//         }
//     }
// }
//implementation of circular queue using arrays
// class CircularQueue {
//     int arr[];
//     int front, rear, size;
//     CircularQueue(int par) {
//         this.size = par;
//         arr = new int[size];
//         front = rear = -1;
//     }
//     // insertion
//     void enqueue(int data) {
//         // queue full
//         if ((rear + 1) % size == front) {
//             System.out.println("Queue is full");
//             return;
//         }
//         // first element
//         if (front == -1) {
//             front = rear = 0;
//         } else {
//             rear = (rear + 1) % size;
//         }
//         arr[rear] = data;
//         System.out.println(data + " inserted");
//     }
//     //deletion
//     int dequeue(){
//         //empty queue
//         if(front == -1){
//             System.out.println("queue is empty");
//             return -1;
//         }
//         int data = arr[front];
//         //single elment
//         if(front == rear){
//             front = rear = -1;
//         }else{
//             front  = (front+1)%size;
//         }
//         return data;
//     }
//     //peek
//     int peek(){
//         if(front == -1){
//             System.out.println("queue is empty");;
//             return -1;
//         }
//         //return arr[front];
//         System.out.println(arr[front]);
//         return arr[front];
//     }
//     // display
//     void display() {
//         if (front == -1) {
//             System.out.println("Queue is empty");
//             return;
//         }
//         int i = front;
//         System.out.print("Queue: ");
//         while (true) {
//             System.out.print(arr[i] + " ");
//             if (i == rear)
//                 break;
//             i = (i + 1) % size;
//         }
//         System.out.println();
//     }
//     public static void main(String args[]) {
//         CircularQueue q = new CircularQueue(5);
//         q.enqueue(5);
//         q.enqueue(10);
//         q.enqueue(15);
//         q.enqueue(20);
//         q.enqueue(25);
//         q.display();
//         q.dequeue();
//         q.display();
//         q.peek();
//         q.display();
//     }
// }
//implementations of qeue using linkedlist
// class main {
//     class Node {
//         int data;
//         Node next;
//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }
//     Node front, rear;
//     main(){
//         front = rear = null;
//     }
//     //add
//     void enqueue(int data){
//         Node newNode = new Node(data);
//         if(rear == null){
//             front = rear = newNode;
//             return;
//         }
//         rear.next = newNode;
//         rear = newNode;
//     }
//     //delete
//     int dequeue(){
//         if(front == null){
//             return -1;
//         }
//         int remove = front.data;
//         front = front.next;
//         if(front == null){
//             rear = null;
//         }
//         return remove;
//     }
//     //peek
//     int peek(){
//         if(front == null){
//             return -1;
//         }
//         return front.data;
//     }
//     //isempty
//     boolean isEmpty(){
//         return front == null;
//     }
//     //display
//     void display(){
//         Node temp = front;
//         while(temp != null){
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }
//     public static void main(String args[]) {
//         main list = new main();
//         list.enqueue(15);
//         list.enqueue(30);
//         list.enqueue(45);
//         list.display();
//         list.dequeue();
//         list.display();
//         System.out.println("peek elemnt:"+list.peek());
//     }
// }
//implementations of queue using java collection framework
// import java.util.*;
// class main{
//     public static void main(String args[]){
//         Queue<Integer> q = new LinkedList<>();
//         Queue<Integer> pq = new ArrayDeque<>();
//         //enqueue
//         q.add(15);
//         pq.add(10);
//         q.add(30);
//         pq.add(20);
//         q.add(45);
//         pq.add(40);
//         q.add(60);
//         pq.add(80);
//         System.out.println(q);
//         System.out.println(pq);
//         //dequeue
//         q.poll();
//         pq.poll();
//         System.out.println(q);
//         System.out.println(pq);
//         //peek
//         System.out.println("front "+ q.peek());
//         System.out.println("front "+pq.peek());
//         //empty
//         System.out.println("empty "+q.isEmpty());
//     }
// }
//implementation of queue using two stack
import java.util.*;

class QueueUsingStacks {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    //enqueue
    void enqueue(int data) {
        s1.push(data);
        System.out.println(data + " inserted");
    }

    //dequeue
    int dequeue() {
        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("queue is empty");
            return -1;
        }
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();

    }

    //peek
    int peek() {
        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("stack is empty");
            return -1;
        }
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    //empty
    boolean isEmpty(){
        return s1.isEmpty() && s2.isEmpty();
    }

    public static void main(String args[]) {

        QueueUsingStacks  q = new QueueUsingStacks();

        q.enqueue(50);
        q.enqueue(100);
        q.enqueue(150);
        System.out.println(q);


        System.out.println(q.peek());
        System.out.println(q.dequeue());
        System.out.println(q.isEmpty());

    }
}
