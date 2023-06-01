package ScannerExample;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What's your name, bro?");
        String name = sc.next(); //забирает одно слово перед пробелом
        sc.close();
        System.out.println("You are welcome, "+name+'!');
    }
}
