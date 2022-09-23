import java.util.Scanner;

public class ClockTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int hour, minute, second;

        System.out.print("Enter hour:minute:second (separated by space): ");
        hour = input.nextInt();
        minute = input.nextInt();
        second = input.nextInt();

        Clock clock = new Clock(hour, minute, second);
        clock.setHour(clock.getHour());
        clock.setMinute(clock.getMinute());
        clock.setSecond(clock.getSecond());

        System.out.print("Now time is: ");
        clock.displayTime();

        input.close();
    }
}