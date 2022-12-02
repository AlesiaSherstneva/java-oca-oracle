package lesson14;

public class Time {
    static void showTime() {
        HOURS:
        for (int hour = 0; hour <= 6; hour++) {
            MINUTES:
            for (int min = 0; min < 60; min++) {
                if (min % 10 == 0 && hour > 1) {
                    break HOURS;
                }
                for (int sec = 0; sec < 60; sec++) {
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