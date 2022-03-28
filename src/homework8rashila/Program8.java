package homework8rashila;

import java.util.Scanner;

/*8. Display right angle triangle of @ using nested for loops
@
@@
@@@
@@@@
@@@@@*/
public class Program8 {

    public static void rightAngle() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter no. of rows : ");
        int angle = scr.nextInt();

        for (int i = 1; i <= angle; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        rightAngle();
    }
}
