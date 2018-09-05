import java.util.Random; 
import java.util.*; 
/**
 * Write a description of class RandomTester here.
 * 
 * @author Mandy Arthur
 * @version 2018
 */
public class RandomTester
{
    // instance variables - replace the example below with your own
    private int printOneRandom;
    
    private int howMany; 
    
    /**
     * To test getResponse quickly use this EX6.17
     * https://stackoverflow.com/questions/6726963/random-string-from-string-array-list
     */
    public static String getResponse(){
        int r = (int) (Math.random()*3);
        String name = new String [] {"Yes","No","Maybe"}[r];
        return name;
    }
    
    /**
     * Ex 6.18
     */
     public String getResponseA()
     {
              List<String> givenList = Arrays.asList("Yes","No","Maybe","ok", "that's bad", "Alright then...");
            Random rand = new Random();
            
      
            int randomIndex = rand.nextInt(givenList.size());
            String randomElement = givenList.get(randomIndex);
            
            return randomElement; 
        
    }
 
    /**
     * Throw dice
     */
    
    public int throwDice(){
        
        Random Dice = new Random(); //Creating a Random object
        int index = Dice.nextInt(5)+1 ; //simply add 1 to the result of the nextInt() method, to pick a number btn 1-6 inclusively add one to the result
        return index; 
        
    }
    
    
    
    /**
     * Prints one random number 
     * Reference: https://www.thoughtco.com/how-to-generate-random-numbers-2034206
     */
    public int printOneRandom()
    {
        
        Random Generator = new Random(); //Creating a Random object
        int index = Generator.nextInt(10); //nextInt pick any number less than whatever is in the (), in tis case nothing
        return index; 
    }
    
    /**
     * Ex 6.19 Takes a parameter (max) and generates a random number in the range 1 to max (inclusive)
     */
    public void setMaxRandom(int max)
    {
        Random maxRandom = new Random(); //Creating a Random object     
        int index = maxRandom.nextInt(max)+1 ; //simply add 1 to the result of the nextInt() method, to pick a number btn 1-max inclusively add one to the result
        System.out.println("random number with a maximum of" + max + " : "+ index); //SYS.OUT for void methods 
        
    }
    /**
     * Ex 6.20 Random within a range (min - max) 
     * https://www.mkyong.com/java/java-generate-random-integers-in-a-range/
     */
    
    public int randomInRange(int min, int max)
    {
        Random randomInRange = new Random();
		return randomInRange.nextInt((max - min) + 1) + min; 
		// max - min sets the range (max amount of possible answers
		// +1 to include the max value 
		// + min to ensure that the lowest range (0) + min gives you the min range you had set 
    }
    
    /**
     * Prints multiple random numbers 
     */
    
    public void multiRandNumbers(int howMany)
    {
                Random MultiNumbers = new Random(); // Create Random Object 
                int c; // intialize the amount
                
                if (howMany >0){ // if how many is greater than zero 
                    for (c = 1; c <= howMany; c++) {
              System.out.println("Your #" + c+ " random number: "+ MultiNumbers.nextInt(10)); // print this 
            }
                
        }else{ // if not
            System.out.println("You asked for zero random numbers.Why?"); // print this instead of spewing error
                
            }
    
        }
}

