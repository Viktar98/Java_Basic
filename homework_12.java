import java.text.DateFormatSymbols;
public class WeekArray {


    private static String[] days = new DateFormatSymbols().getWeekdays();

    public static void main(String[] args) {
        System.out.println(days[days.length-1]);
    }
}
