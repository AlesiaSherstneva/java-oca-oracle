package lesson15;

public class Time {
    static void showTime() {
        int hour = 0, min = 0, sec = 0;

        HOURS:
        while (hour <= 6) {
            do {
                while (sec < 60) {
                    if (min % 10 == 0 && hour > 1) {
                        break HOURS;
                    }
                    if (sec * hour > min) {
                        break;
                    }
                    System.out.println("0" + hour + ":" +
                            (min < 10 ? "0" : "") + min + ":" +
                            (sec < 10 ? "0" : "") + sec);
                    sec++;
                }
                sec = 0;
                min++;
            } while (min < 60);
            min = 0;
            hour++;
        }
    }

    public static void main(String[] args) {
        showTime();
    }
}