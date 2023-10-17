package week2;
//Create a method called drawStarsPiramid that will accept the number of rows as a parameter
// and print a half piramid shape where the number of rows will be dictated by the sent parameter.
import java.util.Scanner;
public class Excercise8 {
    public static void drawStarsPiramid(int rows){
        for (int i=0; i<=rows; i++){
            for (int j=1; j<= i; j++){
                System.out.print("*");

            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        drawStarsPiramid(5);
    }
}
//To make an inverted piramid shape we just reverse the first loop(for(int i=rows; i>=0; i--) loop
