package homework8rashila;

import java.util.Scanner;

/*6. Write a program in Java to display the pattern like a triangle with a number.
For eg.
Input number of rows: 10
Expected Output:
1
12
123
1234
12345
123456
1234567
12345678
123456789
12345678910*/
public class Program6 {
    public static void test() {
        int i, x, n;
        Scanner scr = new Scanner(System.in);
        System.out.println("Input number of rows : ");
        int r = scr.nextInt();

        for (i = 1; i <= r; i++) {
            for (x = 1; x <= i; x++) {
                System.out.print(x);
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {

        test();
    }
}
    
