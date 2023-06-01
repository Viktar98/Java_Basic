package ScannerExample;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите день: ");
        int day = sc.nextInt();
        System.out.print("Введите месяц: ");
        int m = sc.nextInt();
        System.out.print("Введите год: ");
        int y = sc.nextInt();


        sc.close();
        System.out.println("Date is "+day+'.'+m+'.'+y%100);
    }
}
