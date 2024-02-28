import java.util.Scanner;

public class DomainRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What type of domain are you trying to register? (e for education, b for business, o for organization): ");
        String input = scanner.nextLine().toLowerCase(); // Ensure the input is lowercase for uniformity

        switch (input) {
            case "e":
                System.out.println("Type: Education, Recommended Domain: .edu");
                break;
            case "b":
                System.out.println("Type: Business, Recommended Domain: .biz");
                break;
            case "o":
                System.out.println("Type: Organization, Recommended Domain: .org");
                break;
            default:
                System.out.println("Invalid input. Please enter 'e' for Education, 'b' for Business, or 'o' for Organization.");
                break;
        }

        scanner.close();
    }
}
