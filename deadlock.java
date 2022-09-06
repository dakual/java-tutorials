public class App 
{
	public static void main(String args[]) {
        Account account1 = new Account(7000);
        Account account2 = new Account(10000);
        Account account3 = new Account(5000);
    
        Thread t1 = new Thread(new SyncThread(account1, account2), "t1");
        Thread t2 = new Thread(new SyncThread(account2, account3), "t2");
        Thread t3 = new Thread(new SyncThread(account3, account1), "t3");
        
        try {
            t1.start();
            Thread.sleep(5000);
            t2.start();
            Thread.sleep(5000);
            t3.start();            
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
	}

}

public class Account {
  private int balance;

  public Account(int balace) {
    this.balance = balace;
  }

  public static void transfer(Account sourceAccount, Account targetAccount, int amount) {
      sourceAccount.withdraw(amount);
      targetAccount.deposit(amount);
  }

  private void deposit(int amount) {
      balance += amount;
  }

  private void withdraw(int amount) {
      balance -= amount;
  }

  public int getBalance() {
      return balance;
  }
}

public class SyncThread implements Runnable {
  private Account account1;
  private Account account2;

  public SyncThread(Account ac1, Account ac2) {
    this.account1 = ac1;
    this.account2 = ac2;
  }

  @Override
  public void run() {
    String threadName = Thread.currentThread().getName();
    System.out.println(threadName + " acquiring lock on " + account1);
    synchronized(account1) {
      System.out.println(threadName + " acquired lock on " + account1);
      doWork();

      System.out.println(threadName + " acquiring lock on " + account2);
      synchronized(account2) {
        System.out.println(threadName + " acquired lock on " + account2);
        doWork();
      }
      System.out.println(threadName + " released lock on " + account2);
    }
    System.out.println(threadName + " released lock on " + account1);
    System.out.println(threadName + " finished execution.");    
  }

  private void doWork() {
    try {
      Thread.sleep(3000);
      Account.transfer(account1, account2, 650);

      System.out.println("Account 1 balace: " + account1.getBalance());
      System.out.println("Account 2 balace: " + account2.getBalance());
    } catch(InterruptedException e) {
      e.printStackTrace();
    }
  }
}