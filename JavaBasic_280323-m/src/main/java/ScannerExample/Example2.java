package ScannerExample;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите радиус: ");
        float radius = sc.nextFloat();
        double result = Math.PI * Math.pow(radius,2);
        sc.close();
        System.out.println(result);




    }
}
