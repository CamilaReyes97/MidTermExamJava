import java.util.Scanner;

public class PrintSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.print("Enter a symbol (special character like *): ");
            String symbol = scanner.next();
            System.out.print("Enter an integer value: ");
            int value = scanner.nextInt();

            if (value < 0) {
                System.out.println("Negative value entered. Program will end.");
                break;
            }

            for (int i = 0; i < value; i++) {
                System.out.print(symbol);
            }
            System.out.println();

            System.out.print("Would you like to try a different symbol/character? (yes/no): ");
            input = scanner.next();
        } while (input.equalsIgnoreCase("yes"));

        System.out.println("Goodbye!");
        scanner.close();
    }
}
