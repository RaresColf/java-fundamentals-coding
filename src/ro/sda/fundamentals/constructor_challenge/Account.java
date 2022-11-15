package ro.sda.fundamentals.constructor_challenge;
/*
        Create a new class for bank account
        Create field for the account number, balance, customer name, email and phone number.
        Create getters and setters for each field

        Create to additional methods
        1. To allow the customer to deposit funds (this should increment the balance field).
        2. To allow the customer to withdraw funds.

        This should deduct from the balance field, but not allow the withdrawal
        to complete if their are insufficient funds.

        You will want to create various code in the Main class (the one create by IntelliJ)
        to confirm your code is working.
        Add some System.out.println's in the two methods above as well.
        */


/*
      Create a new class VipCustomer
      It should have 3 fields name, credit limit, and email address.
      create 3 constructors
      1st constructor empty should call the constructor with 3 parameters with default values
      2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
      3rd constructor should save all fields.
      create getters only for this using code generation of IntelliJ as setters wont be needed
      test and confirm it works.
      */
public class Account {
    public String accountNumber;
    public double balance;
    public String customerName;
    public String phoneNumber;
    public String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Account() {
        this("0000", 0," Default name ", " Default email ", " Default phone number ");
        System.out.println(" Account no args constructor has been called ");
    }

    public Account(String accountNumber, double balance, String customerName, String phoneNumber, String email) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void deposit(double deposiAmount) {
        if (deposiAmount < 0) {
            System.out.println(" You cannot deposit amounts less than 0");
        } else {
            this.balance += deposiAmount;
            System.out.println("Deposit of" + deposiAmount + " has been made. New balance is: " + this.balance);
        }
    }

    public void withdraw(double withdrawAmount) {
        if(withdrawAmount < 0) {
            System.out.println("You cannot withdraw amounts less than 0");
        } else {
            if ( this.balance - withdrawAmount < 0) {
                System.out.println("Only " + this.balance + " available. Withdraw will not processed ");
            } else {
                this.balance -= withdrawAmount;
                System.out.println("Withdrawal of " + withdrawAmount + "has been processed. Remaining balalnce is " + this.balance);
            }
        }
    }


}
