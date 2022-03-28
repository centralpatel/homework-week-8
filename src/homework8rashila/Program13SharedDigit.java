package homework8rashila;

import java.util.Scanner;

/*13. Shared Digit
Write a method named hasSharedDigit with two parameters of type int.
Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
otherwise, the method should return false.
 */
public class Program13SharedDigit {

    public static boolean hasShareDigit(int a, int b) {

        if (a < 10 || a > 99 || b < 10 || b > 99) {
            return false;
        }
        int num = a / 10;
        int number = a % 10;
        int num1 = b / 10;
        int number1 = b % 10;
        return num == num1 || num == number1 || number == num1 || number == number1;
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter 1st  value :  ");
        int n1 = scr.nextInt();
        System.out.print("Enter 2st  value :  ");
        int n2 = scr.nextInt();

        System.out.println("Shared digit sum :  " + hasShareDigit(n1, n2));
    }
}
