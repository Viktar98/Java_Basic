import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int day_number;
        int error = 0;

        System.out.print("Впишите порядковый номер дня недели (1-7): ");

        while (true) {
            day_number = sc.nextInt();
            if (day_number == 1) {
                System.out.println("\nПонедельник");
                break;
            }
            if (day_number == 2) {
                System.out.println("\nВторник");
                break;
            }
            if (day_number == 3) {
                System.out.println("\nСреда");
                break;
            }
            if (day_number == 4) {
                System.out.println("\nЧетверг");
                break;
            }
            if (day_number == 5) {
                System.out.println("\nПятница");
                break;
            }
            if (day_number == 6) {
                System.out.println("\nСуббота");
                break;
            }
            if (day_number == 7) {
                System.out.println("\nВоскресение");
                break;
            } else {
                error ++;
                System.out.println("\nЗначение некорректное!");
                System.out.print("Повторите ввод: ");
            }
        }
        
        sc.close();

        System.out.println("\nСпасибо, хорошего дня!");
        if (error>0)
            System.out.println("В следующий раз при вводе будьте внимательнее;)");
    }
}
