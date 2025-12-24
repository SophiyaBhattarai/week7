package mainn;


/**
 * Write a description of class mainn here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mainn
{
    public static void main(String[] args)
    {
        BankAccount b1=new BankAccount(4567,"Aayusha",56000);
        
        BankAccount b2=new BankAccount(789,"Juna",57000);
        
        b1.deposit(3000);
        b1.withdraw(1000);
        
        b2.deposit(4000);
        b2.withdraw(2000);
        
        System.out.println("Final account details:");
        b1.displaybalance();
        b2.displaybalance();
    }
}