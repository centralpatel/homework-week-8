package homework8rashila;

import java.util.Scanner;
//9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
public class Program9FibonacciNumber {

    public static void fib() {
        int num1 = 0, num2 = 1, num3, i, count;
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter Fibonacci Series length : ");
        count = scr.nextInt();
        for (i = 2; i < count; ++i) {
            num3 = num1 + num2;
            System.out.print(num3 + " ");
            num1 = num2;
            num2 = num3;
        }
    }

    public static void main(String[] args) {
        fib();
    }
}
