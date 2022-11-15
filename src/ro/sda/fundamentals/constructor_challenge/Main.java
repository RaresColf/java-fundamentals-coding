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

public class Main {
    public static void main(String[] args) {
        Account account = new Account("1133",1000,"Brad Pitt","BTP@yahoo.com","0752222222");
        System.out.println(" Ballance is " + account.getBalance());
        System.out.println("Account customer name is " + account.getAccountNumber());

        account.deposit(5000);
        System.out.println("Account balance is: " + account.getBalance());

        account.withdraw(4000);
        System.out.println("Accout balance is: " + account.getBalance());
        System.out.println("----------------------------------------------");

        Account defaultAccount = new Account();
        System.out.println(" Ballance is " + defaultAccount.getBalance());
        System.out.println(" Account customer name is " + defaultAccount.getAccountNumber());
        System.out.println("");



        VipCustomer vipAccount = new VipCustomer("1", 10000, "Sergiu Nicolaescu", "0745222222","0745258896",100000000);
        System.out.println("Credit limit is: " + vipAccount.getCreditLimit());


        VipCustomer anotherVipAccount = new VipCustomer();
        System.out.println(" Ballance is " + anotherVipAccount.getBalance());
        System.out.println(" Account customer name is " + anotherVipAccount.getAccountNumber());
        System.out.println("Credit limit is: " + anotherVipAccount.getCreditLimit());
    }
}
