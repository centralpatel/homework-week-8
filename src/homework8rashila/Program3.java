package homework8rashila;
/* 3. Write a Java program that takes the user to provide a single character from the
alphabet. Print Vowel of Consonant, depending on the user input. If the user input
Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
error message.
For eg:
Input an alphabet: p
Expected Output:
Input letter is Consonant*/

import java.util.Scanner;

public class Program3 {
    public void vowelConsonant() {

        Scanner scr = new Scanner(System.in);
        System.out.print("Enter an Alphabet : ");
        String enter = scr.next().toLowerCase();

        boolean uppcase = enter.charAt(0) >= 65 && enter.charAt(0) <= 90;
        boolean lowcase = enter.charAt(0) >= 97 && enter.charAt(0) <= 122;
        boolean vowel = enter.equals("a") || enter.equals("e") || enter.equals("i")
                || enter.equals("o") || enter.equals("u");
        if (enter.length() > 1) {
            System.out.println("Error (Not a Character)");
        } else if (!(uppcase || lowcase)) {
            System.out.println("Error (Not a letter. Enter uppercase or lowercase alphabet)");
        } else if (vowel) {
            System.out.println("Letter is a Vowel");
        } else {
            System.out.println("Letter is a Consonant");
        }

    }

    public static void main(String[] args) {
        Program3 obj = new Program3();
        obj.vowelConsonant();
    }
}
