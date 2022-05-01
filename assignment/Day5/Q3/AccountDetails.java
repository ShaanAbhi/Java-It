import java.util.Scanner;

class AccountDetails{
	public  Account getAccountDetails() {
		int accountId=-1; String accountType=""; int balance=0;
		Scanner sc=new Scanner(System.in);
		while(accountId<=0) {
			try {
				
				System.out.println("please enter the account ID");
				accountId=sc.nextInt();
				sc.nextLine();
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("please enter a valid account Id");
			}
			if(accountId<=0) {
				System.out.println("please enter valid detais and valid formate");
			}
		}
		
		
		
		while(accountType=="") {
			try {
				System.out.println("please enter the account type");
				accountType=sc.nextLine();
			} catch (Exception e) {
				
				System.out.println("please enter a valid account type");
				
			}
			if(accountType=="") {
				System.out.println("please enter valid detais and valid formate");
			}
		}
		
		
		while(balance<=0) {
			try {
				System.out.println("please enter the balance");
				balance=sc.nextInt();
				sc.nextLine();
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("please enter a valid amount");
			}
			if(balance<=0) {
				System.out.println("please enter valid detais and valid formate");
			}
		}
		
		
		
		
		Account a1=new Account( accountId,  accountType,  balance) ;
		//sc.close();
		return a1;
	}
	
	
	
	public int getWithdrawAmount() {
		Scanner sc1=new Scanner(System.in);
		int amount=0;

		
		
		while(amount<=0) {
			try {
				System.out.println("enter the withdrawal amount :");
				amount=sc1.nextInt();
				System.out.println("amount :"+amount);
				sc1.nextLine();
			} catch (Exception e) {
				System.out.println("please enter a valid amount"+e);
				sc1.nextLine();
			}
		}
		sc1.close();
		return amount;
	}
	
	
	public static void main(String[] args) {
		
	}
}