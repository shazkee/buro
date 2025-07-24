package Buro;

import java.util.Scanner;

public class BuroActivity2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

       
        System.out.println("//instance 1");
        System.out.print("Enter a number: ");
        int num1 = input.nextInt();
        checkEvenOdd(num1);

        
        System.out.println("\n//instance 2");
        System.out.print("Enter a number: ");
        int num2 = input.nextInt();
        checkEvenOdd(num2);

        
        System.out.println("\n//instance 1");
        System.out.print("Enter a number: ");
        int num3 = input.nextInt();
        checkEvenOdd(num3);

        input.close();
    }

   static void checkEvenOdd(int num) {
        if (num == 0) {
            System.out.println("Inputted number Zero");
        } else if (num % 2 == 0) {
            System.out.println("Inputted number is even");
        } else {
            System.out.println("Inputted number is odd");
        }
    }
}