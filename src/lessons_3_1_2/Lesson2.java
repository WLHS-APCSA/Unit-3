package lessons_3_1_2;
import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        // we only printed true/false before, but let's use those outputs
        // to change the flow of the program
        Scanner scan = new Scanner(System.in);
        // Ask a user for their favorite number
        System.out.println("Enter your favorite number: ");
        Scanner num = new Scanner(System.in);
        int favNum = num.nextInt();
        System.out.print("Enter your favorite number: >");
        int userNum = scan.nextInt();

        // if it is above 12, print "That's a large number!"
        // if it is 12 or lower, print "That's a small number"
        if(userNum > 12){
            System.out.println("That's a large number!");
        }

        if(userNum <= 12){
            System.out.println("That's an average-ish number.");
        }

        // alternative way of doing this

        if(userNum > 12){
            System.out.println("That's a large number!");
        }
        else{
            System.out.println("That's an average-ish number.");
        }
        if(favNum > 12){
            System.out.println("That's a large number!");
        }else{
            System.out.println("That's a small number.");
        }
        // Go to the rectangle class and implement the isSquare method
        // following the JavaDoc specs


    }
}
