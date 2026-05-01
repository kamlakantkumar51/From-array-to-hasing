import java.util.*;
public class StackUsingQueues {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    //push
    void push(int x){
        q2.add(x);
        while(!q1.isEmpty()){
            q2.add(q1.poll());
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

    }

    //pop operation
    int pop(){
        if(q1.isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }
        return q1.poll();
    }

    //top operation
    int top(){
        if(q1.isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }
        return q1.peek();
    }

    //empty operation
    boolean empty(){
        return q1.isEmpty();
    }
    public static void main(String args[]){
        
        StackUsingQueues s = new StackUsingQueues();
        s.push(15);
        s.push(30);
        s.push(45);
        s.push(60);

        System.out.println(s);
        System.out.println(s.top());
        System.out.println(s.pop());

    }
}
