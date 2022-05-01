import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("hello in java");
		AccountDetails ad1=new AccountDetails();
		Account a1= ad1.getAccountDetails();
		a1.withdraw(ad1.getWithdrawAmount());
		
	}
}

