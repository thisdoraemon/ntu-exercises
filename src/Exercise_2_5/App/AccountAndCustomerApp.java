package Exercise_2_5.App;

import Exercise_2_5.Data.Account;
import Exercise_2_5.Data.Customer;

public class AccountAndCustomerApp {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1, "John Doe", 10);

        // Create an account for the customer with an initial balance of $100
        Account account1 = new Account(101, customer1, 100.0);

        // Display account information
        System.out.println("Initial Account Information:");
        System.out.println(account1);

        // Deposit $50 into the account
        account1.deposit(50.0);
        System.out.println("\nAccount Information after Deposit:");
        System.out.println(account1);

        // Withdraw $30 from the account
        account1.withdraw(30.0);
        System.out.println("\nAccount Information after Withdrawal:");
        System.out.println(account1);

        // Try to withdraw an amount greater than the current balance
        account1.withdraw(150.0);
        System.out.println("\nAccount Information after Attempted Overdraw:");
        System.out.println(account1);
    }
}
