import java.util.HashMap;
/**
 * Write a description of class MapTester here.
 * Use HashMap to implement contacts list 
 * 
 * @author A Arthur
 * @version 2018
 */
public class MapTester
{
    // instance variables - replace the example below with your own
  
    private HashMap<String, String> contacts; 

    /**
     * Enter ph no and name 
     */
    public enterNumber()
    {
       contacts = new HashMap<String, String>(); 
       contacts.put(name, number); 
       contacts.put("Rob", "0399303202"); 
        
    }
    
    /**
     * Get phone number and name 
     */
    
    public String lookupNumber(String name)
    {
        String number = contacts.get(name); 
        return number; 
        
    }

}
