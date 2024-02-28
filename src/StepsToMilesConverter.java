import java.util.Scanner;

public class StepsToMilesConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int[] steps = new int[7];

        int totalSteps = 0;

        // Asking the user to input steps for each day
        for (int i = 0; i < days.length; i++) {
            System.out.print("Enter the number of steps taken on " + days[i] + ": ");
            steps[i] = scanner.nextInt();
            totalSteps += steps[i];
        }


        double stepsPerMile = 2112;
        double milesWalked = totalSteps / stepsPerMile;

        System.out.println("Total miles walked during the week: " + milesWalked);

        scanner.close();
    }
}
