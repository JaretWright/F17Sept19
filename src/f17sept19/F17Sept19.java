package f17sept19;

import java.util.Scanner;


/**
 *
 * @author JWright
 */
public class F17Sept19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String myName;  //this reserves space in the computers' memory to store a String
                        //This String can be referenced by using the variable name myName
                        
        System.out.print("What is your name? ");
        
        //We need a way to read what the user types into the keyboard, so we instantiate 
        //a Scanner object
        Scanner keyboard = new Scanner(System.in);

        myName = keyboard.nextLine();
        
        System.out.printf("Glad to meet you %s%n", myName);
        
        int yearsExperience;  //define an int called yearsExperience
        
        //Prompt the user with the question "How many years experience programming do you have?"
        System.out.print("How many years experience programming do you have?");
        
        //Use the Scanner object called keyboard with the method nextInt() to update the variable 
        //yearsExperience
        yearsExperience = keyboard.nextInt();
        
        //Display the years of experience to the screen
        System.out.printf("Cool - you have %d years experience.%n", yearsExperience);
        
        System.out.print("Cool - you have " + yearsExperience + " years experience");
    }
    
}
