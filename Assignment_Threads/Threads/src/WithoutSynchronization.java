class BankAccount 
{
    int balance = 1000;

    void withdraw(int amount)  //synchronized void withdraw(int amount) (for synchronized )
    {
        if (balance >= amount) 
        {
            System.out.println(Thread.currentThread().getName() + " is withdrawing...");
            balance -= amount;
            System.out.println("Remaining Balance: " + balance);
        } 
        else 
        {
            System.out.println("Insufficient balance for " + Thread.currentThread().getName());
        }
    }
}

class WithdrawThread extends Thread 
{
    BankAccount acc;

    WithdrawThread(BankAccount acc) 
    {
        this.acc = acc;
    }

    public void run() 
    {
        acc.withdraw(700);
    }
}

public class WithoutSynchronization 
{
	public static void main(String[] args) 
	{
        BankAccount acc = new BankAccount();

        WithdrawThread t1 = new WithdrawThread(acc);
        WithdrawThread t2 = new WithdrawThread(acc);

        t1.setName("User1");
        t2.setName("User2");

        t1.start();
        t2.start();
    }
}