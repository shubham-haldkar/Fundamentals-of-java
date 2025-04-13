package polymorphism;


interface IABCBank{
    static void message(){
        System.out.println("welcome to ABC Bank");
    }
    abstract void openAccount();
    abstract void closeAccount();
}

interface  IBankAccount  {
    abstract void deposit();
    abstract void withdraw();
    abstract void balance() ;
}

class SavingsAccount implements  IBankAccount, IABCBank {

    @Override
    public void balance() {
        System.out.println("Balance from savings account");
    }

    @Override
    public void deposit() {
        System.out.println("Deposit from savings account");
    }

    @Override
    public void withdraw() {
        System.out.println("Withdraw from savings account");
    }

    @Override
    public void openAccount() {
        System.out.println("open savings account");
    }

    @Override
    public void closeAccount() {
        System.out.println("close savings account");
    }
    
    
}

class CurrentAccount implements  IBankAccount, IABCBank{

    @Override
    public void balance() {
        System.out.println("Balance from Current account");
    }

    @Override
    public void deposit() {
        System.out.println("Deposit from Current account");
    }

    @Override
    public void withdraw() {
        System.out.println("Withdraw from Current account");
    }
    @Override
    public void openAccount() {
        System.out.println("open Current account");
    }

    @Override
    public void closeAccount() {
        System.out.println("close Current account");
    }
    
}


public class InterfaceExample {
    public static void main(String[] args) {

        IABCBank.message();
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
