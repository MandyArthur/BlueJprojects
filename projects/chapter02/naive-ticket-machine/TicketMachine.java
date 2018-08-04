/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    
    private int bid; 
    
    

    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
  
    public TicketMachine(int cost)
    

    {
        price = 1000;
        bid = cost; 
        balance = 0;
        total = 0;
    }
    
    public void empty(){
        
        total = 0; 
    }
        
    public int yourBid()
    {
        return bid;
    }
    
        /**
     * Return prompt.
     */
    public void prompt()
    {
       System.out.println("Please Insert the correct amount of money. "); 
    }
    
          /**
     * Return Show price of ticket.
     */
    public void showPrice()
    {
       System.out.println("The price of the ticket is " + price + " cents. "); 
    }
    
    
    /**
     * Return the price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }

    
    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public int getAmount()
    {
        return balance;
    }

        /**
     * Return the total amount.
     */
    public int getTotal()
    {
        return total;
    }
    
    
    /**
     * Receive an amount of money from a customer.
     */
    public void insertMoney(int amount)
    {
        balance = balance + amount;
    }

    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    public void printTicket()
    {
        // Simulate the printing of a ticket.
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# Ticket");
        System.out.println("# " + price + " cents.");
        System.out.println("##################");
        System.out.println();
        
        System.out.println("My cat has green eyes."); 

        // Update the total collected with the balance.
        total = total + balance;
        // Clear the balance.
        balance = 0;
    }
    
    public void setPrice (int cost)
    {
        cost = price; 
    }
    
  
    
    public void discount (int amount){
    
    price = price - amount;  
}
}