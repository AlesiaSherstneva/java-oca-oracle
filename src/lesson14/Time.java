package lesson14;

public class Time {
    @SuppressWarnings("ConstantConditions")
    static void showTime() {
        HOURS:
        for (int hour = 0; hour <= 6; hour++) {
            MINUTES:
            for (int min = 0; min < 60; min++) {
                for (int sec = 0; sec < 60; sec++) {
                    if (hour > 1 && min % 10 == 0) {
                        break HOURS;
                    }
                    if (sec * hour > min) {
                        continue MINUTES;
                    }
                    System.out.println("0" + hour + ":" +
                            (min < 10 ? "0" : "") + min + ":" +
                            (sec < 10 ? "0" : "") + sec);
                }
            }
        }
    }

    public static void main(String[] args) {
        showTime();
    }
}
