package Sep23.inheritence.mutlilevel;

public class BankAccount {
    public BankAccount(int deposit) {
    }
public void deposit(){
    System.out.println("Deposit a cash");
}
    public void withdraw(){
        System.out.println("Withdraw a cash");
    }
}
class SavingsAccount extends BankAccount{
    public SavingsAccount(int deposit) {
        super(deposit);
    }
    public void withdraw() {
        int withdraw = 0;
        if (withdraw >= 0) {
            System.out.println("Account withdrawn");
        } else {
            System.out.println("Account fails to withdraw");
        }
    }
        public static void main (String[]args){
            BankAccount Ban = new BankAccount(100);
            SavingsAccount Sav = new SavingsAccount(70);
            Ban.deposit();
            Sav.withdraw();
            System.out.println("No Balanace");

        }
    }

