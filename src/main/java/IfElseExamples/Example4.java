package IfElseExamples;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        // -;0;+
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pls your weather (+good;0undefined:-bad):");
        int weather = sc.nextInt();
        sc.close();

        if (weather < 0){
            System.out.println("Останемся дома.");
        } else if (weather > 0) {
            System.out.println("Купим билеты и поедем на ярмарку.");
        } else System.out.println("Встретимся с друзьями дома.");

    }
}
