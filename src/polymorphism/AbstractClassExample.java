package polymorphism;

abstract class ABCBank{
    static void message(){
        System.out.println("welcome to ABC Bank");
    }
    abstract void openAccount();
    abstract void closeAccount();
}

abstract class BankAccount extends ABCBank{
    abstract void deposit();
    abstract void withdraw();
    abstract void balance() ;
}

class SavingsAccount extends BankAccount{

    @Override
    void balance() {
        System.out.println("Balance from savings account");
    }

    @Override
    void deposit() {
        System.out.println("Deposit from savings account");
    }

    @Override
    void withdraw() {
        System.out.println("Withdraw from savings account");
    }

    @Override
    void openAccount() {
        System.out.println("open savings account");
    }

    @Override
    void closeAccount() {
        System.out.println("close savings account");
    }
    
    
}

class CurrentAccount extends BankAccount{

    @Override
    void balance() {
        System.out.println("Balance from Current account");
    }

    @Override
    void deposit() {
        System.out.println("Deposit from Current account");
    }

    @Override
    void withdraw() {
        System.out.println("Withdraw from Current account");
    }
    @Override
    void openAccount() {
        System.out.println("open Current account");
    }

    @Override
    void closeAccount() {
        System.out.println("close Current account");
    }
    
}

public class AbstractClassExample {
    public static void main(String[] args) {

        ABCBank.message();
        SavingsAccount sa = new SavingsAccount();
        sa.openAccount();
        sa.balance();
        sa.deposit();
        sa.withdraw();
        sa.closeAccount();

        CurrentAccount ca = new CurrentAccount();
        ca.openAccount();
        ca.balance();
        ca.deposit();
        ca.withdraw();
        ca.closeAccount();
    }

}
