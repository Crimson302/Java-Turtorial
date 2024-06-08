package Codersplanet;

import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        System.out.println("Project to obtain percentage of students");
        Scanner P = new Scanner(System.in);
        System.out.println("Enter First Subject's Marks Here : ");
        int a = P.nextInt();
        System.out.println("Enter Second Subject's Marks Here : ");
        int b = P.nextInt();
        System.out.println("Enter Third Subject's Marks Here : ");
        int c = P.nextInt();
        System.out.println("Enter Fourth Subject's Marks Here : ");
        int d = P.nextInt();
        System.out.println("Enter Fifth Subject's Marks Here : ");
        int e = P.nextInt();
        float sum = ((a + b + c + d + e)/500.0f)*100;
        System.out.println("The percentage of students is " + sum + "%");
        System.out.println("Made By Rexy");
    }
}
