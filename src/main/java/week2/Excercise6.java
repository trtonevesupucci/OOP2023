package week2;
//Create a method printText that prints the following string of characters:
// "In the beginning there were the swamp, the hoe and Java." and a line break.
//Develop the program by adding the following feature:
// the main program should ask the user how many times the text should be printed
// (meaning how many times the method is called).
import java.util.Scanner;
public class Excercise6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How many times should the text be printed? ");
        int repetitions = Integer.parseInt(reader.nextLine());
        for (int i = 0; i< repetitions; i++){
            printText();
        }
    }
    public static void printText(){
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
}
