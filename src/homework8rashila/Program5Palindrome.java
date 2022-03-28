package homework8rashila;

import java.util.Scanner;

/*
5. Palindrome Number
Write a method called isPalindrome with one int parameter called number.
The method needs to return a boolean.
It should return true if the number is a palindrome number otherwise it should return false.
Example Input/Output
isPalindrome(-1221); → should return true
isPalindrome(707); → should return true
isPalindrome(11212); → should return false because the reverse is 21211 and that is not equal to
11212.
 */
public class Program5Palindrome {
    public static boolean isPalindrome(int number) { // Static method to return a boolean
        int num = number;
        int reverse = 0;

        //It should return true if the number is a palindrome number otherwise it should return false.
        while (number != 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10;
            reverse = reverse + lastDigit;
            number = number / 10;
        }
        if (num == reverse) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter any number");
        int pal = scr.nextInt();
        System.out.println(isPalindrome(pal));

    }
}
