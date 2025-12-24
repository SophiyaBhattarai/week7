package mainn;


/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    int accountnumber;
    String holdername;
    double balance;
    
    public BankAccount(int a, String h, double b)
    {
        this.accountnumber=a;
        this.holdername=h;
        this.balance=b;
    }
    
    void  deposit(double amount)
    {
       balance=balance+amount;
       System.out.println(amount + "deposited succesfully");
    }
    
    void withdraw(double amount)
    {
        if(amount<=balance)
        {
            balance=balance-amount;
            System.out.println(amount+"withdrawan succesfully");
        }
        else
        {
            System.out.println("insufficient balance");
        }
    }
    
    void displaybalance()
    {
      System.out.println("AccountNumber:"+accountnumber);
      System.out.println("HolderName:"+holdername);
      System.out.println("CurrentBalance:"+balance);
    }
}