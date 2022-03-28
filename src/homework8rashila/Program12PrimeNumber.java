package homework8rashila;

import java.util.Scanner;

/*12. Write a programme to input any number and check if it is prime or not.
(Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
17.... are the prime numbers.)*/
public class Program12PrimeNumber {

    public static void primeNum() {

        int prime;
        boolean isPrime = true;
        Scanner scr = new Scanner(System.in);//for user input
        System.out.println("Enter a number : ");
        int num = scr.nextInt();//reads the input in console

        for (int i = 2; i <= num / 2; i++) {
            prime = num % i;
            if (prime == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) //check if it is prime or not.
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is not a Prime Number");
    }

    public static void main(String[] args) {
        primeNum();
    }
}

