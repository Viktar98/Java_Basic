package homework_java_basic;

import java.util.Scanner;

public class Elevator {
    private static int h, n, m;
    private static int counter = 0;

    public static void main(String[] args) {

        inPut();
        calculate();
        outPut();

    }

    private static void inPut() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Введите высоту здания (в этажах): ");
            h = sc.nextInt();
            if (h < 0) System.out.println("Высота не может быть отрицательной!\n\tПовторите ввод.");
        }
        while (h < 0);
        do {
            System.out.print("На сколько этажей поднимается лифт? ");
            n = sc.nextInt();
            if (n < 0) System.out.println("Значение не может быть отрицательным!\n\tПовторите ввод.");
        }
        while (n < 0);
        do {
            System.out.print("На сколько этажей спускается лифт? ");
            m = sc.nextInt();
            if (m < 0) System.out.println("Значение не может быть отрицательным!\n\tПовторите ввод.");
        }
        while (m < 0);
        sc.close();
    }

    private static void calculate() {
        if (m < n) {
            for (int i = 0; i < h; ) {
                i += n;
                counter++;
                if (i >= h)
                    break;
                else i -= m;
            }
        } else if (m == n && n >= h) counter = 1;
        else counter = -1;
    }

    private static void outPut() {
        if (counter == -1) System.out.println("Никогда лифт не доедет до последнего этажа.");
        else System.out.println("Количество подъёмов лифта: " + counter);
    }
}
