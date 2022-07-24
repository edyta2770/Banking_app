import java.util.Scanner;

public class AccountDetails {

    private String name;
    private String accountNumber;
    private String login;
    private long balance;
    Scanner scanner = new Scanner(System.in);

    public void showAccount() {

        System.out.println("Your Account name is" + name);
        System.out.println("Your Account number is" + accountNumber);
        System.out.println("Your  login is" + login);
        System.out.println("Your Account balance is" + balance);
    }

    public void createAccount() {
        System.out.println("Provide account name");
        name = scanner.next();
        System.out.print("Provide account number");
        accountNumber = scanner.next();
        System.out.print("Provide login");
        login = scanner.next();
        System.out.print("Provide account balance");
        balance = scanner.nextLong();
    }

    public void deposit() {
        System.out.println("how much money is to be paid?");
        long money;
        money = scanner.nextLong();
        balance = money + balance;


    }

    public void withdrawal() {
        System.out.println("Enter the withdrawal amount");
        long withdrawalAmount;
        withdrawalAmount = scanner.nextLong();


        if (balance < withdrawalAmount) {
            System.out.println("Lack of sufficient resources");
        } else {
            balance = balance - withdrawalAmount;

        }

    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
}



