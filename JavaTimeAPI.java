import java.time.*;
public class JavaTimeAPI extends Thread{
    public static void main(String[] args) {
        Clock cl = Clock.systemDefaultZone();
        System.out.println(cl.getZone());

        Clock utc = Clock.systemUTC();
        System.out.println(utc.instant());

        Duration d1 = Duration.between(LocalTime.MIN,LocalTime.NOON);
        System.out.println(d1.isNegative());

        Duration d2 = Duration.between(LocalTime.MAX,LocalTime.MIN);

        System.out.println(d2.isNegative());

        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalDate dt1 = LocalDate.parse("2023-10-05");
        LocalDate dt2= LocalDate.parse("2023-10-05");
        LocalDate dt3= LocalDate.parse("2023-05-26");

        System.out.println(dt1.equals(dt2));
        System.out.println(dt1.equals(dt3));

        LocalDate ChangeYear = LocalDate.parse("2023-02-11");
        System.out.println(ChangeYear.withYear(2003));

        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalTime t1 = LocalTime.of(13,18,29);
        System.out.println("Time before : "  + t1);

        LocalTime t2= t.plusHours(5);
        System.out.println("Time after adding 5 hours : " + t2);
    }
}