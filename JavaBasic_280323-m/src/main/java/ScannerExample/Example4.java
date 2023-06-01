package ScannerExample;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What's your name, bro?");
        String full_name = sc.nextLine();
        sc.close();
        System.out.println("You are welcome, "+full_name+'!');
    }
}
