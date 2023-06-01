import java.util.Scanner;

public class SwitchWeek {

    private String day;
    private int day_number;

    public String getDayByNumber(int _day) {
        switch (_day) {
            case 1: day = "monday"; break;
            case 2: day = "tuesday"; break;
            case 3: day = "wednesday"; break;
            case 4: day = "thursday"; break;
            case 5: day = "friday"; break;
            case 6: day = "saturday"; break;
            case 7: day = "sunday"; break;
            default: day = "_invalid_value_"; break;
        }
        return day;
    }

    public int inputDayByConsole() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Choose a day of the week");
            System.out.print("and enter its serial number: ");
            day_number = sc.nextInt();
            if (day_number >= 1 && day_number <= 7) {
                return day_number;
            }
            else System.out.println("_invalid_value_");
        }  // sc.close(); ! ??
    }

}

//        For Testing:
//        SwitchWeek day = new SwitchWeek();
//        System.out.println(day.getDayByNumber(day.inputDayByConsole()));
