package ro.sda.fundamentals.constructor_challenge;

public class VipCustomer extends Account{
    double creditLimit;

    public VipCustomer(String accountNumber, double balance, String customerName, String phoneNumber, String email,
                       double creditLimit) {
        super(accountNumber, balance, customerName, phoneNumber, email);
        this.creditLimit = creditLimit;
        System.out.println(" VipCustomer cconstructor with parameters has been called ");
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public VipCustomer(){
        this("0000", 0," Default name ", " Default email ",
                " Default phone number ", 10000000);
        System.out.println("VipCustomer no args constructor has been called ");

    }
}
