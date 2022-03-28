package homework8rashila;

import java.util.Scanner;

/*
10. Write a program to input any number and check if it Armstrong number or not
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:
(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So:
1+125+27=153
 */
public class Program10ArmstrongNumber {
    public static void armstrong() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scr.nextInt();
        int ori, remainder, result = 0;
        ori = num;
        while (ori != 0) {
            remainder = ori % 10;
            result += Math.pow(remainder, 3);
            ori /= 10;
        }
        if (result == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }

    public static void main(String[] args) {
        armstrong();
    }
}
