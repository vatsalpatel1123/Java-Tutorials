import java.util.*;
public class CalendarCountWeekMethod extends Thread{
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getWeeksInWeekYear());
    }
}
