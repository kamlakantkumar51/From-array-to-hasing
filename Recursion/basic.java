package Recursion;

import java.util.*;

//printing numbers in decreasing order using recursion
// class basic {
//     public static void printDec(int n){
//         if(n== 1){
//             System.out.println(n);
//             return;
//         }
//         System.out.print(n+" ");
//         printDec(n-1);
//     } 
//     public static void main(String args[]){
//         int n = 10;
//         printDec(n);
//     }
// }

//Q.1: Print numbers in increasing order using recursion
// public class basic {
//     public static void printInc(int n){
//         if(n == 10){
//             System.out.println(n);
//             return;
//         }
//         System.out.print(n + " ");
//         printInc(n + 1);
//     }
//     public static void main(String args[]) {
//         int n = 0;
//         printInc(n);
//     }
// }

//Q. Factorial of a number using recursion
// class basic{
//     public static int factorial(int n){
//         if(n<= 1){
//             return 1;
//         }
//         return n * factorial(n-1);
//     }
//     public static void main(String args[]){
//         int n = 5;
//         int ans = factorial(n);
//         System.out.println("Factorial of " + n + " is: " + ans);
//     }
// }

//Q.print sum of natural numbers using recursion
// class basic{
//     public static int sum(int n){
//         if(n==0){
//             return 0;
//         }
//         return n + sum(n-1);
//     }
//     public static void main(String args[]){
//         int n = 5;
//         int ans = sum(n);
//         System.out.println("Sum of first " + n + " natural numbers is: " + ans);
//     }
// }

//Q.print nth Fibonacci number using recursion
// class basic{
//     public static int fibonacii(int n){
//         if(n<= 1){
//             return n;
//         }
//         return fibonacii(n-1) + fibonacii(n-2);
//     }
//     public static void main(String args[]){
//         int n = 5;
//         for(int i = 0; i < n; i++){
//             System.out.print(fibonacii(i) + " ");
//         }
//     }
// }

//Q. check the given number is sorted or not using recursion
// class basic{
//     public static boolean isSorted(int arr[], int index){
//         if(index == arr.length-1){
//             return true;
//         }
//         if(arr[index]> arr[index + 1]){
//             return false;
//         }
//         return isSorted(arr, index + 1);
//     }
//     public static void main(String args[]){
//         //input from user
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int arr[] = new int[n];
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }

//         boolean ans = isSorted(arr, 0);
//         if(ans){
//             System.out.println("Array is sorted");
//         } else {
//             System.out.println("Array is not sorted");
//         }
//     }
// }

//Q.first occurrence of a number in an array using recursion
// class basic {
//     public static int firstOcc(int arr[], int key, int i) {
//         if (i == arr.length) {
//             return -1;
//         }
//         if (arr[i] == key) {
//             return i;
//         }
//         return firstOcc(arr, key, i + 1);
//     }

//     public static void main(String args[]){
//         //input from user

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the size of the array: ");
//         int n = sc.nextInt();

//         int arr[] = new int[n];
//         System.out.println("Enter the elements of the array:");
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         System.out.print("Enter the key to search: ");
//         int key =  sc.nextInt();

//         int ans = firstOcc(arr, key, 0);
//         System.out.println(ans);
//     }
// }

//Q. last occurrence of a number in an array using recursion
// class basic {
//     public static int lastOcc(int arr[], int key, int i) {
//         if(i == arr.length){
//             return -1;
//         }
//         int isFound = lastOcc(arr, key, i + 1);
//         if (isFound == -1 && arr[i] == key) {
//             return i;
//         }
//         return isFound;
//     }

//     public static void main(String args[]) {
//         // input from user

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the size of the array: ");
//         int n = sc.nextInt();

//         int arr[] = new int[n];
//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         System.out.print("Enter the key to search: ");
//         int key = sc.nextInt();

//         int ans = lastOcc(arr, key, 0);
//         System.out.println(ans);
//     }
// }

//finding power of a number using recursion
// class basic{
//     public static int power(int x,int n){
//         if(n == 0){
//             return 1;
//         }
//         // int xnm1 = power(x, n-1);
//         // int xn = x * xnm1;
//         // return xn;
//         return x * power(x, n-1);
//     }
//     public static void  main(String args[]){
//         System.out.println(power(2, 10));
//     }
// }

//Tiling problem using recursion:this is not optimised code,it can be optimised by dp

// class basic{
//     public static int tiling(int n){ //2 X n (floor size)
//         //base case
//         if(n == 0 || n == 1){
//             return 1;
//         }
//         //vertical choice
//         int fnm1 = tiling(n-1);
//         //horizontal choice 
//         int fnm2 = tiling(n-2);

//         int total = fnm1 + fnm2;
//         return total;

//     }
//     public static void main(String args[]){
//         System.out.println(tiling(3));
//     }
// }

//Remove duplicates from a string using recursion
class basic{
    public static void removeDuplicates(String str, int idx,StringBuilder newStr,boolean map[]){
        //base case
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        //kaam
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            //duplicate
            removeDuplicates(str, idx+1, newStr, map);
        }else{
            //not a duplicate
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }
    public static void main(String args[]){
        String str = "kamlakant";
        removeDuplicates(str, 0, new StringBuilder(""),new boolean[26]);
    }
}

//friends pairing problem
// class basic{

//     public static int friendsPairing(int n){
//         //base case
//         if(n == 0 || n == 1){
//             return 1;
//         }
//         //single choice
//         int fnm1 = friendsPairing(n-1);
//         //pair choice
//         int fnm2 = friendsPairing(n-2);

//         int total = fnm1 + (n-1) * fnm2;  
//         return total;
//     }

//     public static void main(String args[]){
//         int n = 3;
//         System.out.println(friendsPairing(3));

//     }
// }

//Q.binary strings

class BinaryStrings {
    public static void binaryStrings(int n, int lastplace, String str) {

        //base case
        if(n == 0){
            System.out.println(str);
            return;
        }
        // kaam
        binaryStrings(n - 1, 0, str+"0");
        if (lastplace == 0) {
            binaryStrings(n - 1, 1, str+"1");
        }

    }

    public static void main(String args[]) {
        binaryStrings(3, 0, "");
    }
}