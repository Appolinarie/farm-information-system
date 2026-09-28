
import java.util.Scanner;

public class MoMo{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n==== MTN MOMO ====");
            System.out.println("1. Send Money");
            System.out.println("2. Buy Airtime");
            System.out.println("3. Pay Bill");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Check Balance");
            System.out.println("6. More");
            System.out.println("0. Exit");

            System.out.print("Choose an option: ");
            choice = input.nextInt();

            switch (choice) {

                
                case 1:

                    int sendChoice;

                    do {
                        System.out.println("\n==== SEND MONEY ====");
                        System.out.println("1. Send to Number");
                        System.out.println("2. Send to Bank");
                        System.out.println("3. Send to Other Network");
                        System.out.println("0. Back");

                        System.out.print("Choose an option: ");
                        sendChoice = input.nextInt();

                        switch (sendChoice) {

                            case 1:

                                System.out.println("\n==== SEND TO NUMBER ====");

                                System.out.print("Enter phone number: ");
                                String phoneNumber = input.next();

                                System.out.print("Enter amount: ");
                                double amount = input.nextDouble();
                                
                                System.out.println("transaction successful");



















                                

                                if (amount > 0) {
                                    System.out.println("\n==== TRANSACTION ====");
                                    System.out.println("Phone Number: " + phoneNumber);
                                    System.out.println("Amount: " + amount + " RWF");
                                    System.out.println("Transaction successful!");
                                } else {
                                    System.out.println("Invalid amount.");
                                }

                                break;

                            case 2:

                                System.out.println("\n==== SEND TO BANK ====");
                                System.out.println("Bank transfer selected.");
                                break;

                            case 3:

                                System.out.println("\n==== OTHER NETWORK ====");
                                System.out.println("Other network transfer selected.");
                                break;

                            case 0:

                                System.out.println("Going back...");
                                break;

                            default:

                                System.out.println("Invalid option.");
                        }

                    } while (sendChoice != 0);

                    break;

                
                case 2:

                    System.out.println("\n==== BUY AIRTIME ====");
                    System.out.println("1. Buy for self");
                    System.out.println("2. Buy for others");
                    System.out.println("0. Back");

                    break;

                
                case 3:

                    System.out.println("\n==== PAY BILL ====");
                    System.out.println("1. Electricity");
                    System.out.println("2. TV");
                    System.out.println("3. Internet");
                    System.out.println("0. Back");

                    break;

                
                case 4:

                    System.out.println("\n==== WITHDRAW MONEY ====");
                    System.out.println("1. Agent");
                    System.out.println("2. ATM");
                    System.out.println("0. Back");

                    break;

                
                case 5:

                    System.out.println("\n==== CHECK BALANCE ====");
                    System.out.println("Your balance is: 50,000 RWF");

                    break;

                
                case 6:

                    System.out.println("\n==== MORE ====");
                    System.out.println("1. My Account");
                    System.out.println("2. Change PIN");
                    System.out.println("3. Help");
                    System.out.println("0. Back");

                    break;

            
                case 0:

                    System.out.println("\nThank you for using MTN MoMo.");
                    break;

                default:

                    System.out.println("\nInvalid option.");
            }

        } while (choice != 0);

        input.close();
    }
}
