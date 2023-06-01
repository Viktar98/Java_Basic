package ScannerExample;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Age: ");
        int age = sc.nextInt();

        sc.nextLine();

        System.out.print("Country: ");
        String country = sc.nextLine();

        System.out.print("Name: ");
        String name = sc.nextLine();

        sc.close();

        System.out.println("User's age is "+age);
        System.out.println("User's country is "+country);
        System.out.println("User's name is "+name);
    }
}
