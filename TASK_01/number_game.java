package TASK_01;

// Lets make a number guessing game where the 'guess' is auto-generated.
import java.util.Random;
import java.util.Scanner;

public class number_game{
    public static void main(String[] args){
        Random random = new Random(); //creating an object of 'Random' class for generating a random number for guessing.
        Scanner scan = new Scanner(System.in);  // Creating an object of 'Scanner' class. It is used for taking input from the user.
    
        int final_guess = random.nextInt(100)+1; // Using the object declared of 'Random' class and generating a random number in range (1 to 100).

        // System.out.println(final_guess); // If you want to cheat xD

        int tries = 1; // Declaring a counter variable for storing number of tries user took to guess the number correctly. 
        while(true){ // Starting a while loop for implementing the central idea of this program.
            System.out.println("Enter the number you want to guess (between 1 to 100): ");
            int guess = scan.nextInt(); //Taking input number from the user and storing it in a variable 'guess'.
            if (guess<final_guess) { //Main logic of the program starts here...
            System.out.println("Wrong! Your guess is too low... Try Again");
            }
            else if (guess>final_guess) {
            System.out.println("Wrong! Your guess is too high... Try Again!");
            }
            else{
            System.out.println("Awesome! You guessed the number perfectly!");
            System.out.println("Congrulations! you guessed the number in "+ tries +" tries!");
                break; //break keyword to break-out from the loop once the correct number is guessed.
            }
            tries++; // Counting number of attempts user took to guess the number.
        }
        scan.close(); //Closing the object of 'Scanner' class.


     
    }

}
