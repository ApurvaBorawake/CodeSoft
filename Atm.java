
		import java.util.Scanner;

		public class Atm {
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        double bal = 1000.00; 

		        while (true) {
		            System.out.println("ATM Menu:");
		            System.out.println("1. Check Balance");
		            System.out.println("2. Withdraw");
		            System.out.println("3. Deposit");
		            System.out.println("4. Exit");
		            System.out.print("Select an option: ");

		            int choice = sc.nextInt();

		            switch (choice) {
		                case 1:
		                    System.out.println("Current Balance: $" + bal);
		                    break;
		                case 2:
		                    System.out.print("Enter the amount to withdraw: $");
		                    double withdrawAmount = sc.nextDouble();
		                    if (withdrawAmount <= bal) {
		                        bal -= withdrawAmount;
		                        System.out.println("Withdrawn: $" + withdrawAmount);
		                    } else {
		                        System.out.println("Insufficient balance.");
		                    }
		                    break;
		                case 3:
		                    System.out.print("Enter the amount to deposit: $");
		                    double depositAmount = sc.nextDouble();
		                    if (depositAmount > 0) {
		                        bal += depositAmount;
		                        System.out.println("Deposited: $" + depositAmount);
		                    } else {
		                        System.out.println("Invalid deposit amount.");
		                    }
		                    break;
		                case 4:
		                    System.out.println("Thank you for using the ATM. Goodbye!");
		                    System.exit(0);
		                default:
		                    System.out.println("Invalid option. Please select a valid option.");
		                    break;
		            }
		        }
		    }

}
