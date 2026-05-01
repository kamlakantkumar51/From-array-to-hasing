package BitManipulation;

import java.util.*;

public class bit {
    public static void oddOrEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }

    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        // if(newBit == 0){
        // return clearIthBit(n, i);
        // }else{
        // return setIthBit(n, i);
        // }
        n = clearIthBit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;
    }

    public static int clearLastIthBits(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    public static int clearBitsinRange(int n, int i, int j) {
        int a = (~0) << (j + 1);
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }

    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static int fastExpo(int a,int n){
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String args[]) {
        // and bitwise operator
        // System.out.println((5 & 6));

        // //or bitwise operator
        // System.out.println((5 | 6));

        // //xor bitwise operator
        // System.out.println((5 ^ 6));

        // //binary one's complement
        // System.out.println(~0);

        // //left shift operator
        // System.out.println(5 << 2);

        // //right shift operator
        // System.out.println(6 >> 1);

        // oddOrEven(3);
        // oddOrEven(4);
        // oddOrEven(11);

        // System.out.println(getIthBit(10, 2));
        // System.out.println(getIthBit(10, 3));

        // System.out.println(setIthBit(10, 2));

        // System.out.println(clearIthBit(10, 1));

        // System.out.println(updateIthBit(10, 2, 1));

        // System.out.println(clearLastIthBits(15, 2));

        // System.out.println(clearBitsinRange(10, 2, 4));

        // System.out.println(isPowerOfTwo(16));
        // System.out.println(isPowerOfTwo(15));

        System.out.println(countSetBits(15));
        System.out.println(fastExpo(3, 5));

    }
}
