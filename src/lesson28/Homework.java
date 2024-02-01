package lesson28;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Homework {
    private static final DateTimeFormatter WORK = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! HH:mm");
    private static final DateTimeFormatter REST = DateTimeFormatter.ofPattern("HH:mm, dd/MMM/yy");

    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.of(2024, 2, 1, 9, 0);
        LocalDateTime finish = LocalDateTime.of(2024, 2, 10, 9, 0);

        Period period = Period.ofDays(1);
        Duration duration = Duration.ofHours(2);

        changeOfMode(start, finish, period, duration);
    }

    private static void changeOfMode(LocalDateTime start, LocalDateTime finish,
                                     Period period, Duration duration) {
        while (start.isBefore(finish)) {
            System.out.printf("Работаем с: %s ", start.format(WORK));
            start = start.plus(period);
            System.out.printf("До: %s ", start.format(WORK));
            System.out.printf("Отдыхаем с: %s ", start.format(REST));
            start = start.plus(duration);
            System.out.printf("До: %s\n", start.format(REST));
        }
    }
}