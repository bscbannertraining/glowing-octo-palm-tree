
/** File: Temperature.java
 *
 * Assignment:
 *   1) Add two new methods: 
 *        ncrementTemp()
 *        decrementTemp()
 *      that increment and decrement the current temperature value
 *      by one degree respectively
 *   2) Add a method:
 *        changeTemp( double t ) that adds t to the current temperature
 *   3) Add a main() method to this class
 *   4) In the main method:
 *      create two instances of the Temperature
 *      object each with a different temperature
 *   5) Call the getTemp() method in each of the temperature objects
 *      and print a message with the result to the users screen (Console)
 *   6) Call the incrementTemp(), decrementTemp() and changeTemp(t)
 *      methods several times from the main() 
 *      (use getTemp() to see if the temperature did change)
 * Remember that there should not be any print statements in the 
 * Temperature class - The print statements display the temperature 
 * changes should be in the main() method.
 *
 * Description: This class stores the current temperature.
 * It contains access methods to set and get the temperature.
 *
 */ 
/**
 *
 * @author: A. Garrity
 *
 */

public class Temperature
{
    private double currentTemp;

 /**
 * setTemp() sets the temperature to the given value
 * @param t -- the given value
 */
    public void setTemp(double t)
    {
        currentTemp = t;
    }

 /**
 * getTemp() returns the current temperature
 */ 
    public double getTemp()
    {
        return currentTemp;
    }

 /**
  * incrementTemp() returns the (new) current temperature
  */ 
   public double incrementTemp() 
   { 
       return currentTemp + 1; 
   }
/*
  *
  * decrementTemp() returns the (new) current temperature
  */
 /*
  *
  * changeTemp( double t ) adds t to current temperature and
  * then returns the (new) temperature
  */
 } // Temperature