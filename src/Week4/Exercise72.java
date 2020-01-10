package Week4;

class Account {
    private double balance;
    private String owner;

    public Account(String owner, double balance) {
        this.balance = balance;
        this.owner = owner;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdrawal(double amount) {
        balance -= amount;
    }

    public double balance() {
        return balance;
    }

    @Override
    public String toString() {
        return owner + " balance: " + balance;
    }

    public static void transfer(Account from, Account to, double howMuch) {
        if (from.balance() > howMuch) {
            from.withdrawal(howMuch);
            to.deposit(howMuch);
        } else {
            System.out.println("Not enough funds !");
        }
    }
}

public class Exercise72 extends Account {
    public Exercise72(String owner, double balance) {
        super(owner, balance);
    }

    public static void main(String[] args) {
        //Exercise 72: Accounts
        //Exercise 72.1: Your first account
        //Exercise 72.2: Your first money transfer
        //Exercise 72.3: Money transfers

        // 72.2
        Account myFirstAccount = new Account("myFirst account", 100.0);
        myFirstAccount.deposit(20.0);

        System.out.println(myFirstAccount);

        System.out.println();

        //72.2
        Account mattsAccount = new Account("Matt's account", 1000);
        Account myAccount = new Account("My Account", 0);
        mattsAccount.withdrawal(100.0);
        myAccount.deposit(100.0);

        System.out.println(mattsAccount);
        System.out.println(myAccount);

        System.out.println();

        // 72.3
        Account A = new Account("A", 100.0);
        Account B = new Account("B", 0.0);
        Account C = new Account("C", 0.0);

        A.transfer(A, B, 50.0);
        A.transfer(B, C, 25.0);

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }
}
