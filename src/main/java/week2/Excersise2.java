package week2;
//Create a program that asks the user for three numbers and then prints their sum.
import java.util.Scanner;

public class Excersise2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);
        int sum = 0;
        int read;
        System.out.println("Type the first number: ");
        read = Integer.parseInt(reader.nextLine());
        sum += read;

        System.out.println("Type the second number: ");
        read = Integer.parseInt(reader.nextLine());
        sum += read;

        System.out.println("Type the third number: ");
        read = Integer.parseInt(reader.nextLine());
        sum += read;

        System.out.println("Sum is: "+sum);

    }
}
