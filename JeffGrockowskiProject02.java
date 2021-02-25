
/**
 * Write a description of class JeffGrockowskiProject02 here.
 *
 * @author Jeff Grockowski
 * @version 09/03/2019
 */

import java.util.Scanner;
import java.util.Random;
public class JeffGrockowskiProject02
{
    public static void main (String [] args) {
        
        System.out.println("This program calculates the coins in your change.");
        System.out.println("Please enter your change in cents");
        
        
        //Scanner input = new Scanner (System.in);
        //int cents = input.nextInt();
         
        
        Random rand = new Random();
        int cents = rand.nextInt(100);
        
        System.out.println(cents + " cents gives you: ");
        
        // divides the cents by the values of U.S. coin  largest to smallest
        System.out.println(cents / 25 + " Quarters");
        cents = cents % 25;
        
        System.out.println(cents / 10 + " Dimes");
        cents = cents % 10;
        
        System.out.println(cents / 5 + " Nickles");
        cents = cents % 5;
        
        System.out.println(cents + " Pennies");
        
        /* sample program output using random number generator:
         * 
         * This program calculates the coins in your change.
         * Please enter your change in cents
         * 33 cents gives you: 
         * 1 Quarters
         * 0 Dimes
         * 1 Nickles
         * 3 Pennies
         * 
         * Sample output using user input:
         * 
         *  This program calculates the coins in your change.
         *  Please enter your change in cents
         *  99
         *  99 cents gives you: 
         *  3 Quarters
         *  2 Dimes
         *  0 Nickles
         *  4 Pennies
         */
    }
}
