import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int hour1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();

        int hour2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();

        int convertedHour1 = hour1 * 3600 ;
        int convertedMinutes1 = minutes1 * 60;
        int totalFirstHour = convertedHour1 + convertedMinutes1 + seconds1;

        int convertedHour2 = hour2 * 3600;
        int convertedMinutes2 = minutes2 * 60;
        int totalSecondHour = convertedHour2 + convertedMinutes2 + seconds2;

        int timePassed = totalSecondHour - totalFirstHour;

        System.out.println(timePassed);
    }
}