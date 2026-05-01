//dequeu implementation
// import java.util.*;
// public class dequeu {
//     public static void main(String args[]){
//         Deque<Integer> dq = new LinkedList<>();

//         dq.addFirst(20);
//         dq.addFirst(40);
//         dq.addFirst(60);
//         dq.addFirst(80);

//         System.out.println(dq);
//         dq.addLast(100);

//         System.out.println(dq);

//         dq.removeFirst();

//         System.out.println(dq);
//         dq.removeLast();

//         System.out.println(dq);
//     }
// }


//implementation of stack using dequeu
import java.util.*;
class dequeu{
    Deque<Integer> dq;

    public dequeu() {
        dq = new LinkedList<>();
    }
    //push 
    void push(int x){
        dq.addFirst(x);
    }

    //pop
    int top(){
        return dq.removeFirst();
    }

    //peek
    int peek(){
        return dq.getFirst();
    }

    //empty
    boolean empty(){
        return dq.isEmpty();
    }

    //display
    void display(){
        System.out.println(dq);
    }

    public static void main(String args[]){
        dequeu d = new dequeu();
        d.push(10);
        d.push(20);
        d.push(30);
        d.display();
        System.out.println("Top element is: " + d.peek());
        System.out.println("Popped element is: " + d.top());
        System.out.println("Is stack empty? " + d.empty());
    }
}
