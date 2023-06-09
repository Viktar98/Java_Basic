import java.util.Random;

public class WorkingTimer {

    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(28801);

        String hours, minutes, output;

        // Расчёт часов и минут (для вывода):
        hours = (n / 3600) == 1 ? "one hour" : (n / 3600) + " hours";
        hours = (n / 3600) == 0 ? null : hours;
        minutes = (n % 3600) / 60 == 1 ? "one minute" : (n % 3600) / 60 + " minutes";
        minutes = (n % 3600) / 60 == 0 ? null : minutes;

        // Создание строки вывода:
        output = "There are " + hours + " and " + minutes + " left until the end of the working day.";

        // Корректировка строки вывода:
        if ((hours == null || minutes == null) && ((n / 3600) == 1 || (n % 3600) / 60 == 1)) {
            if (hours == null) {
                output = "There is " + minutes + " left until the end of the working day.";
            } else if (minutes == null) {
                output = "There is " + hours + " left until the end of the working day.";
            }
        } else {
            if (hours == null) {
                output = "There are " + minutes + " left until the end of the working day.";
            } else if (minutes == null) {
                output = "There are " + hours + " left until the end of the working day.";
            }
        }
        if (hours == null && minutes == null){
            output = "The working day will end in " + n + " seconds.";
        }
        if (n == 0) output = "The working day is over.";

        //Вывод
        System.out.println();
        System.out.println(output);
        System.out.println(">>>>human version>>>>");
        System.out.println();
        System.out.println(n + "s");
        System.out.println(">>>>version for API>>");

    }
}
