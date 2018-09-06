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
  
   HashMap<String, String> contacts = new HashMap<String, String>(); 

    /**
     * Enter ph no and name 
     */
    public void enterNumber(String name, String number)
    {
       
       contacts.put(name, number); 
      
        
    }
    
    /**
     * Get phone number and name 
     */
    
    public String lookUpNumber(String name)
    {
        String number = contacts.get(name); 
        return number; 
        
    }

}
