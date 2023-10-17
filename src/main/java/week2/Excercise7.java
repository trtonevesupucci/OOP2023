package week2;
//Create a method printStars that prints the given amount of stars and a line break
//Create the method in the following body:
public class Excercise7 {
    private static void printStar(int amount){
        for(int i=0; i<amount; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        printStar(5);
        printStar(3);
        printStar(9);
    }
}
