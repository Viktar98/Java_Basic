package homework_java_basic;

import java.util.Scanner;

public class homework_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = sc.nextInt();
        System.out.println("Десятичный вид: " + number);
        System.out.println("Двоичный вид: " + Integer.toBinaryString(number));
        System.out.println("Восьмиричный вид: " + Integer.toOctalString(number));
        System.out.println("Шеснадцатиричный вид: " + Integer.toHexString(number));
    }
}
