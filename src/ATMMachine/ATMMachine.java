package ATMMachine;

import java.util.Scanner;

class ATM {
	float balance=1000;
	int pin;
	String name;
	int dateOfAC;
	String nation;
	long adhaarNo;
	long uni1[]=new long[(int)adhaarNo];
	long uni2[]=new long[9];
	String concatt =  "";

	 public void CreateAcc() {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter your name:");
	        name = sc.nextLine();

	        System.out.println("Enter date of account creation:");
	        dateOfAC = sc.nextInt();
	        sc.nextLine();  

	        System.out.println("Enter your nationality:");
	        nation = sc.nextLine();

	        System.out.println("Enter your Adhaar no:");
	        adhaarNo = sc.nextLong();

	        System.out.println("Create your 4 digit pin:");
	        pin = sc.nextInt();

	        AdharDigits();  

	        checkPin();
	    }

	 public void AdharDigits() {
	        String adhaarStr = Long.toString(adhaarNo);
	        if (adhaarStr.length() >= 5) {
	            concatt = adhaarStr.substring(0, 5); 
	        } else {
	            concatt = adhaarStr; 
	        }
	    }
	
	
	public void ShowACDetails() {
		String uniqueId=name+concatt;
		System.out.println("UniqueID: "+ uniqueId);
		System.out.println("Name: "+ name);
		System.out.println("Date of account creation: "+dateOfAC);
		System.out.println("Nationality: "+ nation);
		System.out.println("Adhaar No: "+ adhaarNo);
		MainMenu();
	}
	
	public void checkPin() {
		System.out.println("Enter your Pin to show Main Menu:");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int enteredPin = sc.nextInt();
		if(enteredPin == pin) {
			MainMenu();
		}else {
			System.out.println("Please enter valid pin:");	
		}
	}
	public void MainMenu() {
		System.out.println("Please select the option:");
		System.out.println("1. Check Balance");
		System.out.println("2. Withdraw Money");
		System.out.println("3. Deposit Money");
		System.out.println("4. Check Account Details");
		System.out.println("5. Exit");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int opt=sc.nextInt();
		if(opt==1) {
			checkBalance();
		}else if(opt==2) {
			withdrawMoney();
		}else if(opt==3) {
			depositMoney();
		}else if(opt==4){
			ShowACDetails();
		}
		else if(opt==5) {
			return;
		}		
			else {
			System.out.println("Please select valid option:");
		}
	}
	public void checkBalance() {
		System.out.println("Your Balance: "+ balance);
		MainMenu();
	}
	@SuppressWarnings("resource")
	public void withdrawMoney() {
		System.out.println("Enter your Amount:");
		Scanner sc =new Scanner(System.in);
	    float amount=sc.nextFloat();
	    
	    if(amount > balance) {
	    	System.out.println("Insufficient Balance");
	    }else {
	    	if((balance-=amount)>1000) {
	    		
	    	balance -= amount;
	    	System.out.println("Money withdraul successfully:");
	    	}
	    	System.out.println("Insufficient Balabce");
	    }
	    	MainMenu();  
	}
	@SuppressWarnings("resource")
	public void depositMoney() {
		System.out.println("Enter your amount to deposit");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
		balance += amount;
		System.out.println("Moeny deposited successfully");
		MainMenu();
	}
}

public class ATMMachine {
	public static void main(String args[]) {
		ATM obj = new ATM();
		obj.CreateAcc();
	}


}
