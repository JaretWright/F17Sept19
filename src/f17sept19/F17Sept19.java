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
    }
    
}
