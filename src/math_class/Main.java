package math_class;

/**
 * https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/Math.html
 */

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //using math class which is a static class
        //static things (methods and variables) belong to the class rather than
        //objects (instance of the class)
        //we don't need to create an object since Math class is static
        // ClassName.methodName(); e.g. Math.random()
        // ClassName.staticVariableName(); e.g. Math.PI

        //double myPI = Math.round(Math.PI,2);
/*
        // abs
        int num1 = Math.abs(-2);
        System.out.println(num1);

        // pow
        double num2 = Math.pow(3,5);
        System.out.println(num2);

        // sqrt
        double num3 = Math.sqrt(36);
        System.out.println(num3);

        //create a random number in the range [0,1)
        double random1 = Math.random();
        System.out.println(random1);

        // create a random number in the range [0,n)
        double random2 = Math.random() * 20+1; // 20 sided dice from 0-19
        System.out.println((int)random2);

        // create a random number in the range [0,n]
        double random3 = Math.random() * 21; //*21 instead of *20+1
        System.out.println((int)random3);
 */
        //For Homework

        //for all of these I'm making m=6 and n=15
        int m = 6;
        int n = 15;
        // 2) create a random negative int in the range [m,n]
        int random4 = (int)(Math.random() * 10) + 6;
        System.out.println(random4);
        // 2) create a random negative int in the range [-m,0]
        int random5 = (int)(Math.random() * 7) - 6;
        System.out.println(random5);
        // 3) create a random negative int in the range [-m,-n]
        int random6 = (int)(Math.random() * 10) - 15;
        System.out.println(random6);
        // 4) create a random negative int in the range [-m,n)
        int random7 = (int)(Math.random() * 22) - 6;
        System.out.println(random7);


        //using the Random Class
        //This is not static so we have to create a Random object

        //create a Random object
        Random randObj = new Random();

        //get int with and without bound
        int randInt = randObj.nextInt();
        System.out.println(randInt);

        //with bound
        int randIntSmaller = randObj.nextInt(100);
        System.out.println(randIntSmaller);

        // get double
        double randDouble = randObj.nextDouble();
        System.out.println(randDouble);

        double randDouble2 = randObj.nextDouble()*50+50; //between 50 and 100





    }
}
