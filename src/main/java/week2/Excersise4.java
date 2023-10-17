package week2;
//Create a program that asks the user for the first number and the last number
// and then prints all numbers between those two. Use a while loop.
import java.util.Scanner;
public class Excersise4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNum= Integer.parseInt(reader.nextLine());
        System.out.println("Enter second number");
        int secNum=Integer.parseInt(reader.nextLine());
        if (firstNum>secNum){
            System.out.println("First: "+firstNum);
            System.out.println("Second: "+secNum);
        }
        while(firstNum<=secNum){
            System.out.println(firstNum);
            firstNum++;
        }
    }

}
