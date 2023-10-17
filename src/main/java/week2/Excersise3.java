package week2;
//Create a program that reads numbers from the user and prints their sum.
// The program should stop asking for numbers when the user enters the number 0.
import java.util.Scanner;
public class Excersise3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.println("Enter a number: ");
            int read = Integer.parseInt(reader.nextLine());

            if(read == 0){
                break;
            }
            sum += read;
            System.out.println("Sum now "+sum);

        }
        System.out.println("Sum in the end: "+sum);
    }
}
