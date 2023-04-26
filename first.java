package atm;

import java.util.Scanner;

public class ATM_Process {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int blance=0,deposite,withdraw;

		while(true) {
		
		System.out.println("Choose '1' for Check Blance");
		System.out.println("Choose '2' for Deposite");
		System.out.println("Choose '3' for Withdraw ");
		System.out.println("Choose '4' for Exit");
		System.out.println("Choose the Operation you perform");
		
		
		int no = sc.nextInt();
		
		switch (no) {
		case 1: 
			System.out.println("Your Blance:");
			System.out.println(blance);
	        
			System.out.println();
			
			break;
			
			
			
		case 2: {
			System.out.println("Enter Deposite Amount: ");
			 deposite = sc.nextInt();
			 blance +=deposite;
			 System.out.println("Successfully Deposited");
			 }
					
		System.out.println();
			break;
		
		case 3: {
			System.out.println("Enter your Withdraw amt: ");
			withdraw = sc.nextInt();
			if(blance>=withdraw) {
				blance -= withdraw;
				System.out.println("Successfully Withdraw Amount");
				
			}else {
				System.out.println("Not enogh Mony ");
			}
			
			System.out.println();
			break;
		}
		case 4: {
			System.out.println("Exit");
			System.exit(0);
			System.out.println("Exit");

		}
		
		default:{
			System.out.println("Doesnt any Match");
			System.out.println();
		}
		
		}
		
		
		
//		System.out.println("The process will be Stop press 'YES' or   'NO'  ");
//		String process = sc.next();
//		if(process.equalsIgnoreCase("YES")) {
//			break;
//		}
		System.out.println();
		
		sc.close();

		
		}
		
	//	System.out.println("The Process Stop....! ");
		
	}

}
