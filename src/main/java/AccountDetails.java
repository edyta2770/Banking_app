import java.util.Scanner;

public class AccountDetails {

private String name;
private String accountNumber;
private String login;
private long balance;
Scanner scanner = new Scanner(System.in);
public void showAccount () {

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
}



