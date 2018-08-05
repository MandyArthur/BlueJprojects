
/**
 * Challenge 2.93 & 2.94 Heater Exercise
 * 
 * @author M Arthur
 * @version 2018
 */
public class Heater
{
    // instance variables - replace the example below with your own
 // current temperature  
        private double temperature; 
        // change increment value 
        private double min; 
        // change decrement value
        private double max;
        // Increment by set amount 
        private double increment; 
      
    

    /**
     * Constructor for objects of class Heater
     */
    public Heater( double heaterTemperature, double heaterMin, double heaterMax)
    {  temperature = heaterTemperature; 
        min = heaterMin; //field creater for max value
        max = heaterMax; // field created for min value 
        increment = 5.0; // Increment initially set to 5.0
}

/**
 * Increase temp by 5 degrees.
 */
public void warmer (){
    // if the temperature is greater than max value; temp = max value
    // if temp is lesser, manipulate by given increment 
    
    // Perform the action first to be able to evaluate whether we need to limit the decrement. 
   temperature +=increment; // Method uses increment field to manipulate temperature request
    if (temperature >= max){//If the new value requested is lower than min, then show min limit
        temperature = max; } 
        else {
    this.temperature = temperature; // Orelse this new temperature is the set temperature.
}
}


/**
 * Decrease temp by 5 degrees.
 */
public void cooler (){
    // if temp is less than min; temp = min  value; 
    // if temp is more than min; manipulate by given increment
    // Perform the action first to be able to evaluate whether we need to limit the decrement. 
     temperature -=increment; // Method uses increment field to manipulate temperature request
    if(temperature <= min){ //If the new value requested is lower than min, then show min limit
        temperature = min; }
        else {
            this.temperature = temperature; // Orelse this new temperature is the set temperature. 
   
}
}
/**
 * Sets increment value by user if intial increment value of 5.0 not acceptable
 * However, if negative value is inputted, the increment value will remain unchanged. 
 * As in negative value cannot be assigned
 */
public void setIncrement( double increment) {
    if (increment < 0) {
        increment = increment; } // if negative, increment remains same as before
        else{
    this.increment =  increment; } // if positive, value modified accordingly
} 
    
}



