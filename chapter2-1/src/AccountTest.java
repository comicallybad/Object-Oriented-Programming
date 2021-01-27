import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		Account account1 = new Account("Harrison Ford", 50.00);
		Account account2 = new Account("Billie Eilish", 100.00);
		
		System.out.printf("%s, balance: $%.2f\n", account1.getName(), account1.getBalance());
		System.out.printf("%s, balance: $%.2f\n", account2.getName(), account2.getBalance());
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter deposit amount for account1: ");
		double deposit = input.nextDouble();
		System.out.printf("\nadding %.2f to account1 balance\n\n", deposit);
		account1.deposit(deposit);
		
		System.out.printf("%s, balance: $%.2f", account1.getName(), account1.getBalance());
		System.out.printf("%s, balance: $%.2f", account2.getName(), account2.getBalance());
		
		System.out.print("Enter deposit amount for account2: ");
		deposit = input.nextDouble();
		System.out.printf("\nadding %.2f to account1 balance\n\n", deposit);
		account1.deposit(deposit);
		
		System.out.printf("%s, balance: $%.2f", account1.getName(), account1.getBalance());
		System.out.printf("%s, balance: $%.2f", account2.getName(), account2.getBalance());
		
		input.close();
	}
}
