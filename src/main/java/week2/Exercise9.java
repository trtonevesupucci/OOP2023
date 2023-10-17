package week2;
//Modify the previously created starts piramid in a way that now you are not printing the
// starts but in each row numbers from 1 to the current row count.
import java.util.Scanner;
public class Exercise9 {
    public static void drawStarsPiramid(int rows){
        for (int i=1; i<=rows; i++){
            for (int j=1; j<= i; j++){
                System.out.print(j);

            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        drawStarsPiramid(5);
    }
}
//If we want the following output:
//1
//22
//333 ... we just print i instead of j

