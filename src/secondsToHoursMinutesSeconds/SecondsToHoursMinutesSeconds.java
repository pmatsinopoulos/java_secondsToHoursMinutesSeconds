package secondsToHoursMinutesSeconds;

import java.util.Scanner;

public class SecondsToHoursMinutesSeconds {

    public static void main(String[] args) {
        final int NUMBER_OF_SECONDS_IN_HOUR = 3600;
        final int NUMBER_OF_SECONDS_IN_MINUTES = 60;

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Give me number of seconds: ");
        int numberOfSeconds = scanner.nextInt();
        // 5000 seconds

        int numberOfHours = numberOfSeconds / NUMBER_OF_SECONDS_IN_HOUR;
        int remainingSeconds = (numberOfSeconds % NUMBER_OF_SECONDS_IN_HOUR);
        int numberOfMinutes = remainingSeconds / NUMBER_OF_SECONDS_IN_MINUTES;
        remainingSeconds = remainingSeconds % NUMBER_OF_SECONDS_IN_MINUTES;

        System.out.printf("%d hours, %d minutes, %d seconds\n", numberOfHours, numberOfMinutes, remainingSeconds);

        scanner.close();
    }

}
