import java.util.Calendar;
public class CalendarClass {
    public static void main(String args[]) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.YEAR));
    }
}