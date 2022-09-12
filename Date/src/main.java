import java.time.*;
public class main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println("LocalDate: " + localDate);
        System.out.println("LocalTime: " + localTime);
        System.out.println("LocalDateTime: " + localDateTime);
    }
}
