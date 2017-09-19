package f17sept19;

import java.util.Scanner;

/**
 *
 * @author JWright
 */
public class WackyWeather {
    public static void main(String[] args)
    {
        //Prompt the user for the temperature outside
        System.out.print("What is the temperature outside? ");
        
        //read the information from the keyboard and store it in a variable
        Scanner keyboard = new Scanner(System.in);
        int temperature = keyboard.nextInt();
        
        //if it is above 30 outside - hit the beach - grab swim wear
        if (temperature > 30)
            System.out.printf("Hit the beach and grab some swim wear");
            
        //if it is between 20 and 30 - wear shorts and a tshirt
        if (temperature >= 20 && temperature <= 30)
            System.out.printf("%d ... hmmm... Wear shorts and tshirt%n", temperature);
        
        //if it is between 0-20 - wear a sweater
        if (temperature >= 0 && temperature < 20)
            System.out.printf("%d ... hmmm... Wear a sweater%n", temperature);
        
        //if it is less than 0 - put on a jacket  
        if (temperature < 0)
            System.out.printf("brr...put on a jacket%n");
            
    }
}
