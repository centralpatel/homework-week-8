package homework8rashila;

import java.util.Scanner;

//15. Display left angle triangle of * using nested for loops
public class Program15 {

    public static void triangle() {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = scr.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int k = 1; k <= a - i + 1; k++) {
                System.out.print("");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        triangle();
    }
}

