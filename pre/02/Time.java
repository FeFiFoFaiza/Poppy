public class Time {
    public static void main(String[] args) {
        int hour = 15;
        int minute = 21;
        int second = 26;
        int wholeSeconds = ((((60 * hour) + minute) * 60) + second);

        System.out.println("Seconds since midnight: " + wholeSeconds);
        System.out.println("seconds remaining: " + (86400 - wholeSeconds));
        System.out.println("Percentage of day finished: " + (wholeSeconds * 100.0 / 86400.0));


        hour = 15;
        minute = 32;
        second = 45;
        int newWholeSeconds = ((((60 * hour) + minute) * 60) + second);

        System.out.println("Time that has passed since doing this: " + (newWholeSeconds - wholeSeconds));
    }
}
