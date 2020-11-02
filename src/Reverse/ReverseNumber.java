package Reverse;

import java.util.Scanner;

public class ReverseNumber<number, reversed> {
    public static void main(String[] args) {
        int reversed = 0;
        System.out.println("Print Number");
        Scanner obj = new Scanner(System.in);
        int number = obj.nextInt();


        while (number != 0) {

            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}
