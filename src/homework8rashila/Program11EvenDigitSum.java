package homework8rashila;

import java.util.Scanner;

/*
11. Even Digit Sum
Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative, the method should return -1 to indicate an invalid value.
EXAMPLE INPUT/OUTPUT:
* getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
* getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
* getEvenDigitSum(-22); → should return -1 since the number is negative
 */
public class Program11EvenDigitSum {

    public static int getEvenDigitSum(int num) {

        int total = 0;
        if (num > 0) {
            while (num != 0) {
                int even = num % 10;

                if (even % 2 == 0) {
                    total += even;
                }
                num /= 10;
            }
            System.out.println(total);
        } else {
            System.out.println(-1 + " = Number is Invalid");
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int num = scr.nextInt();
        getEvenDigitSum(num);
    }
}

