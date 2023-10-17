package week2;
//Create a program that asks the user for a password.
// If the password is right, a secret message is shown to the user.
import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "rijad123";
        String passAtt;
        boolean i = true;
        while(i){
            System.out.println("Enter the password: ");
            passAtt = reader.nextLine();
            if (!passAtt.equals(password)){
                System.out.println("Wrong!");
            }
            else if(passAtt.equals(password)){
                System.out.println("Right");
                System.out.println("The secret is: secret");
                i = false;
            }
        }
    }

}
