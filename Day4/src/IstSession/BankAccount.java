package IstSession;

public class BankAccount {
    private int accno;
    private double balance;
    private int pin;
    private boolean locked;
    private int wronngAttempt;

    public BankAccount(int accno,int pin,double balance){
        this.accno=accno;
        this.pin=pin;
        this.balance=balance;
        this.wronngAttempt=0;
        this.locked=false;
    }
    public void deposit(double amount){
        if(!locked && amount>0){
            balance+=amount;
            System.out.println("Deposited :"+amount);
        }
        else {
            System.out.println("Deposit not possilble!");
        }
    }

    public void withdraw(double amount, int enteredpin){
        if(locked){
            System.out.println("Account locked");
            return;
        }
        if(enteredpin!=pin){
            wronngAttempt++;
            System.out.println("wrong pin");
            if(wronngAttempt>=3){
                locked=true;
                System.out.println("account is locked");
            }
            return;
        }
        wronngAttempt=0;
        if(amount>0 && amount<=25000 && amount<balance){
            balance-=amount;
            System.out.println("withdraw:"+amount);
        }
        else {
            System.out.println("withdraw failed");
        }
    }

    public double getBalance(int enteredpin) {
        if(!locked && enteredpin==pin){
            return balance;
        }
        System.out.println("access denaied");
        return -1;
    }

    public boolean isAccountLocked(){
        return locked;
    }
    public static void main(String[] args){
        BankAccount acc = new BankAccount(1234,1111,500000);
        acc.deposit(1000);
        acc.withdraw(20000,1191);
        System.out.println("Balance:"+acc.getBalance(1111));
    }
}
