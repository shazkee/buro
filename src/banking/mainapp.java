package banking;

import java.util.Scanner;

public class mainapp {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("What do you feel like doing today?");
            System.out.println("1. Banking");
            System.out.println("2. Shopping");
            System.out.println("3. Pay Bills");
            
            System.out.print("Enter your choice:");
            int choice = sc.nextInt();
            
            
            switch (choice) {
                case 1:
                    bankApp[] bApp = new bankApp[10];
                    int response;
                    int accountCounter = 0;
                    
                    do {
                        
                        System.out.println("1. Register Account");
                        System.out.println("2. Sign In to Account");
                        System.out.println("3. View All Accounts");
                        System.out.print("Enter Selection: ");
                        int action = sc.nextInt();
                        
                        
                        switch (action) {
                            case 1:
                                if (accountCounter < bApp.length) {
                                    System.out.print("Enter Account No.:");
                                    int newAccNo = sc.nextInt();
                                    System.out.print("Set Account Pin:");
                                    int newPin = sc.nextInt();
                                    
                                    bApp[accountCounter] = new bankApp(newAccNo, newPin, 0.0);
                                    System.out.println("Account registered successfully!");
                                    accountCounter++;
                                } else {
                                    System.out.println("You Reached maximum Accounts.");
                                }
                                break;
                                
                            case 2:
                                System.out.print("Enter Account No.:");
                                int accountToLogin = sc.nextInt();
                                System.out.print("Enter Pin No.:");
                                int pinToLogin = sc.nextInt();
                                
                                bankApp loggedInAccount = null;
                                for (bankApp account : bApp) {
                                    if (account != null && account.verifyAccount(accountToLogin, pinToLogin)) {
                                        loggedInAccount = account;
                                        break;
                                    }
                                }
                                
                                if (loggedInAccount != null) {
                                    System.out.println("LOGIN SUCCESS");
                                    int bankingChoice;
                                    do {
                                        
                                        System.out.println("1. View Account Info");
                                        System.out.println("2. Deposit Money");
                                        System.out.println("3. Withdraw Money");
                                        System.out.println("4. Exit");
                                        System.out.print("Enter your choice: ");
                                        bankingChoice = sc.nextInt();
                                        
                                        switch (bankingChoice) {
                                            case 1:
                                                System.out.println("Account Number: " + loggedInAccount.getAccNo());
                                                System.out.println("Current Balance: " + loggedInAccount.getBalance());
                                                break;
                                            case 2:
                                                System.out.print("Enter amount to deposit: ");
                                                double depositAmount = sc.nextDouble();
                                                loggedInAccount.deposit(depositAmount);
                                                break;
                                            case 3:
                                                System.out.print("Enter amount to withdraw: ");
                                                double withdrawAmount = sc.nextDouble();
                                                loggedInAccount.withdraw(withdrawAmount);
                                                break;
                                            case 4:
                                                System.out.println("Exiting account...");
                                                break;
                                            default:
                                                System.out.println("Invalid selection!");
                                        }
                                    } while (bankingChoice != 4);
                                } else {
                                    System.out.println("Invalid Account or PIN.");
                                }
                                break;
                                
                            case 3:
                                System.out.println("Registered Accounts");
                                for (bankApp account : bApp) {
                                    if (account != null) {
                                        System.out.println("Account No: " + account.getAccNo());
                                    }
                                }
                                break;
                                
                            default:
                                System.out.println("INVALID SELECTION!");
                        }
                        
                        System.out.print("\nContinue (1/0): ");
                        response = sc.nextInt();
                    } while (response == 1);
                    break;
                    
                case 2:
                    
                    System.out.println("Able to shop here soon.");
                    break;
                    
                case 3:
                    
                    System.out.println("Able to pay bills here soon.");
                    break;
                    
                default:
                    System.out.println("INVALID SELECTION!");
            }
        }
    }
}

