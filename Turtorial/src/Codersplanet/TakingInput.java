package Codersplanet;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking Input from the user");
        Scanner S = new Scanner(System.in);
        System.out.println("Enter First integer here : ");
        int a = S.nextInt(); // You can also use float,byte in place of int
        System.out.println("Enter Second integer here : ");
        int b = S.nextInt(); // You can also use float,byte in place of int
        int sum = a + b;
        System.out.println("The sum of "+a + " and "+ b+" is "+sum);
        boolean b1 = S.hasNextInt(); // for checking the number that it is an Integer or not.
        System.out.println(b1);
        String str = S.next(); // for taking String input from user . This will take only one word as an input.
        String str2 = S.nextLine(); // This will take One or More than one String Inputs
        System.out.println(str);
        System.out.println("Made By Rexy");
    }
}
