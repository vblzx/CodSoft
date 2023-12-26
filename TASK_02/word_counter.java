package TASK_02;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class word_counter {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); // Creating an object of scanner class. 
        String enteredText = ""; //declaring a variable with empty string for now. 
        
        System.out.println("Welcome to a Java programmed word counter!!\nChoose an option from below."); // Introduction to the program.
        System.out.println("1. To count words from a file\n2. To count words from any text entered ");
        int option = scan.nextInt(); //Taking input choice from the user.
        scan.nextLine(); // Consuming the new line.

            switch(option){ //using switch case statement for enabling the user to choose any one option.
                case 1:
                    System.out.println("Enter the path of a file to count words from: ");
                    String path = scan.nextLine(); //taking file path as input.
                    try{
                        enteredText = readInputFrom(path); // Calling the readInputFrom method and storing it in the enteredText variable.
                    }
                    catch(Exception e){
                        e.printStackTrace();
                        return;
                    }
                    break;

                case 2:
                    System.out.println("Enter a text to count words from: ");
                    enteredText = scan.nextLine(); // Taking input text if user wants to count words from text entered.
                    break;

                default:
                    System.out.println("Entered option is Invalid! Try again...");
                    scan.close();
                    return;
            }

    int numberOfWords = wordCount(enteredText); // Counting the words with a function wordCount declared below.
    System.out.println("Total number of words are: "+numberOfWords);

    }   
    

    private static int wordCount(String enteredText) { //This function splits the words at white spaces, punctuation marks etc and stores them in an arry 'words'.
        String[] words= enteredText.split("[\\s.,;:!?(){}\\[\\]\"]+");
        return words.length; // Returns the number of splitted words in the array. Acts similar to a counter but we dont need to declare a separate variable for storing the number of words
    }

    private static String readInputFrom(String inputFile) throws FileNotFoundException { // This function is used for reading from a file.
        File fileobj = new File(inputFile);

        if (fileobj.exists()){
            StringBuilder sentences = new StringBuilder(); // StringBuilder acts as a buffer and temporarily stores the contents fron the file in an object.
            Scanner fileReader = new Scanner(fileobj); // This scans the fileobj from start to end.

            while(fileReader.hasNextLine()){
                sentences.append(fileReader.nextLine()).append("\n"); // Adding the words from object of Scanner class to object of StringBuilder Class.
            }
            fileReader.close();
        return sentences.toString();
        }
        else{
            return "";
        }
    }
}
