import java.util.ArrayList;
import java.util.Random; 
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string. This is the second version 
 * of this class. This time, we generate some random behaviour by randomly selecting a plrease from a predefined list of responses. 
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */
public class Responder
{
    private Random randomGenerator; 
    private ArrayList<String> responses; 
    
    /**
     * Construct a Responder 
     */
    public Responder()
    {
        randomGenerator = new Random(); 
        responses = new ArrayList<>(); 
        fillResponses(); 
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        // Pick a random number for the index in the defaukt response list 
        //The number will be between 0 (inclusive) and the size of the list (exclusive)
        int index = randomGenerator.nextInt(responses.size()); 
        return responses.get(index);
    }
    
    /**
     * Build up a list of default responses from which we can pick oneif we dont know what else to say
     */
    private void fillResponses()
    {
        responses.add("That sounds odd, Could you describe this in more detail?"); 
        responses.add("That's a first! I haven't hear that complaint before.\n"+ 
        "What is your system configuration?"); 
        responses.add("I need a bit more information to process your query. "); 
        responses.add("Have you check that you don't have a dll conflict? "); 
        responses.add("That is covered in the manual. Have you checked the manual for guidance?"); 
        responses.add("Hmmm... This error description is a little vague. Could you describe the \n" + 
                        "error better? Maybe with the help of an expert around you who can help with the description?"); 
        responses.add("That's not a bug. It's a feauture!\n"+ 
                        "Clearly not a useful one for you in this case, I understand."); 
        responses.add("Could you elaborate on that for us?"); 
        responses.add("Have you tried running the app on your phone."); 
        responses.add("I just checked StackOverflow - they don't know either."); 
        responses.add("Try Rubber Duck Debugging."); 
    }
    
}
