
/**
 * Write a description of class testClockDisplay tests changes to ClockDisplay Class
 * 
 * @author M Arthur
 * @version 2018
 */
public class testClockDisplay
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class testClockDisplay
     */
    public testClockDisplay()
    {
       
    }

   public void test(){
       ClockDisplay clock = new ClockDisplay(); 
       
       clock.setTime(22,30); 
       System.out.println(clock.getTime()); 
       
       clock.setTime(10,30); 
       System.out.println(clock.getTime()); 
       
         clock.setTime(12,30); 
       System.out.println(clock.getTime()); 
       
         clock.setTime(00,30); 
       System.out.println(clock.getTime()); 
       
               clock.setTime(00,00); 
       System.out.println(clock.getTime()); 
       
               clock.setTime(12,00); 
       System.out.println(clock.getTime()); 
       
    }
}
