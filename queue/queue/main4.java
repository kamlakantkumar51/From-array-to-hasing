//interleave two halves of a queue
import java.util.*;
class main4{
    public static void interLeaveQue(Queue<Integer> q){
        int size = q.size();
        if(size%2!= 0){
            System.out.println("size should be even not odd");
        }
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<size/2;i++){
            s.push(q.poll());
        }
        for(int i=0;i<size/2;i++){
            q.add(s.pop());
        }
        for(int i=0;i<size/2;i++){
            q.add(q.poll());
        }
        for(int i=0;i<size/2;i++){
            s.push(q.poll());
        }
        while(!s.isEmpty()){
            q.add(q.poll());
            q.add(s.pop());
        }
    }
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(50);
        q.add(100);
        q.add(150);
        q.add(200);
        q.add(250);
        q.add(300);

        interLeaveQue(q);
        System.out.println(q);
    }
}