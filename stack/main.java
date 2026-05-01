//     static class Stack{
//         static ArrayList<Integer> list = new ArrayList<>();
//         public static boolean isEmpty(){
//             return list.size() == 0;
//         }
//         //push
//         public static void push(int data){
//             list.add(data);
//         }
//         //pop
//         public static int pop(){
//             if(isEmpty()){
//                 return -1;
//             }
//             int top  = list.get(list.size()-1);
//             list.remove(list.size()-1);
//             return top;
//         }
//         //peek
//         public static int peek(){
//             if(isEmpty()){
//                 return -1;
//             }
//             return list.get(list.size()-1);
//         }
//     }
//     public static void main(String args[]){
//         Stack s = new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }
//implementation by linkedlist
// class main {
//     static class Node {
//         int data;
//         Node next;
//         Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }
//     static class Stack {
//         static Node head = null;
//         public static boolean isEmpty(){
//             return head == null;
//         }
//         //push
//         public static void push(int data){
//             Node newNode = new Node(data);
//             if(isEmpty()){
//                 head = newNode;
//                 return;
//             }
//             newNode.next = head;
//             head = newNode;
//         }
//         //pop
//         public static int pop(){
//             if(isEmpty()){
//                 return -1;
//             }
//             int top = head.data;
//             head = head.next;
//             return top;
//         }
//         //peak
//         public static int peek(){
//             if(isEmpty()){
//                 return -1;
//             }
//             return head.data;
//         }
//     }
//     public static void main(String args[]) {
//         Stack s = new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }
//implementation by java collection framework
// import java.util.Stack;
// public class main{
//     public static void main(String args[]){
//         //Stack s = new Stack();
//         Stack<Integer> s= new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }
//Q.push at the bottom of the stack
//     public static void pushAtBottom(Stack<Integer>s,int data){
//         if(s.isEmpty()){
//             s.push(data);
//             return;
//         }
//         int top = s.pop();
//         pushAtBottom(s, data);
//         s.push(top);
//     }
//     public static void main(String args[]){
//         Stack<Integer> s= new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         pushAtBottom(s,4);
//         while(!s.isEmpty()){
//             System.out.println(s.pop());
//         }
//     }
// }

//Q.reverse string
// class main{
//     public static String reverseString(String str){
//         Stack<Character> s = new Stack<>();
//         int idx = 0;
//         while(idx<str.length()){
//             s.push(str.charAt(idx));
//             idx++;
//         }
//         StringBuilder result = new StringBuilder("");
//         while(!s.isEmpty()){
//             char curr = s.pop();
//             result.append(curr);
//         } 
//         return result.toString();
//     }
//     public static void main(String args[]){
//         String str = "abc";
//         String result = reverseString(str);
//         System.out.println(result);
//     }
// }
//reverse a stack
// class main {
//     public static void pushAtBottom(Stack<Integer> s, int data) {
//         if (s.isEmpty()) {
//             s.push(data);
//             return;
//         }
//         int top = s.pop();
//         pushAtBottom(s, data);
//         s.push(top);
//     }
//     public static void reverseStack(Stack<Integer> s){
//         if(s.isEmpty()){
//             return;
//         }
//         int top = s.pop();
//         reverseStack(s);
//         pushAtBottom(s, top);
//     }
//     public static void printStack(Stack<Integer> s){
//         while(!s.isEmpty()){
//             System.out.println(s.pop());
//         }
//     }
//     public static void main(String args[]) {
//         Stack<Integer> s = new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         reverseStack(s);
//         printStack(s);
//     }
// }
//import java.util.*;
//q.stock span problem
// class main{
//     public static void stockspan(int stocks[],int span[]){
//         Stack<Integer> s = new Stack<>();
//         span[0] = 1;
//         s.push(0);
//         for(int i=1;i<stocks.length;i++){
//             int currPrice = stocks[i];
//             while(!s.isEmpty() && currPrice > stocks[s.peek()]){
//                 s.pop();
//             }
//             if(s.isEmpty()){
//                 span[i] = i+1;
//             }else{
//                 int prevHigh = s.peek();
//                 span[i] = i-prevHigh;
//             }
//             s.push(i);
//         }
//     }
//     public static void main(String args[]){
//         int stocks[] = {100,80,60,70,60,85,100};
//         int span[] = new int[stocks.length];
//         stockspan(stocks,span);
//         for(int i=0;i<span.length;i++){
//             System.out.println(span[i]+ " ");
//         }
//     }
// }

//next greater element
// class main {
//     public static void main(String args[]) {//O(n)
//         int arr[] = {6, 8, 0, 1, 3};
//         Stack<Integer> s = new Stack<>();
//         int nextGreater[] = new int[arr.length];
//         for (int i = arr.length - 1; i >= 0; i--) {
//             //1.while
//             while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
//                 s.pop();
//             }
//             //2.if-lese
//             if (s.isEmpty()) {
//                 nextGreater[i] = -1;
//             } else {
//                 nextGreater[i] = arr[s.peek()];
//             }
//             //3.push-in-stack
//             s.push(i);
//         }
//         for (int i = 0; i < nextGreater.length; i++) {
//             System.out.print(nextGreater[i] + " ");
//         }
//         System.out.println();
// //next greater element from right as well as left side
// //next smaller element from right as well as left side
//     }
// }


//valid parenthesis
// class main {

//     public static boolean isValid(String str) {//O(n)
//         Stack<Character> s = new Stack<>();

//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             //opening

//             if (ch == '(' || ch == '{' || ch == '[') {
//                 s.push(ch);
//             } else {
//                 //closing
//                 if (s.isEmpty()) {
//                     return false;
//                 }
//                 if ((s.peek() == '(' && ch == ')')
//                         || (s.peek() == '{' && ch == '}')
//                         || (s.peek() == '[' && ch == ']')) {
//                     s.pop();
//                 } else {
//                     return false;
//                 }
//             }
//         }
//         if(s.isEmpty()){
//             return true;
//         }else{
//             return false;
//         }
//     }

//     public static void main(String args[]) {
//         String str = "({})[]";

//         System.out.println(isValid(str));

//     }
// }





//q.duplicate parenthesis

// import java.util.Stack;

// class main{
//     public static boolean isDuplicate(String str){
//         Stack<Character> s = new Stack<>();

//         for(int i=0;i<str.length();i++){
//             char ch = str.charAt(i);
//             //opening

//             //closing
//             if(ch == ')'){
//                 int count =0;
//                 while(s.peek() != '('){
//                     s.pop();
//                     count++;

//                 }
//                 if(count < 1){
//                     return true;
//                 }else{
//                     s.pop();
//                 }
//             }else{
//                 //opening
//                 s.push(ch);
//             }


//         }
//         return false;

//     }
//     public static void main(String args[]){
//         String str1 = "((a+b))";
//         String str2 = "(a-b)";
//         System.out.println(isDuplicate(str1));
//     }
// }




import java.util.*;
//max rectangular area in histogram
class main{
    public static void MaxArea(int arr[]){
        int maxarea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        //next smaller right
        Stack<Integer> s = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                //-1
            }else{
                //top
                nsr[i] = s.peek();
            }
            s.push(i);
        }


        //next smaller left
        s = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }else{
                //top
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        //current area
        for(int i=0;i<arr.length;i++){
            int height = arr[i];
            int width = nsr[i]-nsl[i]-1;
            int currarea = height * width;
            maxarea = Math.max(maxarea,currarea);
        }
        System.out.println("maximum area in histogram = "+ maxarea);
    }
    public static void main(String args[]){
        int arr[] = {2,1,5,6,2,3};
        MaxArea(arr);
    }
}