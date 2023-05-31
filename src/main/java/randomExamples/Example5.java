package randomExamples;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st var: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd var: ");
        int b = sc.nextInt();
        System.out.println("a = "+a+"; b = "+b);
        sc.close();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = "+a+"; b = "+b);
    }
}
