package practice; //don't change this
import java.util.Scanner;

public class Unit3Practice {
    public static void main(String[] args) {
        //remove the // to run the methods
        //problemOne();
        problemTwo();
    }

    public static void problemOne(){
        System.out.println("Enter 3 numbers: ");
        Scanner numInput = new Scanner(System.in);
        int num1 = numInput.nextInt();
        int num2 = numInput.nextInt();
        int num3 = numInput.nextInt();
        if(num1>=num2 && num1>=num3) {
            if(num2>=num3) {
                System.out.println("Acending Order: " + num3 + ", " + num2 + ", " + num1);
                System.out.println("Decending Order: " + num1 + ", " + num2 + ", " + num3);
            } else {
                System.out.println("Acending Order: " + num2 + ", " + num3 + ", " + num1);
                System.out.println("Decending Order: " + num1 + ", " + num3 + ", " + num2);
            }
        } else if(num2>=num1 && num2>=num3) {
            if(num1>=num3) {
                System.out.println("Acending Order: " + num3 + ", " + num1 + ", " + num2);
                System.out.println("Decending Order: " + num2+ ", " + num1 + ", " + num3);
            } else {
                System.out.println("Acending Order: " + num1 + ", " + num3 + ", " + num2);
                System.out.println("Decending Order: " + num2 + ", " + num3 + ", " + num1);
            }
        } else {
            if(num1>=num2) {
                System.out.println("Acending Order: " + num3 + ", " + num1 + ", " + num2);
                System.out.println("Decending Order: " + num2 + ", " + num1 + ", " + num3);
            } else {
                System.out.println("Acending Order: " + num1 + ", " + num2 + ", " + num3);
                System.out.println("Decending Order: " + num3 + ", " + num2 + ", " + num1);
            }
        }
    }

    public static void problemTwo(){
        Scanner payInput = new Scanner(System.in);
        System.out.println("Enter the amount of hours you worked this week: ");
        double hours = payInput.nextDouble();
        System.out.println("Enter hourly pay: ");
        double pay = payInput.nextDouble();
        double paycheck;
        if(hours>40) {
            paycheck = 40 * pay + (hours-40) * (pay * 1.5);
        } else {
            paycheck = hours * pay;
        }
        System.out.printf("Paycheck: $%.2f", paycheck);
    }
}
