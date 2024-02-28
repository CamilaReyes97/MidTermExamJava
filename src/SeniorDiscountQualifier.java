import java.util.Scanner;
import java.time.LocalDate;

public class SeniorDiscountQualifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your year of birth: ");
        int yearOfBirth = scanner.nextInt();

        // Calculate age
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - yearOfBirth;

        // Check if 55 or older
        if (age >= 55) {
            System.out.println("Congratulations! You qualify for our senior discount.");
        } else {
            int yearsUntilDiscount = 55 - age;
            System.out.println("You did not qualify for our senior discount at this time.");
            System.out.println("You need to wait " + yearsUntilDiscount + " more year(s) to qualify.");
        }

        scanner.close();
    }
}
