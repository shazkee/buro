
package banking;


public class bankclass {
    private int accountNo;
    private int pin;
    private double balance;

   
    public bankclass(int accountNo, int pin, double balance) {
        this.accountNo = accountNo;
        this.pin = pin;
        this.balance = balance;
    }

  
    public int getAccNo() {
        return accountNo;
    }

    public int getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }

   
    public void setAccNo(int accNo) {
        this.accountNo = accNo;
    }
    public void setpin(int pin) {
        this.pin = pin;
    }
    
   
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposit successful. New balance: " + this.balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + this.balance);
        } else if (amount > this.balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

  
    public boolean verifyAccount(int accNo, int pin) {
        return (this.accountNo == accNo && this.pin == pin);
    }
}
