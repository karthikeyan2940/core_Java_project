package PackageBank;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.*;

public class RBI {
	public static void main(String[] args) {
		System.out.println("---------Welcome To National Banking System--------");
		System.out.println("\n");
		System.out.println("Do you want to open an account yes/No");
		Scanner sc = new Scanner(System.in);
		String choice=sc.nextLine();
		
		if(choice.equals("yes")) {
			OpenAccount obj =new OpenAccount();
			obj.createAccount();
			
		}
		if(choice.equals("No")) {
			BankAccount obj1 =new BankAccount();
			obj1.shoMenu();
			
		}
	}

}
class OpenAccount {
	String name;
	String dob;
	int accountNumber;
	String accountType;
	String bank;
	
	
	void createAccount() {
		System.out.println("In which Bank you need to create an account  1.SBI  2.PNB 3.ICICI");
		Scanner sc = new Scanner(System.in);
		int choiceBank=sc.nextInt();
		
		if(choiceBank==1) {
			bank="SBI";
		}
		if(choiceBank==2) {
			bank="PNB";
		}
		if(choiceBank==3) {
			bank="ICICI";
		}
		
		System.out.println("Enter your Name :");
		name=sc.nextLine();
		System.out.println("Enter your DOB:");
		dob= sc.nextLine();
		System.out.println("What Type of Account  you want to open: 1.Savings 2.Current");
		int choice=sc.nextInt();
		
		if(choice==1) {
			accountType="Savings";
		}

		if(choice==2) {
			accountType="Current";
		}
		
		System.out.println("Your Account has been created using Following details");
		System.out.println("Bank:" + bank);
		System.out.println("Name:" + name);
		System.out.println("D.O.B:" + dob);
		System.out.println("Account Type:" + accountType);
		System.out.println("Account Number:" + Math.random());
		System.out.println("\n");
		
		BankAccount obj1=new BankAccount();
		obj1.shoMenu();
		sc.close();
		
	}
}

class BankAccount{
	String customerName;
	String customerId;
	String accountType;
	int balance;
	int previousTransaction;
	double totalIntrest;
	 
	
	void calaculateInterest(double balance) {
		System.out.println("What Type of Account do you have 1.Savings 2.Current");
		Scanner sc = new Scanner(System.in);
		int choice=sc.nextInt();
		 
		if(choice==1) {
			accountType="Savings";
			int r = 5;
			int t;
			System.out.println("Enter Year to calculate Interest");
			t=sc.nextInt();
			
			double finalAmount= balance*(1+r*t)/100;
			totalIntrest = finalAmount - balance;
			System.out.println("Total Interest earned is: " + totalIntrest);
		}
		 
		if(choice==2) {
			accountType="Current";
			int r = 8;
			int t,n;
			System.out.println("Enter Year to calculate Interest");
			t=sc.nextInt();
			System.out.println("Enter the Frequency that Intrest has been compound in a year");
			n=sc.nextInt();
			
			double finalAmount= balance*(Math.pow((1+r/n), n*t));
			totalIntrest= finalAmount - balance;
			System.out.println("Total Intrest Earned is :" + totalIntrest);
			sc.close();
			
		
		
		
	}
}
	void deposite(int amount) {
		if(amount!=0) {
			balance = balance + amount;
			System.out.println("Balance After Deposite:" + balance);
			previousTransaction = amount;
		}
	}
	void withDraw(int amount) {
		if(amount!=0) {
			balance = balance - amount;
			System.out.println("Balance After Withdraw:" + balance);
			previousTransaction = -amount;
		}
	}
	void getpreviousTransaction() {
		FileOutputStream out;
		 PrintStream p;
		 
		 try {
			 out = new FileOutputStream("c:\\User");
			 p= new PrintStream(out);
			 
			 if(previousTransaction > 0) {
				 p.append("Deposited" + previousTransaction );
				 System.out.println("Deposited\" + previousTransaction");
				 
			 }
			 else if(previousTransaction < 0) {
				 p.append("Withdraw" + previousTransaction );
				 System.out.println("Withdraw" + Math.abs(previousTransaction));
				 
				 
			 }else {
				 System.out.println("No Transaction Occured.");
			 }
			 p.close();
				 
				 
			 
			 
		 }catch(Exception e) {
			 System.out.println("Error in Printting the Data:" + e);
		 }
	}
void shoMenu() {
	char option='\0';
	Scanner sc = new Scanner(System.in);
	System.out.println("Welcome to the Menu");
	System.out.println("\n");
	System.out.println("A. Check Balance");
	System.out.println("B. Deposite Amount");
	System.out.println("C. Withdraw Amount");
	System.out.println("D. See Previous Transcation");
	System.out.println("E. Calculate Interest");
	System.out.println("F. Exit");
	
	do {
		System.out.println("-------------------------------");
		System.out.println("Enter an Option:");
		System.out.println("-------------------------------");
		option= sc.next().charAt(0);
		System.out.println("\n");
		
		switch (option) {
		case 'A':
			System.out.println("-----------------------------");
			System.out.println("Balance =" + balance);
			System.out.println("\n");
			break;
		case 'B':
			System.out.println("------------------------------");
			System.out.println("Enter an Amount to Deposite:");
			int amount = sc.nextInt();
			deposite(amount);
			System.out.println("\n");
			break;
		case 'C':
			System.out.println("--------------------------------");
			System.out.println("Enter an Amount to Withdraw:");
			int amount2 = sc.nextInt();
			withDraw (amount2);
			System.out.println("\n");
			break;
		case 'D':
			System.out.println("----------------------------------");
			getpreviousTransaction();
			System.out.println("\n");
			break;
		case 'E':
			System.out.println("------------------------------------");
			calaculateInterest(balance);
			System.out.println("\n");
			break;
		case'F':
			System.out.println("-------------------------------------");
			break;
		default :
			System.out.println("Entered Invalid Option, Try Again.");
			break;
		}
	}while(option !='F');
	System.out.println("Thank you For using our service.");
	sc.close();












}
}





















