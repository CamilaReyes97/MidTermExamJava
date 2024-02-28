import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your current account balance: ");
        double balance = scanner.nextDouble();


        System.out.printf("Original Balance: $%.2f\n", balance);


        if (balance < 500) {
            balance -= 10;
            System.out.println("A maintenance fee of $10 has been applied.");
        } else {
            System.out.println("No maintenance fee has been applied.");
        }


        System.out.printf("Balance after fee: $%.2f", balance);

        scanner.close();
    }
}
