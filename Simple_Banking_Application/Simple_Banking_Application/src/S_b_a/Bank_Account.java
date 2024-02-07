package S_b_a;

import java.util.Scanner;

public class Bank_Account {
	
	double balance;
	double previousTransaction;
	String customerName ;
	String customerId;

	
//	User Deposit method
	void Deposit(int amount) {
		if(amount != 0) {
			balance = balance + amount;
			previousTransaction = amount ;
		}
	}
	
//	User Withdraw method
	void Withdraw(int amount) {
		if(amount != 0) {
			balance = balance - amount;
			previousTransaction = -amount ;
		}
	}
	
//	User Previous_Transaction method
	void getPrevious_Transaction() {
		if(previousTransaction > 0) {
			System.out.println("Deposited: "+ previousTransaction );
		}
		else if(previousTransaction < 0) {
			System.out.println("Withdraw: "+ Math.abs(previousTransaction));	
		}
		else {
			System.out.println(" No_transaction_Occured ");
		}
	}
	
//	Show info and option method
	void showMenu(){
		char option ='\0';
		Scanner scr = new Scanner(System.in);
		
		System.out.println("WelCome to Vishwa_Bank");
		System.out.println("Enter Your Name:");
		customerName = scr.next();
		System.out.println("Enter Your Bank_Id:");
		customerId = scr.next();
		System.out.println("\n");
		System.out.println("Name: "+ customerName );
		System.out.println("ID: " + customerId);
		System.out.println("A. Check Balance ");
		System.out.println("B. Deposite ");
		System.out.println("C. Withdraw ");
		System.out.println("D. Previous Transcation ");
		System.out.println("E. Exit ");
		
		do {
			System.out.println("***************************************");
			System.out.println(" Enter an Option");
			System.out.println("---------------------------------------");
			option = scr.next().charAt(0);
			System.out.println("\n");
			
			switch(option) {
			case 'A':
				System.out.println("---------------------------------------");
				System.out.println("Balance = ₹"+balance);
				System.out.println("---------------------------------------\n");
				break;
				
			case 'B':
				System.out.println("---------------------------------------");
				System.out.println("Enter an amount to deposite: ");
				int amount_d = scr.nextInt();
				Deposit(amount_d);
				System.out.println("Amount: ₹"+ amount_d +" Deposit Successfully");
				System.out.println("---------------------------------------\n");
				break;
			case 'C':
				System.out.println("---------------------------------------");
				System.out.println("Enter an amount to withdraw: ");
				int amount_w = scr.nextInt();
				Withdraw(amount_w);
				System.out.println("Amount: ₹"+ amount_w +" Withdraw Successfully");
				System.out.println("---------------------------------------\n");
				break;
			case 'D':
				System.out.println("---------------------------------------");
				getPrevious_Transaction();
				System.out.println("---------------------------------------\n");
				break;
			case 'E':
				System.out.println("\\\\\\\\\\_Thank-You_//////////");
				break;
			default :
				System.out.println("---------------------------------------");
				System.out.println("Invallid Option !!! \nPlease enter again");
				System.out.println("---------------------------------------\n");
				break;	
			}
		}while(option != 'E');
		System.out.println("---------------------------------------");
		System.out.println("Thank-You for using our Services \nHave a Great Day");
		System.out.println("---------------------------------------\n");
		
		
		
	}
	
}
