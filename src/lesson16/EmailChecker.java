package lesson16;

public class EmailChecker {
    void email(String emails) {
        String[] strings = emails.split(";");
        for (String string : strings) {
            int start = string.indexOf("@") + 1;
            int end = string.indexOf(".");
            System.out.println(string.substring(start, end));
        }
    }

    public static void main(String[] args) {
        EmailChecker emailChecker = new EmailChecker();
        String emails = "ya@yahoo.com; on@mail.ru; ona@gmail.com";
        System.out.println("The string with emails:\n" + emails + "\n");

        System.out.println("The result of the method:");
        emailChecker.email(emails);
    }
}