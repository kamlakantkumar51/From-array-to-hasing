import java.util.*;
public class palindromicsequence {
    static int count = 0;
    public static int countPS(String s){
        count =0;
        generatePalindrSubseq(s,0,new StringBuilder());
        return count;
    }
    private static void generatePalindrSubseq(String s,int index,StringBuilder current){
        if(index == s.length()){
            if(isPalindrome(current.toString())){
                count++;
            }
            return;
        }
        current.append(s.charAt(index));
        generatePalindrSubseq(s, index+1, current);
        current.deleteCharAt((current.length()-1));//backtracking
        generatePalindrSubseq(s, index+1, current);
    }
    private static boolean isPalindrome(String s){
        int left =0;
        int right = s.length()-1;
        while(left < right){
            if(s.charAt(left++)!= s.charAt(right--)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String s = "aab";
        System.out.println("count of palindromic subsequences:"+ countPS(s));
    }
}
