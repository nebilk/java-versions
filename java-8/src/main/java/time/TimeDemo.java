package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeDemo {

    public static final LocalDate CURRENT_DATE = LocalDate.now();
    public static final LocalTime CURRENT_TIME = LocalTime.now();
    public static final LocalDateTime CURRENT_DATE_TIME = LocalDateTime.now();

    public static void main(String[] args) {


        System.out.println(CURRENT_DATE);
        System.out.println(CURRENT_TIME);
        System.out.println(CURRENT_DATE_TIME);

        System.out.println(CURRENT_DATE.getDayOfMonth());
        System.out.println(CURRENT_DATE.getMonthValue());
        System.out.println(CURRENT_DATE.getYear());


    }
}
